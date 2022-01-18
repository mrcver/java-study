package genericArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList mix = new ArrayList<>();
        mix.add("zhangsan");
        mix.add(18);
        System.out.println(mix);
        for (Object obj : mix) {
            System.out.println(obj);
            //会报错, 因为18是数字类型
//            System.out.println((String) obj);
            //需要进行判断后转换
            String s;
            if (obj instanceof Integer) {
                s = Integer.toString((Integer) obj);
            } else {
                s = (String) obj;
            }
            System.out.println(s);
        }

        //数字集合
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println(intList);

        //字符串集合
        ArrayList<String> strList = new ArrayList<>();
        strList.add("zhangsan");
        strList.add("lisi");
        Iterator<String> is = strList.iterator();
        while (is.hasNext()) {
            System.out.println(is.next());
        }
    }
}
