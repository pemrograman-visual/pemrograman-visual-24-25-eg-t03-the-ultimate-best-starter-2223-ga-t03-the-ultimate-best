// 12S24015-LUCAS PARDEDE
// 12S24022-INGRATE SIHOMBING

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, tAHUNTERBIT, fORMATBUKU, kUALITAS, tIPEDISKON, fINISH;
        double hARGAPEMBELIAN, mINIMUMMARGIN, rATING;
        int sTOK;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            jUDUL = input.nextLine();
            pENULIS = input.nextLine();
            tAHUNTERBIT = input.nextLine();
            pENERBIT = input.nextLine();
            fORMATBUKU = input.nextLine();
            hARGAPEMBELIAN = Double.parseDouble(input.nextLine());
            mINIMUMMARGIN = Double.parseDouble(input.nextLine());
            if (mINIMUMMARGIN / hARGAPEMBELIAN < -0.4) {
                tIPEDISKON = "ONCE IN A LIFETIME";
            } else {
                if (mINIMUMMARGIN / hARGAPEMBELIAN < -0.2) {
                    tIPEDISKON = "NEVER COME TWICE";
                } else {
                    if (mINIMUMMARGIN / hARGAPEMBELIAN <= 0) {
                        tIPEDISKON = "NO REGRET";
                    } else {
                        tIPEDISKON = "---";
                    }
                }
            }
            sTOK = Integer.parseInt(input.nextLine());
            rATING = Double.parseDouble(input.nextLine());
            if (rATING >= 4.7 && rATING < 5.0) {
                kUALITAS = "Best Pick";
            } else {
                if (rATING >= 4.5 && rATING < 4.7) {
                    kUALITAS = "Must Read";
                } else {
                    if (rATING >= 4.0 && rATING < 4.5) {
                        kUALITAS = "Recommended";
                    } else {
                        if (rATING >= 3.0 && rATING < 4.0) {
                            kUALITAS = "Average";
                        } else {
                            if (rATING > 0 && rATING < 3.0) {
                                kUALITAS = "Low";
                            }
                        }
                    }
                }
            }
            if (tIPEDISKON.equals("ONCE IN A LIFETIME") && kUALITAS.equals("BEST PICK")) {
                fINISH = "THE ULTIMATE BEST";
            } else {
                fINISH = "---";
            }
            System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + toFixed(hARGAPEMBELIAN,2) + "|" + toFixed(mINIMUMMARGIN,2) + "|" + sTOK + "|" + toFixed(rATING,1) + "|" + kUALITAS + "|" + tIPEDISKON + "|" + fINISH);
            iSBN = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
