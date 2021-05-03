import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    
    public static void main(String[] args){
        Consumer<String> consumer = t -> System.out.println(t);

        consumer.accept("\nConsumer interface" + "\n  it consists of accept, andthen methods."
                + "\n  it takes the generic object passed to it and performs the operational logic"
                + "\n  it does not return anything" + "\n  it is mainly used in forEach method");

        List<String> lst = Arrays.asList("1", "2", "3", "4");

        lst.stream().forEach(consumer);
    }
}
