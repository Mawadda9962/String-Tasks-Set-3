public class Task4 {
    public static void main(String[] args){


    }
    public static boolean gHappy (String str){

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) == 'g') {
                if(str.charAt(i + 1) == 'g' || str.charAt(i - 1) == 'g'){
                    return true;
                }


            }
        }

    }
}
