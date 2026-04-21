public class Task5 {
    public static void main(String[] args){


    }

    public static Integer appearingThreeTimes(String str){

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)){
                return count++;
            }
        }
        return count;
    }

}
