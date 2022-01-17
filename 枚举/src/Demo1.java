import java.util.HashMap;
import java.util.Map;

/**
 * @author wataly.sh[wataly.sh@gmail.com]
 * @since 2021/12/28
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String, Type> typeMap = new HashMap<>();

        typeMap.put("ali", Type.ALI);
        typeMap.put("wx", Type.WX);

        for (Map.Entry<String, Type> type : typeMap.entrySet()) {
            System.out.println("code: " + type.getValue().getCode() + ", value: " + type.getValue().getType());
        }

        System.out.println(Type2.WX);
        System.out.println(Type2.ALI);
    }
}
