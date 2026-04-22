public class Task9 {
    public static void main(String[] args){

    }
    public static Integer maxBlock(String str){

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
        }
        return count
    }
}
