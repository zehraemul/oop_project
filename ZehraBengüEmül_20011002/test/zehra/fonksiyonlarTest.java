/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package zehra;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import zehra_oop.alistirma;
import zehra_oop.children;
import zehra_oop.fonksiyonlar;
import static org.junit.Assert.*;

/**
 *
 * @author ZEHRABENGÜEMÜL
 */
public class fonksiyonlarTest {
    
    public fonksiyonlarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveChildren method, of class fonksiyonlar.
     */
    @Test
    public void testSaveChildren() {
        
        System.out.println("saveChildren");
      List<children> children = new ArrayList<>();
      children chd = new children("zehraemul", "findik", 1);
      children.add(chd);
     try{
          fonksiyonlar.saveChildren(children, "children2.ser");}catch(HeadlessException em){
          fail("The test case is a prototype.");}


      // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of loadChildren method, of class fonksiyonlar.
     */
    @Test
    public void testLoadChildren() {
      System.out.println("saveChildren");
      List<children> children = new ArrayList<>();
      children chd = new children("zehraemul", "findik", 2);
      children.add(chd);
      fonksiyonlar.saveChildren(children, "children2.ser");
      List<children> result = fonksiyonlar.loadChildren("children2.ser");
      assertEquals(chd.getKullanici_adi(),result.get(0).getKullanici_adi());// TODO review the generated test code and remove the default call to fail.//fail("The test case is a prototype.");}
    }

    /**
     * Test of saveExercises method, of class fonksiyonlar.
     */
    @Test
    public void testSaveExercises() {
       System.out.println("saveExercises");
     List<alistirma> als = new ArrayList<>();
      alistirma all = new alistirma(1,10,2,20,4);
      als.add(all);
     try{
          fonksiyonlar.saveExercises(als, "alistirma2.ser");}catch(HeadlessException em){
          fail("The test case is a prototype.");}
    }

    /**
     * Test of loadExercises method, of class fonksiyonlar.
     */
    @Test
    public void testLoadExercises() {
        System.out.println("loadExercises");
     List<alistirma> ast = new ArrayList<>();
      alistirma ass = new alistirma(2,10,3,20,5);
      ast.add(ass);
      fonksiyonlar.saveExercises(ast, "alistirma2.ser");
      List<alistirma> result = fonksiyonlar.loadExercises("alistirma2.ser");
      assertEquals(ast.get(0).getN(),result.get(0).getN());// TODO review the generated test code and remove the default call to fail.//fail("The test case is a prototype.");}
    // TODO review the generated test code and remove the default call to fail.//fail("The test case is a prototype.");}
    }
    
}
