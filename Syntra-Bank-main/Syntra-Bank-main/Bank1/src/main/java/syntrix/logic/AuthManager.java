/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package syntrix.logic;

//START OF IMPORT
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//END OF IMPORT


public class AuthManager {

    //Predefined set of values, can't add another UserRole using an Enum type class
    public enum UserRole {      
        ADMIN,
        STANDARD_USER,
        INVALID_CREDENTIALS
    }
    
    private static final String DATA_FILE = "src/main/java/syntrix/data/users.txt";
    private static final String APP_FILE = "src/main/java/syntrix/data/aplications.txt";
    
    public UserRole authenticate(String username, String password) {
                
        try {
            File file = new File(DATA_FILE);
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
                
                //Makes sure a line has 3 parts (username, password, role)
                if (parts.length == 3) {
                    String fileUsername = parts[0].trim();
                    String filePassword = parts[1].trim();
                    String fileRole = parts[2].trim();
                    
                    if (username.equals(fileUsername) && password.equals(filePassword)) {
                        
                        if(fileRole.equals("ADMIN")) {
                            scanner.close();
                            return UserRole.ADMIN;
                        } else if(fileRole.equals("STANDARD_USER")) {
                            scanner.close();
                            return UserRole.STANDARD_USER;
                        }
                    }
                }
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: User data file not found: " + DATA_FILE);    //err allows printing of error messages
            e.printStackTrace();
            return UserRole.INVALID_CREDENTIALS;
            
        } return UserRole.INVALID_CREDENTIALS;
    }
    
    public boolean registerUser(String username, String password, String email, String role) {
        
        //Prevents duplication of users or list of application to be users
        if (isUserExist(username) || isApplicationExist(username)) {
            System.out.println("User already exists.");
            return false;
        }
        
        //the filewriter simply apends, meaning it adds
        //if false, it will delete the whole file and write only this user, don't change pleek
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(APP_FILE, true))) {
            //Format: username,email,role,password
            String line = username + "," + email + "," + role + "," + password;
            
            writer.newLine();
            writer.write(line);
            
            return true;
            
        } catch(IOException e) {
            e.printStackTrace();
            return false;
        }
            
    }
    
    
    //Gets all current applications for the table in Admin Dashboard
    public java.util.ArrayList<String[]> getPendingApplications() {
        java.util.ArrayList<String[]> apps = new java.util.ArrayList<>();
        
        try {
            java.io.File file = new java.io.File(APP_FILE);
            if (!file.exists()) return apps;
            
            java.util.Scanner scanner = new java.util.Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();      //Might need to trim, might be a source of a bug/malfunction
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    //Format: username,email,role,password
                    apps.add(parts);
                }
            } 
            scanner.close();
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
        return apps;
    }
    
    public boolean approveUser(String username, String password, String email, String role) {
        
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(DATA_FILE, true))) {
            writer.newLine();
            writer.write(username + "," + password + "," + role);
        } catch (java.io.IOException e) {
            return false;
        }
        
        return deleteApplication(username);
    }
    
    public boolean deleteApplication(String usernameToRemove) {
        java.io.File inputFile = new java.io.File(APP_FILE);
        java.io.File tempFile = new java.io.File("application_temp.txt");
        
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(inputFile)); 
             java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(tempFile))) {
            
            String currentLine;
            
            while((currentLine = reader.readLine()) != null) {
                if(currentLine.isEmpty()) continue;
                
                String[] parts = currentLine.split(",");
                
                if(!parts[0].equals(usernameToRemove)) {
                    writer.write(currentLine);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        
        if(inputFile.delete()) {
            return tempFile.renameTo(inputFile);
        }
        return false;
    }
    
    private boolean isUserExist(String usernameToCheck) {
        
        try {
            File file = new File(DATA_FILE);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    String existingUsername = parts[0].trim();
                    if (existingUsername.equalsIgnoreCase(usernameToCheck)) {
                        scanner.close();
                        return true;
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            return false;
        }
        return false;   
    
    }
    
    private boolean isApplicationExist(String usernameToCheck) {
        
        try {
            File file = new File(APP_FILE);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    String existingUsername = parts[0].trim();
                    if (existingUsername.equalsIgnoreCase(usernameToCheck)) {
                        scanner.close();
                        return true;
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            return false;
        }
        return false;
    }
}
