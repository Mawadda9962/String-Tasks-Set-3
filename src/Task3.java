public class Task3 {
    public static void main(String[] args){


        String equalIsNot = "This is not";

        System.out.println(isEqualToNot());




    }
    public static boolean isEqualToNot (String str){

        int countIs = 0;
        int countNot = 0;

        for(int i = 0; i < str.length(); i++){
            if (str.substring(i, i + 2).equals("is")){
                countIs++;

            }
        }

        for (int i = 0; i < str.length(); i++){
            if (str.substring(i, i + 3).equals("Not")){
                countNot++;
            }
        }

        return countIs == countNot;


    }
}
