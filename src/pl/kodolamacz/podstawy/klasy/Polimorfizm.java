package pl.kodolamacz.podstawy.klasy;

public class Polimorfizm {

    public static void main(String[] args) {
        Person queen = new Queen("Elżbieta II", 85);
        Person ziutek = new Employee("Ziutek",25);
        Person mietek = new Employee("Mietek",35);
        Person robert = new FootballPlayer("Robert", 28, "FC Drzewce");
        // klasa anonimowa
        Person osoba = new Person("Anonim",18) {
            @Override
            public void introduce() {
                System.out.println("Jestem anonimem");
            }
        };
        // zmienna ziutek przechowuje osobe - Person
        // to nie dziala, bo o ziutku wiem tyle że jest OSOBĄ
        // nie wiem, że jest pracownikiem
        //ziutek.getSalary();
        Person[] osoby = {queen, ziutek, mietek, robert, osoba};
        for (Person person : osoby) {
            person.introduce();
            person.sing();
        }

    }

}
