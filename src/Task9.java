public class Task9 {
    public static void main(String[] args){

        System.out.println(maxBlock("hoopla"));

    }
    public static Integer maxBlock(String str){

        int count = 1;
        int max = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else {
                count = 1;

            }

            if(count > max){
                return max = count;
            }
        }


        return max;
    }
}
