package gyakorlas;

public class Metodusgyak {

    public static void main(String[] args) {
        String szoveg="Az első tíz szám összege: " + elso10SzamOssege();
        kiIr(szoveg);
        
        int a=3, b=5, c, d;
        szoveg=String.format("%d + %d = ", a, b) + osszead(a, b);
        kiIr(szoveg);
        
        a=2;b=3;c=3;d=5;
        szoveg="4 szám összege: " + osszead(a, osszead(b, osszead(c, d)));
        kiIr(szoveg);
        
        a=3;b=4;c=2;
        szoveg="%d+%d+%d gyöke: %.0f".formatted(a,b,c, Math.sqrt(osszead(a, osszead(b, c))));
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
