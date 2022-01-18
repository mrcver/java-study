import cn.hutool.core.util.StrUtil;

class StringDemos {
    public static void main(String[] args) {
        //字符串替换
        String str = "****";
        StringBuilder sb = new StringBuilder("18698587234");
        System.out.println(sb.toString() + "手机加密结果：" + sb.replace(3, 7, str).toString());

        boolean blank = StrUtil.isBlank(str);
        System.out.println(blank);

        System.out.println(String.format("dadsa::%s", ":e121"));
    }
}