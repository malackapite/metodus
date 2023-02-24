package gyakorlas;

import java.util.Random;

public class QrCode {

    private static Random rnd = new Random();

    public static void main(String[] args) {
        kiIr(qr(32, true));
    }

    public static void kiIr(String qrCode) {
        System.out.println(qrCode);
    }

    public static String qr() {
        return qr(10, false);
    }

    public static String qr(int hossz) {
        return qr(hossz, false);
    }

    public static String qr(boolean negyzet) {
        return qr(10, negyzet);
    }

    public static String qr(int hossz, boolean negyzet) {
        String szin, qrCode = new String();
        for (int ix = 0; ix < hossz / 2; ix++) {
            for (int jx = 0; jx < hossz; jx++) {
                if (negyzet && hossz - 5 <= jx && 5 > ix) {
                    szin = "\u001B[42m";
                    if (ix > 0 && ix < 4
                            && jx < hossz - 1 && jx > hossz - 5
                            && ix * jx != 2 * hossz - 6) {
                        szin = "\u001B[40m";
                    }
                } else if (rnd.nextBoolean()) {
                    szin = "\u001B[43m";
                } else {
                    szin = "\u001B[40m";
                }
                qrCode += szin + " ";
            }
            qrCode += "\r\n";
        }
        return qrCode;
    }
}
