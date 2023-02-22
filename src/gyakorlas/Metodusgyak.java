package gyakorlas;

public class Metodusgyak {

    public static void main(String[] args) {
        String szoveg="Az első tíz szám összege: " + elso10SzamOssege();
        kiIr(szoveg);
        
        int a=3, b=5;
        szoveg=String.format("%d + %d = ", a, b) + osszead(a, b);
        kiIr(szoveg);
        
    }
    
    private static int elso10SzamOssege(){
        int osszeg=0;
        for(int ix=1;ix<=10;ix++)
            osszeg+=ix;
        return osszeg;
    }
    private static int osszead(int a, int b){
        return a+b;
    }
    private static void kiIr(String szoveg){
        System.out.println(szoveg);
    }
}
