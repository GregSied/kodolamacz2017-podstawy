package pl.kodolamacz.podstawy.klasy;

public class Employee extends Person{

    // alt + insert (generate)
    public Employee(String name, int age) {
        super(name, age);
    }

    public int getSalary(){
        return 2500;
    }

    @Override
    public void introduce() {
        System.out.println("Jeste pracownikiem i mam na imię " +
                this.getName() + " i mam " + this.getAge() +
                " lat, zarabiam "+getSalary());
    }

    @Override
    public void sing() {
        System.out.println("Majteczki w kropeczki");
    }

    public static void main(String[] args) {
        //ctrl + alt + L (autoformat)
        // cmd + alt + L (autoformat mac)
        Employee mietek = new Employee("Mietek", 20);
        Employee ziutek = new Employee("Ziutek", 25);
        mietek.introduce();
        ziutek.introduce();

    }
}
