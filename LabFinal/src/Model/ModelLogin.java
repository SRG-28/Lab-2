/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author sofia
 */
public class ModelLogin {
       public String getLogin() throws FileNotFoundException, IOException { 
        String login;
        try (BufferedReader reader = new BufferedReader( 
                new FileReader("Login.txt"))) { 
            StringBuilder string = new StringBuilder();
            String line = reader.readLine();
            while(line != null) {
                string.append(line);
                line = reader.readLine();
            }
            login = string.toString();
        } catch (Exception er) {
            login = er.getMessage();
        }
        return login;
    }
}
