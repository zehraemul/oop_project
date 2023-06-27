/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zehra_oop;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author ZEHRABENGÜEMÜL
 */
public class alistirma implements Serializable{
    int a_min;
    int a_max;
    int b_min;
    int b_max;
    int n;
    
    
    int []a;
    int[]b;
    public alistirma(int a_min, int a_max, int b_min, int b_max,int n) {
        this.a_min = a_min;
        this.a_max = a_max;
        this.b_min = b_min;
        this.b_max = b_max;
        this.n=n;
        
        sorulariAyarla();
    }
//getter metodlar
    public int getA_min() {
        return a_min;
    }

    public int getA_max() {
        return a_max;
    }

    public int getB_min() {
        return b_min;
    }

    public int getB_max() {
        return b_max;
    }

    public int getN() {
        return n;
    }
    
       
    public void sorulariAyarla(){
        
        a=new int[n];
        b=new int[n];
        int aRand,bRand;
        
        for(int i=0;i<n;i++){
            Random rand=new Random();//hazir random fonksiyonu ile random degerleri üretiyorum.
            aRand=rand.nextInt(getA_max())+getA_min();//degiskene random degeri atadim.
            bRand=rand.nextInt(getB_max())+getB_min();//degiskene random degeri atadim.
            
            a[i]=aRand;//dizinin elemanina olusturulan rand deger ataniyor.
            b[i]=bRand;//dizinin elemanina olusturulan rand deger ataniyor.

        }
        
    }
    
    
}
