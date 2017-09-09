package pl.kodolamacz.podstawy.klasy;

public class FootballPlayer extends Person {

    private String club;

    public FootballPlayer(String name, int age, String club) {
        super(name, age);
        this.club = club;
    }

    @Override
    public void introduce() {
        System.out.println("Jestem piłkarzem i nazywam się "+
        getName() + " i gram w klubie "+club);
    }

    @Override
    public void sing() {
        System.out.println("Bardzo się wstydzę, bo ...");
        super.sing();
        System.out.println("No ale spróbuję");
        System.out.println("Stooo laaat, stooo laat");
    }
}
