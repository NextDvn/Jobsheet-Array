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
public class ProgramPembayaranTagihanListrik {
        public static void main(String[] args) {
            
            //Deklarasi
            int kWh;
            int biaya;
            Double Total;
            
            //Scanner
            Scanner pembaca = new Scanner(System.in);
            
            //input
            System.out.println("~Program Pembayaran Tagihan Listrik~");
            System.out.print("Input jumlah kWh dalam 1 bulan:");
            kWh = pembaca.nextInt();
            
            //Golongan A/B/C
            System.out.println("\n~Biaya (tanpa pajak)~");
            if(kWh <= 450) {
                System.out.println("Selamat anda masuk golongan C(Anak kost)");
                biaya = 20000 + (1000 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                System.out.println("\n~Biaya total~");
                Total = Double.valueOf(biaya + (biaya * 10/100));
                System.out.println("Biaya total: " + Total);
                
            } else if(kWh <=900) { 
                System.out.println("Selamat anda masuk golongan B(Uang minta ortu)");
                biaya = 35000 + (2500 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                System.out.println("\n~Biaya total~");
                Total = Double.valueOf(biaya + (biaya * 15/100));
                System.out.println("Biaya total: " + Total);
                
            } else if(kWh <1200) {
                System.out.println("Selamat anda masuk golongan A(Kost elite)");
                biaya = 50000 + (3000 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                System.out.println("\n~Biaya total~");
                Total = Double.valueOf(biaya + (biaya * 20/100));
                System.out.println("Biaya total: " + Total);
                
            } else
                System.out.println("Maaf stok 1200+ sudah habis :(");
            
            
            
           
        }
    
}
