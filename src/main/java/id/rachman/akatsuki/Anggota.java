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
 * Deskripsi Program : program ini berisi class Akatsuki yang merupakan child class
 *                     dari class Akatsuki
 */

public class Anggota extends Akatsuki {
    private String cincin;
    
    public Anggota(String nama, String desa, String cincin) {
        super(nama, desa);
        this.cincin = cincin;
    }

    public String getCincin() {
        return cincin;
    }
    
    @Override
    public void siapaSaya() {
        super.siapaSaya();
        System.out.println("Cincin : ".concat(cincin).concat("\n"));
    }
}