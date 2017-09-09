package pl.kodolamacz.podstawy;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Wyjatki {

    private static final Logger LOG = Logger.getLogger("Wyjatki");
    private int age;

    public Wyjatki(int age) {
        if(age >= 0){
            this.age = age;
        }else{
            throw new RuntimeException("Wiek nie może być ujemny!");
        }
        LOG.info("Stworzono z wiekiem "+age);
    }

    public void setAge(int age) throws NegativeAgeException, NumberFormatException, TooOldException {
        if (age >= 0) {
            if(age >= 150){
                throw new TooOldException();
            }
            this.age =age;
        }else{
            throw new NegativeAgeException();
        }
    }

    public static void main(String[] args)  {
        String zmienna = "1.23";
//        double liczba = zmienna;
        double liczba = Double.parseDouble(zmienna);
        LOG.info(liczba + "");

//        LOG.info(Double.parseDouble("jeden") + "");

        // ten kod nie zostanie wykonany
        // bo wcześniej poleciał wyjątek
        Wyjatki wyjatki = new Wyjatki(10);
        int age = -5;
        try {
            wyjatki.setAge(age);
        } catch (NegativeAgeException e) {
            LOG.info(e.getMessage());
            LOG.info("Próbuję z ujemną ");
            try {
                wyjatki.setAge(-age);
            } catch (NegativeAgeException e1) {
                LOG.info("Ja już nie wiem co robić");
                throw new RuntimeException("Nieprzewidziana sytuacja");
            } catch (TooOldException e1) {
                LOG.info("Podany wiek jest za duży");
            }
        } catch (TooOldException e) {
            LOG.info("Podany wiek jest za duży");
        }

        try {
            try {
                wyjatki.setAge(age);
            } catch (NegativeAgeException e) {
                LOG.info("Próbuję z ujemną ");
                try {
                    wyjatki.setAge(-age);
                } catch (NegativeAgeException e1) {
                    LOG.info("Ja już nie wiem co robić");
                    throw new RuntimeException("Nieprzewidziana sytuacja");
                }
            }
        }  catch (TooOldException e) {
            LOG.info("Podany wiek jest za duży");
        }

        try {
            wyjatki.setAge(age);
        } catch (NegativeAgeException | TooOldException e) {
            LOG.info(e.getMessage());
        } finally {
            // jeśli łączymy się z bazą danych
            // to niezależnie od wyniku tego polecenia
            // powinniśmy zamknąć połączenie
            // to jest dobre miejsce na takie rzeczy
        }
        new Wyjatki(-10);

        //race condition



    }

    public static Object[] unflatten(int[] flatArray)
    {
        Object[] result = new Object[countSize(flatArray)];
        int index = 0;
        for (int i = 0; i < flatArray.length; ) {
            int v = flatArray[i];
            if(v < 3){
                result[index] = v;
                i++;
            }else{
                result[index] = Arrays.copyOfRange(flatArray,i, i+v);
                i += v;
            }
            index++;
        }
        return result;
    }

    public static int countSize(int[] flatArray){
        int size = 0;
        for (int i = 0; i < flatArray.length; i++) {
            int v = flatArray[i];
            if (v < 3) {
                size++;
            }else{
                size += Math.min(v, flatArray.length - i);
            }
        }
        return size;
    }

}
// shift + f6 (rename)
class NegativeAgeException extends Exception{
    public NegativeAgeException() {
        super("Wiek nie może być ujemny");
    }
}

class TooOldException extends Exception{
    public TooOldException() {
        super("Zbyt duży wiek");
    }
}