package base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
//        String str = "dad";
//        str = "123";
//        System.out.println(str);
//        String userGroup = "OTT_GROUP_LIVE$TerOut_17060111$$011$BesTV_Lite_GZDX_3.1.1606.1";
//        System.out.println(userGroup.split("#").length);
//        String[] userGroups = userGroup.split("\\" + "$");
//        System.out.println(Arrays.toString(userGroups));

//        Integer a = new Integer(128);
//        int a1 = a;
//        Integer a2 = a1;
//        System.out.println(a1);
//        System.out.println(a2);

        Integer a;
        a = null;
        try {

            if (1 == a) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public enum ContentTypeEnum {

        /**
         * 全部
         */
        ALL("全部"),

        /** 游戏 */
//	GAME("游戏"),

        /** 频道 */
//	CHANNEL("频道"),

        /** 新闻 */
//	NEWS("新闻"),

        /**
         * 娱乐
         */
        FUN("娱乐"),

        /**
         * 综艺
         */
        VARIETY("综艺"),

        /**
         * 体育
         */
        SPORTS("体育"),

        /**
         * 电视剧
         */
        SERIES("电视剧"),

        /**
         * 电影
         */
        MOVIE("电影"),

        /**
         * 4k
         */
        FOUR_K("4K"),

        /**
         * 少儿
         */
        CHILD("少儿"),

        /**
         * 纪实
         */
        DOCUMENTARY("纪实"),

        /**
         * VR
         */
        VR("VR");

        public static Map<String, String> codeMapping = new HashMap<String, String>();

        static {
            codeMapping.put("three-dimension", "3D");
            codeMapping.put("sports", "体育");
            codeMapping.put("others", "其他");
            codeMapping.put("original", "原创");
            codeMapping.put("fun", "娱乐");
            codeMapping.put("children", "少儿");
            codeMapping.put("education", "成教");
            codeMapping.put("jiaoyu", "教育");
            codeMapping.put("news", "新闻");
            codeMapping.put("fazhi", "法治");
            codeMapping.put("life", "生活");
            codeMapping.put("movie", "电影");
            codeMapping.put("dianjing", "电竞");
            codeMapping.put("series", "电视剧");
            codeMapping.put("jishi", "纪实");
            codeMapping.put("fun", "综艺");
            codeMapping.put("finance", "财经");
            codeMapping.put("yinyue", "音乐");
            codeMapping.put("hd", "高清");
            codeMapping.put("4K", "4K");
            codeMapping.put("VR", "VR");
        }

        private String code;

        ContentTypeEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
