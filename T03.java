// 12S24015-LUCASPARDEDE
// 12S24022-INGRATESIHOMBING
import java.util.*;
import java.lang.Math;

public class T03 {
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
            if (-(mINIMUMMARGIN / hARGAPEMBELIAN) > 0.4) {
                tIPEDISKON = "ONCE IN A LIFETIME";
            } else {
                if (0.2 < -(mINIMUMMARGIN / hARGAPEMBELIAN) && mINIMUMMARGIN / hARGAPEMBELIAN < 0.4) {
                    tIPEDISKON = "NEVER COME TWICE";
                } else {
                    if (-(mINIMUMMARGIN / hARGAPEMBELIAN) <= 0.2 && -(mINIMUMMARGIN / hARGAPEMBELIAN) > 0) {
                        tIPEDISKON = "NO REGRET";
                    } else {
                        tIPEDISKON = "---";
                    }
                }
            }
            sTOK = Integer.parseInt(input.nextLine());
            rATING = Double.parseDouble(input.nextLine());
            if (rATING >= 4.7) {
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
                            if (rATING < 3.0) {
                                kUALITAS = "Low";
                            } else {
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
            System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + hARGAPEMBELIAN + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING + "|" + kUALITAS + "|" + tIPEDISKON + "|" + fINISH);
            iSBN = input.nextLine();
        }
    }
}
