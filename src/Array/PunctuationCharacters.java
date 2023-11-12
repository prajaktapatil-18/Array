package Array;

import com.sun.source.util.DocTreeScanner;

import java.util.Scanner;

public class PunctuationCharacters {
    public  static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string/sentence");
        String sen = scan.nextLine();
        int count=0;

//        String sen =  ("Hello, how are you? I hope you are doing well.I want to ask you one question can i ? mina-mihir both are they siblings?");
        for(int i =0; i<sen.length();i++){
            if (sen.charAt(i)== ',' || sen.charAt(i)=='?' || sen.charAt(i)=='.' ||sen.charAt(i)=='!' || sen.charAt(i)=='-'){
                count++;
            }

        }
        System.out.println(count);
    }
}
