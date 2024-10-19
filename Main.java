import java.util.Scanner;
public class Main{
    public static void liczbyPodzielne(int m, int n){
        m--;
        if(m<=0) return;
        for(int i=(int)Math.pow(10,m); i<(int)Math.pow(10,m+1); i++) if(i%n==0) System.out.print(i+" ");
    }
    public static void piramida(int n, boolean variant){ //wip variant
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++) System.out.print("*");
            System.out.println("");
        }
    }
    public static int silnia(int n){
        int x=1;
        for(int i=1; i<=n; i++) x*=i;
        return x;
    }
    public static int silniaPodwojna(int n){
        int x=1;
        for(int i=1; i<=n; i+=2){
            if(n%2==0&&i==1) continue;
            x=x*i;
        }
        return x;
    }
    public static int dwumianNewtona(int n, int k){
        return silnia(n)/(silnia(k)*silnia(n-k));
    }
    public static void ciagFibonacciego(int n){
        int a=0, b=1, c=1, temp;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            temp=b+c;
            a=b;
            b=c;
            c=temp;
        }
    }
    public static int sumaNaturalnych(int n){
        int x=0;
        for(int i=0; i<n; i++) x=x+i;
        return x;
    }
    public static int sumaKwaNaturalnych(int n){
        int x=0;
        if(n<=0) return 0;
        for(int i=1; i<=n; i++) x+=Math.pow(i,2);
        return x;
    }
    public static int sumaSzeNaturalnych(int n){
        int x=0;
        if(n<=0) return 0;
        for(int i=1; i<=n; i++) x+=Math.pow(i,3);
        return x;
    }
    public static double sumaOdwNaturalnych(int n){
        double x=0;
        if(n<=0) return 0;
        for(int i=1; i<=n; i++) x+=1/x;
        return x;
    }
    public static void trojkatPascala(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++) System.out.print(dwumianNewtona(i,j)+" ");
            System.out.println("");
        }
    }
    public static boolean czyDoskonala(int n){
        int x=0;
        if(n<=0) return false;
        for(int i=1; i<n; i++) if(n%i==0) x+=i;
        if(x==n) return true;
        return false;
    }
    public static boolean czyPierwsza(int n){
        if(n==0||n==1) return false;
        for(int i=2; i<n; i++) if(n%i==0) return false;
        return true;
    }
    public static int NWD(int a, int b){ //wip
        int temp;
        if(a==b) return a;
        if(a>b){
            temp=b;
            b=a;
            a=temp;
        }
        for(int i=b; i>1; i--) if(a%i==0&&b%i==0) return i;
        return 1;
    }
    //public static int[] wczytajTablice(int n){ //wip
    //}
    public static void main(String[] args) {
        int n=7, k=3;
        //liczbyPodzielne(k,n);
        piramida(n,true);
        //System.out.println(silnia(n));
        //System.out.println(silniaPodwojna(n));
        //System.out.println(dwumianNewtona(n,k));
        //ciagFibonacciego(n);
        //System.out.println(sumaNaturalnych(n));
        //System.out.println(sumaKwaNaturalnych(n));
        //System.out.println(sumaSzeNaturalnych(n));
        //System.out.println(sumaOdwNaturalnych(n));
        //trojkatPascala(n);
        //System.out.println(czyDoskonala(n));
        //System.out.println(czyPierwsza(n));
        //System.out.println(NWD(n,k));
    }
}