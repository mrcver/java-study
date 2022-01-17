package 单例;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EnumSingle {
    INSTANCE;

    public static EnumSingle getInstance() {
        return INSTANCE;
    }
}


class TestEnumSingle {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                System.out.println(EnumSingle.getInstance());
//            }).start();
//        }

        EnumSingle instance = EnumSingle.getInstance();

        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);

        //报错，反射无法破坏单利
        EnumSingle enumSingle = declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(enumSingle);


    }
}