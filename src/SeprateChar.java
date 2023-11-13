import java.util.Scanner;

public class SeprateChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String  n = scan.nextLine();
        for (int i=0;i<n.length();i++){
            System.out.println(n.charAt(i));
        }

        }

}
