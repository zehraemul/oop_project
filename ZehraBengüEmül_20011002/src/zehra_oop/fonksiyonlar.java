/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zehra_oop;

/**
 *
 * @author ZEHRABENGÜEMÜL
 */

//kutuphaneleri dahil ediyorum.

import zehra_oop.children;
import zehra_oop.alistirma;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import zehra_oop.alistirma;
import zehra_oop.children;


public class fonksiyonlar {
    
    //cocuklari dosyaya kaydetme metodu
    public static void saveChildren(List<children> children, String path) {
        try (FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(children);//cocuklari dosyaya yazzdirma metodu
        } catch (IOException e) {
            System.out.println("Cocuk kaydi hata!");
            e.printStackTrace();
        }
    }
//dosyadan cocuklari yüklemek icin kullanılan metod
    public static List<children> loadChildren(String path) {
        List<children> chd = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            chd = (List<children>) objectIn.readObject();
          /*  for(children ch : chd){
                lastChild = ch.getId();
            }*/
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Cocuk yukleme hata!");//error mesaji
            e.printStackTrace();
        }
        return chd;
    }
//egzersizleri dosyaya kaydetmek icin olusturdugum metod
    public static void saveExercises(List<alistirma> exercises, String path) {
        try (FileOutputStream fileOut = new FileOutputStream(path);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(exercises);//egzersizleri dosyaya yazma
        } catch (IOException e) {
            System.out.println("Egzersiz kaydi hata!");//error mesaji
            e.printStackTrace();
        }
    }
//ezgersizleri dosyadan yuklemek icin kullanilan metod
    public static List<alistirma> loadExercises(String path) {
        List<alistirma> exercises = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            exercises = (List<alistirma>) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Egzersiz yukleme hata!");
            e.printStackTrace();
        }
        return exercises;
    }
    
    
}
