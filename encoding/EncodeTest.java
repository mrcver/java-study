package encoding;

public class EncodeTest {
    public static void main(String[] args) {
        String s = "大家好123";

        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        byte[] bytes2 = s.getBytes();
        for (byte b : bytes2) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
    }
}
