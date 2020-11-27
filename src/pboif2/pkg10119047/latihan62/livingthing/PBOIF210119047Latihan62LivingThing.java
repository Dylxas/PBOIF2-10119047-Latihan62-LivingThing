/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan62.livingthing;

import data.Human;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MAKHLUK HIDUP
 */

public class PBOIF210119047Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human human = new Human();
        
        human.setNama("Aldy");
        
        human.walk(human.getNama());
        
        human.breath(human.getNama());
        
        human.eat(human.getNama());
        
    }
    
}
