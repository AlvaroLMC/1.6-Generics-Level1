package Exercise1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("Alvaro", "Mendoza", "Cuello");
        NoGenericMethods obj2 = new NoGenericMethods("Mendoza", "Cuello", "Alvaro");
        NoGenericMethods obj3 = new NoGenericMethods("Cuello", "Alvaro", "Mendoza");

        System.out.println("obj1: " + obj1.getUno() + ", " + obj1.getDos() + ", " + obj1.getTres());
        System.out.println("obj2: " + obj2.getUno() + ", " + obj2.getDos() + ", " + obj2.getTres());
        System.out.println("obj3: " + obj3.getUno() + ", " + obj3.getDos() + ", " + obj3.getTres());
    }
}