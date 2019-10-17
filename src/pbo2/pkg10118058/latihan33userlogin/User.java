/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan33userlogin;

/**
 *
 * @author user
 */
public class User {
    private static String username;
    private static String password;
    private boolean statusAkun;

    private boolean cekAkun(String parusername, String parpassword){
        
        username="RizkiAdam";
        password="terbaikselalu";        
        if(parusername.equals(username)&& parpassword.equals(password)){
            statusAkun=true;
        
        } else {
            statusAkun=false;
        }
        return statusAkun;
        
    }
    
    private void hasilLogin(boolean status,String parUsername){
    
        if (status==true){
            
            System.out.println("\n*****Halo "+parUsername.toUpperCase()+"*****");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else{
            System.out.println("\n Ooops , Username atau Password anda salah");
        }
    
    }
    public void pengecekkanLogin(String parusername, String parpassword){
    
        cekAkun(parusername,parpassword);
        hasilLogin(statusAkun,parusername);
    }
}
