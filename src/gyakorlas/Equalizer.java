package gyakorlas;
import java.util.Random;

public class Equalizer {
    private static Random rnd=new Random();
    //•Minden sor 3-7 blokkból álljon•Szín: "\u001B[45m"
    //System.out.println("\u001B[45m" + " ")
    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        eq(true);
        eq(9);
        eq(3, false);
        eq(4, true);
        eq();
    }
    private static void eq(){
        eq(false);
    }
    private static void eq(boolean szamIr){
        eq(rnd.nextInt(4+1)+3, szamIr);
    }
    private static void eq(int hossz){
        eq(hossz, false);
    }
    private static void eq(int hossz, boolean szamIr){
        for(int ix=0; ix<hossz;ix++){
            System.out.print("\u001B[45m" + " ");
        }
        if(szamIr)
            System.out.print("\u001B[40m" + "("+ hossz+")");
        System.out.println("");
    }
}
