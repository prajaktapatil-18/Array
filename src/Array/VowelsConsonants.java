package Array;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String [] args){

//        String str = "priyansheoun";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = scan.nextLine();
        int vowels =0;
        int consonant =0;

        for (int i =0;i<str.length();i++){

            if (str.charAt(i) =='a'|| str.charAt(i) =='e' || str.charAt(i) =='i' ||str.charAt(i) =='o' ||str.charAt(i) =='u'){
                vowels++;

            }else{
                consonant++;
            }

        }
        System.out.println(vowels);
        System.out.println(consonant);
    }
}
