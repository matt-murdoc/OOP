public class Nigga {

    public static String insert(String s, int n) {

        StringBuffer sm = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {

            sm.append(s.charAt(i));

            if ((i + 1) % n == 0 && (i + 1) != s.length()) {

                sm.append('-');
            }
        }

        return sm.toString();

    }

    public static Boolean email(String e) {

        StringBuffer sm = new StringBuffer(e);
        sm = sm.delete(0, sm.length() - 10);

        if (sm.toString().equals("@gmail.com")) {

            return true;
        }
        else return false;

    }

    public static String convert(String s) {

        String[] arr = s.split(" ");
        StringBuffer sm = new StringBuffer();

        for(int i = 0; i < arr.length; i++) {

            if ((i + 1) % 2 == 0) {

                sm.append(arr[i].toLowerCase());
                sm.append(' ');
            }
            else {

                sm.append(arr[i].toUpperCase());
                sm.append(' ');
            }
        }

        return sm.toString();

    }
}