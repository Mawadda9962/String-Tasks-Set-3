public class Task6 {
    public static void main(String[] args){


        System.out.println(digitsFrom1To9("aa1bc2d3"));
        System.out.println(digitsFrom1To9("aa11b33"));


    }
    public static Integer digitsFrom1To9 (String str){

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i); //Converting all the element of string to char
            if(Character.isDigit(a)){ //checking if the char is digit
                Integer num = Integer.parseInt(String.valueOf(a)); //Storing the digits in num
                //as first i convert the char as a string String.valueOf(a) after that converting the string to int
                    sum += num;
                }

            }

        return sum;

        }
    }

