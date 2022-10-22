import java.util.Scanner;
public class hitung {
    public int jamkerja=0, golongan = 0, jamlembur=0;
    public String nama;
    public double totalgaji =0,gajitetap =0, gajilembur=0, gajiperjam=0;

    //method inputan
    public void inputan(){
    Scanner data = new Scanner(System.in);
    System.out.print("Masukkan nama Karyawan   : ");
    nama = data.nextLine();
    Scanner data1 = new Scanner (System.in);
    System.out.print("Masukkan Golongan        : ");
    golongan = data1.nextInt();
    Scanner data2 = new Scanner (System.in);
    System.out.print("Masukkan jam kerja       : ");
    jamkerja = data2.nextInt();
    System.out.print("");      
    }

    //method lhatdata
    public void lihatdata(int a){
        if (golongan==1){
            gajitetap=500000;
            gajiperjam=5000;
        }
        else if (golongan==2){
            gajitetap=300000;
            gajiperjam=3000;
        }
        else if (golongan==3){
            gajitetap=250000;
            gajiperjam=2000;
        }
        else if (golongan==4){
            gajitetap=100000;
            gajiperjam=1500;
        }
        else if (golongan==5){
            gajitetap=50000;
            gajiperjam=1000;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n              RINCIAN GAJI KARYAWAN              \n               Bernama "+nama+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Gaji tetap karyawan adalah Rp. "+gajitetap);
        System.out.println("Gaji perjamnya      = Rp. "+gajiperjam);
        System.out.println("Jumlah jam kerjanya = "+jamkerja+" jam");

    }
    
    public void jamlembur(){
        if (jamkerja>150){
            jamlembur=jamkerja-150;
            gajilembur=(double) (jamlembur*1.5*gajiperjam);
            System.out.println("Jumlah jam lembur   = "+jamlembur+" jam");
            System.out.println("Jumlah Gaji lembur  = Rp. "+gajilembur);
        }
        else{
            System.out.println("Jumlah jam lembur   = 0 jam");
            System.out.println("Jumlah Gaji lembur  = Rp. 0");  
        } 
    }

    public double totalgaji(){
        totalgaji=gajitetap+gajilembur;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("TOTAL GAJI KARYAWAN bernama "+nama+" adalah Rp. "+totalgaji);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return totalgaji;
    }
}
