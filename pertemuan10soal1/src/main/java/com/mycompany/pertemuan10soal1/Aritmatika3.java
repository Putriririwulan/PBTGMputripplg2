/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10soal1;
/**
 *
 * @author LENOVO
 */
public class Aritmatika3 {
     // Metode untuk melakukan pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode untuk melakukan perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Metode untuk melakukan pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return (double) a / b;
    }

    // Metode untuk melakukan pangkat
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
}
}