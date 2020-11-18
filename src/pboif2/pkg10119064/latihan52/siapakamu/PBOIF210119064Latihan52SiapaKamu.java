/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan52.siapakamu;

import model.Dosen;
import model.Mahasiswa;
import model.Manusia;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk mencari tau
 * apakah seorang dosen atau mahasiswa
 */
public class PBOIF210119064Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek dosen
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setMataKuliah("PBO");
        dosen.setUmur(27);
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println();
        
        //inisialisasi objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Nindi");
        mahasiswa.setKelas("PBO2");
        mahasiswa.setUmur(17);
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        
    }
    
}
