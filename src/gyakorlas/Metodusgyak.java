package gyakorlas;

public class Metodusgyak {

    public static void main(String[] args) {
        kiIr("Az első tíz szám összege:", elso10SzamOssege());
        kiIr("a + b = ", osszead(3, 9));
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
    private static void kiIr(String szoveg, int ertek){
        System.out.printf(szoveg + ertek + "\r\n");
    }
}
