import java.util.function.Function;

public class DemoFunctionTR {

  public static void main(String[] args) {
    FunctionTRImpl s = new FunctionTRImpl();
    Integer result = s.apply("lisi");
    System.out.println(result);

    Function<Integer, Boolean> f1 = integer -> integer==1;
    System.out.println(f1.apply(1));
    System.out.println(f1.apply(2));

  }
}
