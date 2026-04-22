public class mirrorEnds {
    public static void main(String[] args){

        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));


    }
    public static String mirrorEnds(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){

            String first = str.substring(i, i+1);
            String last = str.substring(str.length() -1 - i, str.length()-i);

            if (first.equals(last)){
               result = result + first;
            }else{
                break;
            }
        }

        return result;
    }
}
