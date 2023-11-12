package Array;

import java.util.Scanner;

public class SpaceRemove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();

//        String str = "hi how are u ";    trying with scanner

        for(int i =0;i<str.length();i++){
            if (str.charAt(i) == ' '){
              str = str.replaceAll("\\s","");
            }
        }
        System.out.println(str);
    }
}
