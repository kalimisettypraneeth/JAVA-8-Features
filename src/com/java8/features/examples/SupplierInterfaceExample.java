import java.util.Arrays;
import java.util.List;

public class SupplierInterfaceExample {
    
    public static void main(String[] args){
        List<Integer> lst = Arrays.asList(1, 2, 3, 4);

        System.out.println("\nSupplier interface" + "\n  it consists of get, orElse, orElseGet, negate, isEqual, not methods."
                + "\n  it takes the generic object passed to it and performs the operational logic"
                + "\n  it returns boolean value" + "\n  it is mainly used for conditional statements");

        System.out.println(lst.stream().findAny().orElseGet(() -> 0));
    }
}
