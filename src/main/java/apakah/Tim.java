/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apakah;

import java.util.ArrayList;

/**
 *
 * @author kidst
 */

public class Tim {

    private int idTim;
    private String namaTim;
    private String kota;
    private String pelatih;
    
    public Tim(int idTim, String namaTim, String kota, String pelatih) {
        this.idTim = idTim;
        this.namaTim = namaTim;
        this.kota = kota;
        this.pelatih = pelatih;
    }
    
    public int getIdTim() {
        return idTim;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public String getKota() {
        return kota;
    }

    public String getPelatih() {
        return pelatih;
    }
    
    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setPelatih(String pelatih) {
        this.pelatih = pelatih;
    }
}
