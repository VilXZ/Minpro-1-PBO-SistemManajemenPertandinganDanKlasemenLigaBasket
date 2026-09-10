/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apakah;

/**
 *
 * @author kidst
 */

public class Pertandingan {

    private int idPertandingan;
    private String tanggal;
    private String lokasi;
    private String timKandang;
    private String timTandang;
    private String status;
    
    public Pertandingan(int idPertandingan, String tanggal, String lokasi,
                        String timKandang, String timTandang, String status) {

        this.idPertandingan = idPertandingan;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.timKandang = timKandang;
        this.timTandang = timTandang;
        this.status = status;
    }
    
    public int getIdPertandingan() {
        return idPertandingan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getTimKandang() {
        return timKandang;
    }

    public String getTimTandang() {
        return timTandang;
    }

    public String getStatus() {
        return status;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setTimKandang(String timKandang) {
        this.timKandang = timKandang;
    }

    public void setTimTandang(String timTandang) {
        this.timTandang = timTandang;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}