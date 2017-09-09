package pl.kodolamacz.podstawy;

public class Tablice {

    public static void main(String[] args) {
        int[] tablica = {1,2,3};
        // dwa elementy, ale indeksy 0 i 1 !!!
        int[] tab = new int[2];
        tab[0] = 15;
        tab[1] = 5;

        // tak raczej nie robimy - mniej czytelnie
        // informacja o typie (int + tablica)
        // jest rozrzucona
        int pracownicy[] = {1,2,3};

        String[] napisy = {"Abc", "kot", "pies"};
    }

}
