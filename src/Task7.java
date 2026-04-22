public class Task7 {
    public static void main(String[] args){
        System.out.println("");

    }
    public static String sameEnds (String str){
        String result = " ";

        for(int i = 0; i < str.length(); i++){

            String first = str.substring(0,i);
            String last = str.substring(str.length()-1);

            if (first.equals(last)){
                result = first;
            }

        }
        return result;
    }

}
