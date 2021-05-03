
@FunctionalInterface
public interface CreatingFunctionalInterface {

    void singleAbstractMethod();

    default void typesOfFunctionalInterfaces(){
        System.out.println("Java 8 Functional Interfaces"
        +"\n    1.Consumer"
        +"\n    2.Predicate"
        +"\n    3.Functional Supplier");
    }

}
