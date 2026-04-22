public class Task6 {
    public static void main(String[] args){


        System.out.println(digitsFrom1To9("aa1bc2d3"));
        System.out.println(digitsFrom1To9("aa11b33"));


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

