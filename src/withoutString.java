public class withoutString {

    public static void main(String[] args) {

        String base = "Hello there";
        String remove = "llo";

        System.out.println(baseAndRemove(base, remove));
    }

    public static String baseAndRemove(String base, String remove) {

        if (base.contains(remove)) {
            base = base.replace(remove, "");
        }

        return base;
    }
}