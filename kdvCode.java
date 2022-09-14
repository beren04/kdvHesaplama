package first;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Para miktarını girinz:");
        int paraMik = input.nextInt();
        double kdv = 0.18, kdv2 = 0.08;

        double toplamKdv = (paraMik >1000) ?  paraMik*kdv2 : paraMik*kdv;
        System.out.println("Para Miktarı:"+paraMik);
        System.out.println("Kdv Miktarı:"+toplamKdv);
        System.out.println("Ödenecek Miktarı:"+ (paraMik+toplamKdv));

    }
}
