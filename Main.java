
package javaapplication4;
import java.util.Scanner;

public class Main{
    public static void main (String []args){
    
    Scanner scan = new Scanner(System.in);
    
    
    insan i1 = new insan();
    insan i2= new insan();
    bisiklet x1=new bisiklet();
    i1.setIsim("Ahmet");
    i1.setSoyad("Kara");
    i1.setYas(23);
    
    i2.setIsim("Mehmet");
    i2.setSoyad("Yılmaz");
    i2.setYas(45);
    
    
    System.out.println("Merhaba "+i1.getIsim()+" "+i1.getSoyad()+" yaşınız "+i1.getYas());
    
    System.out.println("Merhaba "+i2.getIsim()+" "+i2.getSoyad()+" yaşınız "+i2.getYas());
    
     x1.bin(i1);
    
    
    
    }
    }

    

