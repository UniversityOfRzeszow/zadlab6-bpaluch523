/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;
import java.util.Scanner;
/**
 *
 * @author Bartek
 */
public class Complex {
    
    double rz;
    double ur;
    
    public static double modul(double rz,double ur){
        return Math.sqrt(Math.pow(rz,2)+Math.pow(ur,2));
    }
    
    public static double sprzezenie(double ur){
        ur=-ur;
        return ur;
    }
    
    public static double AlgNaWyk(double rz,double ur){
        double sin=ur/modul(rz,ur);
        return Math.asin(sin);
    }
   
    public static String sumaAlg(double rz1,double ur1,double rz2,double ur2){
        double rz=rz1+rz2;
        double ur=ur1+ur2;
        String s=rz+"+("+ur+")i";
        return s;
    }
    
    public static String roznicaAlg(double rz1,double ur1,double rz2,double ur2){
        double rz=rz1-rz2;
        double ur=ur1-ur2;
        String s=rz+"+("+ur+")i";
        return s;
    }
    
    public static String iloczynAlg(double rz1,double ur1,double rz2,double ur2){
        double rz=(rz1*rz2)-(ur1*ur2);
        double ur=(ur1*rz2)+(ur2*rz1);
        String s=rz+"+("+ur+")i";
        return s;
    }
    
    public static String ilorazAlg(double rz1,double ur1,double rz2,double ur2){
        double rz=(rz1*rz2+ur1*ur2)/(Math.pow(rz1,2)+Math.pow(ur2,2));
        double ur=(ur1*rz2-rz1*ur2)/(Math.pow(rz1,2)+Math.pow(ur2,2));
        String s=rz+"+("+ur+")i";
        return s;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Podaj rzeczywista wartosc pierwszej liczby zespolonej: ");
        double a=input.nextDouble();
        System.out.println("Podaj urojona wartosc pierwszej liczby zespolonej: ");
        double b=input.nextDouble();
        System.out.println("Podaj rzeczywista wartosc drugiej liczby zespolonej: ");
        double c=input.nextDouble();
        System.out.println("Podaj urojona wartosc drugiej liczby zespolonej: ");
        double d=input.nextDouble();
        System.out.println("Modul pierwszej liczby zespolonej: "+Complex.modul(a,b));
        System.out.println("Sprzezenie pierwszej liczby zespolonej: "+a+"+("+Complex.sprzezenie(b)+")i");
        System.out.println("Postać wykładnicza pierwszej liczby zespolonej: "+Complex.modul(a,b)+"*e^"+Complex.AlgNaWyk(a,b)+"i");
        System.out.println("Suma pierwszej i drugiej liczby zespolonej: "+Complex.sumaAlg(a,b,c,d));
        System.out.println("Roznica pierwszej i drugiej liczby zespolonej: "+Complex.roznicaAlg(a,b,c,d));
        System.out.println("Iloczyn pierwszej i drugiej liczby zespolonej: "+Complex.iloczynAlg(a,b,c,d));
        System.out.println("Iloraz pierwszej i drugiej liczby zespolonej: "+Complex.ilorazAlg(a,b,c,d));
    }
    
}