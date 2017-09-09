package pl.kodolamacz.podstawy.klasy;

// każda klasa dziedziczy po Object,
// nawet jeśl nie napiszemy tego wprost
// (dlatego nie trzeba tego pisać)
public abstract class Person extends Object implements NamedEntity {

    // pola składowe klasy
    // widoczne w pakiecie i w dziedziczących klasach
    protected String name;
    // widoczne tylko w tej klasie
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metody dostępowe
    public int getAge() {
        return age;
    }

    // public - widoczne wszędzie
    @Override
    public String getName() {
        return name;
    }

    public abstract void introduce();

    public void sing(){
        System.out.println("Nie umiem śpiewać");
    }

}
