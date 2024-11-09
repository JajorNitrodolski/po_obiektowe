import java.lang.Math;
import java.util.*;

public class Main{
    public static double[] generujZakres(int n, int minWartosc, int maxWartosc){
        double[] tab = new double[n];
        double skok = (maxWartosc-minWartosc)/(n-1.0);
        tab[0]=minWartosc;
        for(int i=1; i<tab.length; i++) tab[i]=tab[i-1]+skok;
        return tab;
    }
    public static double[] funkcjaSignum(double[] tab){
        for(int i=0; i<tab.length; i++){
            if(tab[i]>0) tab[i]=1;
            else if (tab[i]<0) tab[i]=-1;
            else if (tab[i]==0) tab[i]=0;
        }
        return tab;
    }
    public static double[] funkcjaWykladnicza(double[] tab, double a){
        for(int i=0; i<tab.length; i++) tab[i]=Math.pow(a, tab[i]);
        return tab;
    }
    public static double[] funkcjaKwadratowa(double[] tab, double a, double b, double c){
        for(int i=0; i<tab.length; i++) tab[i]=a*Math.pow(tab[i],2)+b*tab[i]+c;
        return tab;
    }
    public static double[] funkcjaLiniowa(double[] tab, double a, double b){
        for(int i=0; i<tab.length; i++) tab[i]=a*tab[i]+b;
        return tab;
    }
    public static double sredniaGeometryczna(int[] tab){
        double sum = 1;
        for(int i=0; i<tab.length; i++) sum*=tab[i];
        return Math.pow(sum, 1.0/tab.length);
    }
    public static double sredniaArytmetyczna(int[] tab){
        double sum = 0;
        for(int i=0; i<tab.length; i++) sum+=tab[i];
        return sum/tab.length;
    }
    public static int sumaUjemnych(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]<0) counter+=tab[i];
        return counter;
    }
    public static int sumaDodatnich(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]>0) counter+=tab[i];
        return counter;
    }
    public static int ileMinimalnych(int[] tab){
        int minValue = tab[0], counter = 0;
        for(int i=1; i<tab.length; i++) if(tab[i]<minValue) minValue=tab[i];
        for(int i=0; i<tab.length; i++) if(tab[i]==minValue) counter++;
        return counter;
    }
    public static int ileMaxymalnych(int[] tab){
        int maxValue = tab[0], counter = 0;
        for(int i=1; i<tab.length; i++) if(tab[i]>maxValue) maxValue=tab[i];
        for(int i=0; i<tab.length; i++) if(tab[i]==maxValue) counter++;
        return counter;
    }
    public static int ileZerowych(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]==0) counter++;
        return counter;
    }
    public static int ileUjemnych(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]<0) counter++;
        return counter;
    }
    public static int ileDodatnich(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]>0) counter++;
        return counter;
    }
    public static int ileParzystych(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]%2==0) counter++;
        return counter;
    }
    public static int ileNieparzystych(int[] tab){
        int counter = 0;
        for(int i=0; i<tab.length; i++) if(tab[i]%2==1) counter++;
        return counter;
    }
    public static void wypiszTablice(int[] tab, int n, int m){
        int counter = 0;
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                if(counter>tab.length-1) System.out.print(0+" ");
                else System.out.print(tab[counter]+" ");
                counter++;
            }
            System.out.println("");
        }
    }
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        int[] tab = new int[n];
        for(int i=0; i<tab.length; i++) tab[i] = (int)(Math.random() * (maxWartosc - minWartosc + 1)) + minWartosc;
        return tab;
    }
    public static void main(String[] args){
        int[] tab = generujTablice(10, 10, 99);
        double[] taba = generujZakres(7, 5, 20);
        for(int i=0; i<taba.length; i++) System.out.println(taba[i]);
    }
}