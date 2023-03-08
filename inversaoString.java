public class inversaoString {
    public static void main(String[] args) {
        String str = "teste";
        System.out.println(str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println(str);
    }
}