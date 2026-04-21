public class Task2 {
    public static void mian(String[] args){

        String base = "Hello there";
        String remove =  "llo";


        System.out.println(baseAndRemove(base, remove));

    }
    public static String baseAndRemove(String base, String remove){

        String result =" ";

        for(int i = 0; i < base.length(); i++){
            if(base.contains(remove)){
                result = base.replace(remove, "");

            }
        }
        return result;
    }
}
