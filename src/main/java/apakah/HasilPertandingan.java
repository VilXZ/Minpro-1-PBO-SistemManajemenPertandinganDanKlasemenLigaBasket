/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apakah;

/**
 *
 * @author kidst
 */
public class HasilPertandingan {

    private int idHasil;
    private int idPertandingan;
    private int skorKandang;
    private int skorTandang;
    private String pemenang;
    
    public HasilPertandingan(int idHasil, int idPertandingan,
                             int skorKandang, int skorTandang,
                             String pemenang) {

        this.idHasil = idHasil;
        this.idPertandingan = idPertandingan;
        this.skorKandang = skorKandang;
        this.skorTandang = skorTandang;
        this.pemenang = pemenang;
    }
    
    public int getIdHasil() {
        return idHasil;
    }

    public int getIdPertandingan() {
        return idPertandingan;
    }

    public int getSkorKandang() {
        return skorKandang;
    }

    public int getSkorTandang() {
        return skorTandang;
    }

    public String getPemenang() {
        return pemenang;
    }
    
    public void setSkorKandang(int skorKandang) {
        this.skorKandang = skorKandang;
    }

    public void setSkorTandang(int skorTandang) {
        this.skorTandang = skorTandang;
    }

    public void setPemenang(String pemenang) {
        this.pemenang = pemenang;
    }
}