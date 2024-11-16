
public class Main {
    public static boolean dokladnosc(double x, double y, int k){
        if(y>x){
            if(Math.abs(y-x)<=Math.pow(10,k*(-1))) return true;
            else return false;
        }
        if(x>y){
            if(Math.abs(x-y)<=Math.pow(10,k*(-1))) return true;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //System.out.println(dokladnosc(5.7001,5.7009,3));
    }
}