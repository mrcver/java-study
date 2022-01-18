/**
 * @author wataly.sh[wataly.sh@gmail.com]
 * @since 2021/12/28
 */
public enum Type {
    WX(1, "WX"),
    ALI(2, "ALI");

    private final Integer code;
    private final String type;

    Type(Integer code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return type;
    }
}
