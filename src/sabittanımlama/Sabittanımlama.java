/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabittanımlama;
import java.util.Scanner;
//kütüphane ekledik
public class Sabittanımlama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double PI = 3.14159;
       
       //sabit tanımlaması yapıyoruz PI sabiti büyük harfle yazılır . Tüm harfler büyük harfle yazılır .
        
        Scanner giris = new Scanner(System.in);
        //kullanıcı girişi için 
        System.out.print("yaricap için bir değer girin:");
        double yaricap = giris.nextDouble();
        
        double alan = yaricap*yaricap*PI;
        
        System.out.println("Yarıçap çemberinin yariçapı ve alanı : " + yaricap + " ve " + alan);
        
    }
    
}
