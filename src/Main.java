/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,toplam =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        sayi = scanner.nextInt();
        
        for(int i=1;i<=sayi/2;i++){
            if(sayi%i ==0){
                toplam += i;
            }
        }
       if(toplam ==sayi){
           System.out.println(sayi + " sayısı mükemmel sayıdır.");
       } 
        
       
       else{
                      System.out.println(sayi + " sayısı mükemmel sayı değildir.");

       }
    }
}
