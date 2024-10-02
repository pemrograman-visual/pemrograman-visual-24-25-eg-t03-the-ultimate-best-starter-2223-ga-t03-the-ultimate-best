// 12S24015-LUCASPARDEDE
// 12S24022-INGRATESIHOMBING
import java.util.*;
import java.lang.Math;

public class t03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, kategori, keterangan, ultimate;
        int tahun, stok;
        double harga, margin, rating, diskon;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahun = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            format = input.nextLine();
            harga = Double.parseDouble(input.nextLine());
            margin = Double.parseDouble(input.nextLine());
            diskon = margin * -1 / harga;
            if (diskon > 0.4) {
                keterangan = "Once in a lifetime";
            } else {
                if (0.2 < diskon && diskon < 0.4) {
                    keterangan = "Never come twice";
                } else {
                    if (diskon <= 0.2 && diskon > 0) {
                        keterangan = "No regret";
                    } else {
                        keterangan = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5 && rating < 4.7) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0 && rating < 4.5) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0 && rating < 4.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (kategori.equals("Best Pick") && keterangan.equals("Once in a lifetime")) {
                ultimate = "The ultimate best";
            } else {
                ultimate = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + keterangan + "|" + ultimate);
            iSBN = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
