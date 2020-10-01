

import java.util.*;

public class math {

    static double pitagoras(double a, double b){
        double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
        return c;
    }
    public static void main(String[] args) {
        //sorry my code in indonesian language
        boolean inti = true;
        while (inti) {
            
        Scanner inputuser = new Scanner(System.in);
        System.out.println("selamat datang di program rumus bangun math ");
        System.out.println("|================================================|");
        System.out.println("1. rumus luas dan keliling bangun datar");
        System.out.println("2. rumus volume dan luas alas bangun ruang");
        System.out.println("3. Phytagoras");
        System.out.println("4. mencari x1 x2 dari fungsi");
        int jawaban = inputuser.nextInt();
        if (jawaban == 1 ){
            System.out.println("selamat datang di program rumus bangun datar");
            System.out.println("|================================================|");
            System.out.println("1.Persegi");
            System.out.println("2.Persegi panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.trapesium");
            System.out.println("5.lingkaran");
            
            jawaban = inputuser.nextInt();
            if (jawaban == 1 ){
                int sisi;
                System.out.println("masukkan sisi persegi");
                sisi = inputuser.nextInt();
                System.out.println("maka luas nya = "+sisi*sisi);
                System.out.println("maka kelilingnya = "+sisi*4);
            }
            else if (jawaban == 2 ){
                int panjang;
                int lebar;
                
                System.out.println("masukkan panjang persegi panjang ");
                panjang = inputuser.nextInt();
                System.out.println("masukkan lebar persegi panjang ");
                lebar = inputuser.nextInt();
                int keliling = 2*(panjang + lebar);
                System.out.println("maka luas nya = "+panjang*lebar);
                System.out.println("maka kelilingnya = "+keliling);
            }
            else if (jawaban == 3 ){
                int alas;
                int simir;
                int tinggi;
                
                System.out.println("masukkan alas segitiga ");
                alas = inputuser.nextInt();
                System.out.println("masukkan simir segitiga ");
                simir = inputuser.nextInt();
                System.out.println("masukkan tinggi segitiga ");
                tinggi = inputuser.nextInt();
                
                System.out.println("maka luas nya = "+alas*tinggi/2);
                System.out.println("maka kelilingnya = "+(alas + simir + tinggi));
            }
            else if (jawaban == 4 ){
                int atas;
                int simir;
                int bawah;
                int tinggi;
                
                System.out.println("masukkan sisi atas trapesium ");
                atas = inputuser.nextInt();
                System.out.println("masukkan simir trapesium  ");
                simir = inputuser.nextInt();
                System.out.println("masukkan tinggi trapesium ");
                tinggi = inputuser.nextInt();
                System.out.println("masukkan sisi bawah trapesium ");
                bawah = inputuser.nextInt();

                System.out.println("maka luas nya = "+(atas+bawah)*tinggi/2);
                System.out.println("maka kelilingnya = "+(atas + (2*simir) + bawah));
            }
            else if (jawaban == 5 ){
                int r ;
            
                
                System.out.println("masukkan jari-jari lingkaran ");
                r = inputuser.nextInt();
    
                if (r%7 == 0 ){
                  
                System.out.println("maka luas nya = "+22*r*r/7);
                System.out.println("maka kelilingnya = "+22*2*r/7);
                }
                else if (r%7 > 0 ){
                    float phi = 3.14f;
                 System.out.println("maka luas nya = "+phi*r*r);
                 System.out.println("maka kelilingnya = "+phi*(2*r));
                 }
            }
        }

        else if (jawaban == 2 ){
            System.out.println("selamat datang di program rumus bangun ruang");
            System.out.println("|================================================|");
            System.out.println("1.Bola ");
            System.out.println("2.kerucut");
            System.out.println("3.tabung");
            
            jawaban = inputuser.nextInt();
            if (jawaban == 1 ){
               
                int r ;
            
                
                System.out.println("masukkan jari-jari bola ");
                r = inputuser.nextInt();
    
                if (r%7 == 0 ){
              
                System.out.println("maka volume nya = "+4/3*22*r*r*r/7);
                System.out.println("maka LS nya = "+4*22*r*r/7);
                }
                else if (r%7 > 0 ){
                    float phi = 3.14f;
                System.out.println("maka Volume nya = "+4/3*phi*r*r*r);
                System.out.println("maka LS nya = "+4*phi*r*r);
                 }
            }

            else if (jawaban == 2){
                int r ;
                int s ;
                int t ;
                
                System.out.println("masukkan jari-jari kerucut ");
                r = inputuser.nextInt();
                System.out.println("masukkan garis pelukis kerucut ");
                s = inputuser.nextInt();
                System.out.println("masukkan tinggi kerucut ");
                t = inputuser.nextInt();

                if (r%7 == 0 ){
                   
                System.out.println("maka Volume nya = "+22/7*r*r*t/3);
                System.out.println("maka LS nya = "+22/7*r*(r+s));
                }
                else if (r%7 > 0 ){
                    float phi = 3.14f;
                System.out.println("maka Volume nya = "+phi*r*r*t/3);
                System.out.println("maka LS nya = "+phi*r*(r+s));
                 }
            }

            else if (jawaban == 3){
               
                int r ;
                int t ;
            
                
                System.out.println("masukkan jari-jari tabung ");
                r = inputuser.nextInt();
                System.out.println("masukkan tinggi tabung ");
                t = inputuser.nextInt();

                if (r%7 == 0 ){
                   ;
                System.out.println("maka volume nya = "+2*22*r*r*t/7);
                System.out.println("maka LS nya = "+2*22*r*t/7+2*22*r*r/7);
                }
                else if (r%7 > 0 ){
                    float phi = 3.14f;
                System.out.println("maka volume nya = "+2*phi*r*r*t);
                System.out.println("maka LS nya = "+2*phi*r*t+2*phi*r*r);
                 } 
            }
        
        
        }
        else if ( jawaban == 3 ){
           System.out.println("1. Sm ? yang dicari simirnya ");
           System.out.println("2. t ? yang dicari tingginya ");
            System.out.println("3. a ? yang dicari alasnya ");
            jawaban = inputuser.nextInt();
            
            if (jawaban==1){
                double alas ;
                double tinggi ;
                System.out.print("masukkan alas = ");
                alas  = inputuser.nextDouble();
                System.out.print("masukkan tinggi = ");
                tinggi = inputuser.nextDouble();
                // menggunakan atau pemanggilan fungsi pitagoras
                double c = pitagoras(alas, tinggi);
        
                System.out.println(" maka simir nya c = " + c);
            }
            else if (jawaban==2){
                double simir ;
                double alas ;
                System.out.print("masukkan simir = ");
                simir  = inputuser.nextDouble();
                System.out.print("masukkan alas = ");
                alas = inputuser.nextDouble();
                // menggunakan atau pemanggilan fungsi pitagoras
              double c = Math.sqrt( Math.pow(simir,2) - Math.pow(alas,2) );
              System.out.println(" maka tingginya adalah c = "+c);
            }
            else if (jawaban==3){
                double simir ;
                double tinggi ;
                System.out.print("masukkan simir = ");
                simir  = inputuser.nextDouble();
                System.out.print("masukkan tinggi = ");
                tinggi = inputuser.nextDouble();
                // menggunakan atau pemanggilan fungsi pitagoras
                double c = Math.sqrt( Math.pow(simir,2) - Math.pow(tinggi,2) );
                System.out.println(" maka simir nya c = " + c);
            }


        
        
        }

        else if (jawaban == 4 ){
            System.out.println("masukkan a dari rumus fungsi ");
            double a = inputuser.nextDouble();
            System.out.println("masukkan b dari rumus fungsi ");
            double b = inputuser.nextDouble();
            System.out.println("masukkan c dari rumus fungsi ");
            double c = inputuser.nextDouble();
            double rumus = Math.sqrt((Math.pow(b, 2))-(4*a*c));

            double x1 = (-b + rumus)/2*a;
            double x2 = (-b - rumus)/2*a;
            
            System.out.println("X1 = "+x1);
            System.out.println("X2 = "+x2);
        }
    
        System.out.println("mau melanjutkan atau mau exit (y/n)");
        char akhir;
        akhir = inputuser.next().charAt(0);
        if (akhir == 'y' || akhir =='Y'){
            inti = true ;
        }
        else if (akhir == 'n' || akhir == 'N'){
            inti = false;
        }
    }

    }
}