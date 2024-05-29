public class ReverseWords {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Mohan");
        System.out.println(s);
        s.append(" Talavar       ");
        System.out.println(s);
        s.trimToSize();
        System.out.println(s);

    }
}
