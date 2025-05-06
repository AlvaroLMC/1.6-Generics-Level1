package Exercise2;

public class GenericMethods {
    public static <T1, T2, T3> void printArguments(T1 argument1, T2 argument2, T3 argument3) {
        System.out.println(argument1);
        System.out.println(argument2);
        System.out.println(argument3);
    }
}
