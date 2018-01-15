/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi;

import javax.swing.JRootPane;
import penjadwalanpribadi.view.Login;


/**
 *
 * @author Sys5
 */
public class PenjadwalanPribadi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Login ob = new Login();
       ob.setDefaultCloseOperation(ob.EXIT_ON_CLOSE);
       ob.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
       ob.setVisible(true);
    }
    
}
