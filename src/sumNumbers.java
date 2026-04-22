public class sumNumbers {
    public static void main(String[] args){

    }
    public static Integer sumNumbers(String str){
        int sum = 0;
        String tem = "";
        for(int i =0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                tem += str.charAt(i);
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i))){
                    sum
                }
            }
        }
    }
}
