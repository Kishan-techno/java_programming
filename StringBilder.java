
public class StringBilder {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("Kishan");

        System.out.println(s.length() + " " + s.capacity());
        System.out.println(s);

        s.append("kumar");

        System.out.println(s);
    }
}
