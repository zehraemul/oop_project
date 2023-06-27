/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zehra_oop;

import java.io.Serializable;

/**
 *
 * @author ZEHRABENGÜEMÜL
 */
public class children implements Serializable{
    
    String kullanici_adi;
    String sifre;
    int id;

    public children(String kullanici_adi, String sifre, int id) {
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
        this.id = id;
    }
//getter metodlar
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public int getId() {
        return id;
    }
    
    
    
}
