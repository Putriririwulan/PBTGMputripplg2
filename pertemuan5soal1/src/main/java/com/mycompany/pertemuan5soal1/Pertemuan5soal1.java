/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5soal1;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pertemuan5soal1 {

    public static void main(String[] args) {
        
        // TODO code application logic here
 Scanner myInput = new Scanner(System.in);
 System.out.println("Masukan Nama Anda:");
 // String input
 String name = myInput.nextLine();
 // Numerical input
 System.out.println("Alamat Anda:");
 // String input
 String addres = myInput.nextLine();
 // Numerical input
 System.out.println("Masukan Usia Anda:");
 int age = myInput.nextInt();
 System.out.println("Masukan Gaji Anda:");
 double salary = myInput.nextDouble();
     // Output input by user
    System.out.println(" Nama : " + name);
    System.out.println("Usia: " + age);
    System.out.println("Gaji: " + salary);
  }
 }

