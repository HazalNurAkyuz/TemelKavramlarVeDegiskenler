public class Operatorler {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int toplam = a + b;
        int cıkarma = a - b;
        int carpma = a * b;
        int bolme = a / b;
        int mod = a % b;

        System.out.println("Toplama : " + toplam);
        System.out.println("Çıkarma : " + cıkarma);
        System.out.println("Çarpma : " + carpma);
        System.out.println("Bölme : " + bolme);
        System.out.println("Mod Alma : " + mod);

        toplam++;
        System.out.println(toplam);
        toplam--;
        System.out.println(toplam);

        int sonuc = a++ + b--;
        System.out.println(sonuc);

        ///////////////////////////

        int sayi1 = 10;
        int sayi2 = 5;

        boolean kosul1 = sayi1 == sayi2;
        System.out.println(kosul1);

        boolean kosul2 = sayi1 > sayi2;
        System.out.println(kosul2);

        boolean kosul3 = (sayi1 / sayi2) == 0;
        System.out.println(kosul3);


        boolean kosul4 = (sayi1 > sayi2);
        boolean kosul5 = (sayi2 < sayi1);
        boolean sonuc2 = kosul4 && kosul5;
        System.out.println(sonuc2);
        sonuc2 = kosul4 || kosul5;
        System.out.println(sonuc2);

        boolean kosul6 = (sayi1 > sayi2);
        boolean kosul7 = (sayi1 < sayi2);
        boolean sonuc3 = kosul6 && kosul7;
        System.out.println(sonuc3);

        sonuc2 = kosul4 || kosul5;
        System.out.println(sonuc2);

        String sonuc4 = kosul6 ? "Doğru" : "Yanlış";
        System.out.println(sonuc4);

        sayi1 = sayi2;
        System.out.println(sayi1);
        sayi1 += 2;
        System.out.println(sayi1);

    }
}
