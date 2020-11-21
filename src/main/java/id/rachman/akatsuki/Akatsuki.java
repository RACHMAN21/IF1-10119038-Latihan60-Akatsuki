/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.akatsuki;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Akatsuki yang merupakan parent class
 * 
 */

public class Akatsuki {
   protected String nama, desa;

   public Akatsuki(String nama, String desa) {
       this.nama = nama;
       this.desa = desa;
   }

   public String getNama() {
       return nama;
   }

   public String getDesa() {
       return desa;
   }
   
   public void siapaSaya() {
       System.out.println("Anggota Akatsuki");
       System.out.println("Nama : ".concat(nama));
       System.out.println("Desa : ".concat(desa));
   }
}