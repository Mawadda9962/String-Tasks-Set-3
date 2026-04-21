import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args){

        String word = "fez day";
        System.out.println(countYZ(word));


        }
        public static int countYZ(String str){
        Set <String> endingInYOrZ = new HashSet<>();


        endingInYOrZ.add("Y");
        endingInYOrZ.add("z");

        int count = 0;

        for(int i = 0; i < str.length(); i++ ){
            String currentChar = String.valueOf(str.charAt(i));

            if(endingInYOrZ.contains(currentChar)){
                if(i == str.length() -1){
                    count++;
                }

            }

            return count;

        }

}
