/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi.temp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sys5
 */
public class writeText {
    public void tulis(String text){
        try {
            PrintWriter writer = new PrintWriter("session.txt", "UTF-8");
            writer.print(text);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(writeText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(writeText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void tulis(int text){
        try {
            PrintWriter writer = new PrintWriter("session.txt", "UTF-8");
            writer.print(text);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(writeText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(writeText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getsession(){
        FileReader fr;
        try {
            fr = new FileReader("session.txt");
            BufferedReader reader = new BufferedReader(fr);
            return reader.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(writeText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(writeText.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
