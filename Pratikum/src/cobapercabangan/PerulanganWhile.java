/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobapercabangan;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class PerulanganWhile {
    public static void main(String[] args) {
        
        //deklarasi
        boolean nggeh = true;
        int ngegad = 0;
        String jawaban;
        
        //scanner
        Scanner uye = new Scanner(System.in);
        
        //proses
        while(nggeh){
            System.out.println("Mau makan?");
            System.out.print("(Jawab Y/terserah)");

            jawaban = uye.nextLine();
            
        //dicek
        if(jawaban.equalsIgnoreCase("Y")){
            nggeh = false;
            ngegad++;
        }
        
        
        
            
        }
        System.out.println("Anda sudah membuat kami retard selama " + ngegad + "x");
    }
}
