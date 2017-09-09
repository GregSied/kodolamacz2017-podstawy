package pl.kodolamacz.podstawy.klasy;

public class Queen extends Person {

    public Queen(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Witaj mój poddany, jestem królowa "
                + getName());
    }

    @Override
    public void sing() {
        System.out.println("Królowej nie wypada śpiewać");
    }

    public static void main(String[] args) {
        Queen elzbieta = new Queen("Elżbieta II", 85);
        elzbieta.introduce();
    }
}
