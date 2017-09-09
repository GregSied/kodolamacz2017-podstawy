package pl.kodolamacz.podstawy;

public class Petle {

    public static void main(String[] args) {
        // for
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // najpierw sprawdź, później rób
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        // najpierw rób, potem sprawdź
        i = 15;
        do{
            System.out.println(i);
        }while(i < 5);

        // foreach


        String[] napisy = {"Abc", "kot", "pies"};
        for (int index = 0; index < napisy.length; index++) {
            System.out.println(napisy[index]);
        }

        for (String s : napisy) {
            System.out.println(s);
        }

        // it - iterate
        int[] tab = {1,2,3};
        // iter
        for (String s : napisy) {

        }

    }

}
