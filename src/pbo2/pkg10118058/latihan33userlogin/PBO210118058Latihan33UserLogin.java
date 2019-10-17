/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan33userlogin;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class PBO210118058Latihan33UserLogin {
    
    private static String username;
    private static String password;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukan Username = ");
        username = scn.next();
        
        System.out.print("Masukan Password = ");
        password= scn.next();
        
        User cek =new User();
        cek.pengecekkanLogin(username,password);
        System.out.println();
        System.out.println("Developed by Satyaning Andaru Bawalaksana");
    }
    
}
