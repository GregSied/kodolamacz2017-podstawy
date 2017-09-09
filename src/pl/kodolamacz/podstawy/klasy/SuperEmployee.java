package pl.kodolamacz.podstawy.klasy;

public class SuperEmployee extends Employee {
    public SuperEmployee(String name, int age) {
        super(name, age);
    }


    public int wiek(){
        // nie mam dostępu do ZMIENNEJ
//        return age;
        // mam dostęp do METODY, która jest publiczna
        return getAge();
    }
}
