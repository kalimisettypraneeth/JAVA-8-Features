public class lambdaExample {
    public static void main(String[] args) throws Exception {

        CreatingFunctionalInterface cfi = () -> System.out
                .println("\n\nFunctional Interface is special kind of interface used to implement lambda expressions "
                        + "which can contain any number of default and static methods but only one abstract method is allowed.");

        cfi.singleAbstractMethod();

        cfi.typesOfFunctionalInterfaces();

    }
}
