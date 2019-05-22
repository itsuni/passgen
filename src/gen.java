import java.util.Random;

public class gen {

    final static String uppercase = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String lowercase = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

    static Random r = new Random();

    static int length;
    static String pass = "";

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
            pass = pass + (lowercase.charAt(r.nextInt(lowercase.length())));
        }
        return pass;
    }
}
