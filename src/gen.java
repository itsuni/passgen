import java.util.Random;

public class gen {

    private final static String uppercase = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String lowercase = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%^&*()-=[{]}|:;'<,>.?/";

    private static Random r = new Random();

    private static int length;
    private static String pass = "";

    public gen(int x) {
          length = x;
    }

    public static String uppergen(){
        for (int i = 0; i < length; i++) {
            pass = pass + (uppercase.charAt(r.nextInt(uppercase.length())));
        }
        return pass;
    }

    public static String lowergen(){
        for(int i = 0; i < length; i++) {
            pass = pass + (lowercase.charAt(r.nextInt(lowercase.length()-26)));
        }
        return pass;
    }

    public static String punctgen(){
        for(int i = 0; i < length; i++){
            pass = pass + (lowercase.charAt(r.nextInt(lowercase.length())));
        }
        return pass;
    }
}
