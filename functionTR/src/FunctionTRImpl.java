import java.util.function.Function;

public class FunctionTRImpl implements Function<String, Integer> {

  @Override
  public Integer apply(String s) {
    return s.length();
  }
}
