package StringExample;

public class DuplicateChar {
    public static void main(String[] args) {
        int count = 0;

        String name = "raaaaaam";


        for (int i = 0; i < name.length(); i++) {
            count = 1;
            for (int j = 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j) && name.charAt(i) != ' ') {
                    count++;


                }
            }
            if (count > 1 && name.charAt(i)!='0' ) {
                System.out.println(name.charAt(i));
            }
        }
    }
}