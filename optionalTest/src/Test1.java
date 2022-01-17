import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test1 {

  public static void main(String[] args) {
    List<Optional<String>> list = new ArrayList<>();
    list.add(Optional.of("aa"));
    list.add(Optional.ofNullable(null));
    for (Optional<String> i : list) {
      System.out.println(i.isPresent());
      //存在时就可以进行适用消费， 理解为时消费者的实现
      i.ifPresent(s-> System.out.println(String.format("value: %s", i)));
    }

    Optional<String> optional1 = Optional.of("javaone");

    Optional<String> op2 = Optional.of("aa");
    System.out.println(optional1.isPresent());
    optional1.ifPresent(s -> System.out.println(s.length()));

  }
}
