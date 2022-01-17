package base;

public class Person {
    //初始化
    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 重写equals方法
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
//        if (this == obj) {
//        if (this.name == obj.getName()) {
//            return true;
//        }
//        return false;
    }
}
