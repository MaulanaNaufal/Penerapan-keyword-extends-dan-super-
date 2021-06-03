/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author MOKLET-1
 */
public class PenerapanExtends extends hewan{
    
    String nama = "Beruang";
    int berat = 100;
    
    public static void main(String[] args){
        karnivora data = new karnivora();
        System.out.println("Nama Hewan: "+data.getnama());
        System.out.println("Berat Hewan: "+data.getberat());
    }
    
    String getnama(){
        return nama;
    }
    int getberat(){
        return berat;
    }
}