import java.util.Scanner;

public class Penggajian {
    public static void main(String  args[]){
        
        int menu;
            hitung hts = new hitung();
            System.out.println("              -----------------------\n------------------------------------------------------------");
            System.out.println("    SELAMAT DATANG DI PT. MULIA MANDIRI ");
            System.out.println("============================================================");
            do {
                System.out.println("-------------------------\n MENU GAJI KARYAWAN\n PT MULIA MANDIRI\n-------------------------");
                System.out.println(" 1. Memasukkan Data");
                System.out.println(" 2. Melihat Data");
                System.out.println(" 3. EXIT");
                System.out.println("========================");
                System.out.println("");
                Scanner pilih = new Scanner (System.in);
                System.out.print("Masukkan Pilihan Menu = ");
                menu = pilih.nextInt();
                System.out.println("");
               
                switch (menu){
                    case 1 : {
                        System.out.println("Menu - 1. Memasukkan Data");
                        hts.inputan();
                    }break;
                    case 2 : {
                        System.out.println("Menu - 2. Melihat Data ");
                        hts.lihatdata(hts.golongan);
                        hts.jamlembur();
                        hts.totalgaji();
                    }break;
                                 
                }
                }while (menu>0 && menu<3);
                System.out.println("===============================\n TERIMAKASIH dan Sukses Selalu\n Direktur Utama\n\n ttd.\n MULIA MANDIRI\n=============================== ");
           
    }
}

