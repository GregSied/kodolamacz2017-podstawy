package pl.kodolamacz.podstawy;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        // if
        if(10 > 8){
            System.out.println("Większe");
        }

        if(12 - 8 < 3)
            System.out.println("Bez klamer");

        // gdyby to był Python to by działało tak jak chcemy
        // twz problem wiszącego else'a
        if(true)
            if(false)
                System.out.println("a");
            else
                System.out.println("b");

        int temperatura = 22;
        if(temperatura > 30){
            System.out.println("Upał, posmaruj się kremem!");
        }else if(temperatura > 20){ // równoważnie 30 >= temp > 20
            System.out.println("jest ciepło, nie bierz kurtki");
        }else if(temperatura > 10){ // 20 >= temp > 10
            System.out.println("weź bluzę");
        }else{ // temp <= 10
            System.out.println("Załóż czapkę!");
        }

        char znak = 'b';
        if(znak == 'a'){

        }else if(znak == 'b'){

        }else if(znak == 'c'){

        }

        switch (znak){
            case 'a':
                System.out.println("mamy A");
                break;
            case 'b':
                System.out.println("wpadło B");
                break;
            case 'c':
                System.out.println("jest C");
                break;
            default:
                System.out.println("Nie wiem co to");
        }

        int fundusz = 5000;

        switch(fundusz){
            case 5000:
                System.out.println("stać Cię na niezłego kompa!");
            case 1000:
                System.out.println("Kup sobie fajny tablet");
            case 200:
                System.out.println("Na telefon starczy");
            case 15:
                System.out.println("Możesz za to iśc na obiad");
        }

    }

}
