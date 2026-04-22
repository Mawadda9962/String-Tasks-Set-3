public class Task6 {
    public static void main(String[] args){


        System.out.println();

    }
    public static Integer digitsFrom1To9 (String str){

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(Character.isDigit(a)){
                Integer num = Integer.parseInt(String.valueOf(a));
                    sum += num;
                }

            }

        return sum;

        }
    }

