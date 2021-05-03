import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {
    
    public static void main(String[] args){

        System.out.println("\nPredicate interface" + "\n  it consists of test, and, or, negate, isEqual, not methods."
                + "\n  it takes the generic object passed to it and performs the operational logic"
                + "\n  it returns boolean value" + "\n  it is mainly used for conditional statements");
        Predicate<Integer> prd = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        List<Integer> lst = Arrays.asList(1, 2, 3, 4);

        lst.stream().filter(prd).forEach(x -> System.out.println(x));
    }
}
