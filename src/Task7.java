public class Task7 {
    public static void main(String[] args){
        System.out.println(sameEnds("abXYab"));

    }
    public static String sameEnds (String str){
        String result = " ";

        for(int i = 0; i <= str.length() /2 ; i++){

            String first = str.substring(0,i);
            String last = str.substring(str.length() - i);

            if (first.equals(last)){
                result = first;
            }

        }
        return result;
    }

}
