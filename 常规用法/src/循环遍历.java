import java.util.*;

/**
 * @author wataly.sh[wataly.sh@gmail.com]
 * @since 2021/12/15
 */
public class 循环遍历 {
    public static void main(String[] args) {
        //几种遍历循环的方法
        Set<String> names = new HashSet<>();
        names.add("张三");
        names.add("lisi");
        names.add("wangwu");
        System.out.println("第一种循环方式========");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("迭代器循环方式========");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, Integer> stringHash = new HashMap<>();
        stringHash.put("a", 1);
        stringHash.put("b", 2);
        System.out.println("使用普通循环");
        for (Map.Entry<String, Integer> entry : stringHash.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("循环key");
        for (String key : stringHash.keySet()) {
            System.out.println("key: " + key);
        }
        System.out.println("循环value");
        for (Integer value : stringHash.values()) {
            System.out.println("value: " + value);
        }
        System.out.println("泛型迭代器");
        Iterator<Map.Entry<String, Integer>> iterator1 = stringHash.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        System.out.println("非泛型迭代器");
//        Iterator<Map.Entry> iterator2 = stringHash.entrySet().iterator();
//        while (iterator2.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator2.next();
//            String key = (String) entry.getKey();
//            Integer value = (Integer) entry.getValue();
//            System.out.println(key + value);
//        }
        System.out.println("lambda表达式");
        stringHash.forEach((k, v) -> System.out.println(k + v));


    }
}
