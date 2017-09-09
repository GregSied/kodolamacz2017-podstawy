package pl.kodolamacz.podstawy;

public class Zmienne {


    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("Witaj Świecie");
        System.out.println("Witaj ponownie!");

        // zmienne
        boolean prawda = true;
        int calkowita = 15;
        double rzeczywista = 3.14;

        // byte, short, int, long, float, double, boolean
        char znak = 'a'; // char MUSI mieć pojedynczy cudzysłów
        String napis = "Ala ma kota"; // String podwójny
//        char nzaak = "b";
//        String test = 'a';

        // zakomentowanie ctrl + / (mac: cmd + /)

        System.out.println(2 + 3);
        System.out.println(2 * 3);
        System.out.println(2 - 3);
        // dzielimy liczby całkowite, więc wynik też jest całkowity
        System.out.println(7 / 3);
        // dzielimy rzeczywistą przez całkowitą, więc
        // nastąpi promocja typu z int -> double
        // dzielenie dwóch double zwraca double
        System.out.println(7.0 / 3);

        int i = 0;
        i = i + 1; //inkrementacja - zwiększenie wartości
        i += 1;
        i -= 1;
        i *= 2; // skrócony zapis i = i * 2;
        i++;

        // LUB
        System.out.println(true | false);
        // I
        System.out.println(true & false);

        // LUB - leniwe (jeśli pierwszy warunek zachodzi
        // to drugi nie sprawdzany i true)
        System.out.println(true || false);
        // I - leniwe (jeśli pierwszy nie zachodzi
        // to wtedy drugi nie sprawdzany i false)
        System.out.println(true && false);

        System.out.println(15 > 5);
        System.out.println(15 > 15);
        System.out.println(15 >= 15);
        System.out.println(15 == 15);

        System.out.println(4 ^ 2);
        System.out.println(4 ^ 4);
        System.out.println(4 & 4);
        System.out.println(4 | 4);
        System.out.println(4 & 2);
        System.out.println(4 | 2);
        System.out.println(1 << 2); // 0001 << 2 == 0100
        System.out.println(1 << 16); // 0001 << 2 == 0100
        System.out.println();

        // to jest komentarz



    }

}
