public class Task4 {
    public static void main(String[] args) {

        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
    }

    public static boolean gHappy(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'g' && str.charAt(i + 1) == 'g') {
                return true;
            }

        }
        return false;

    }

}
