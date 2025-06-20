//Given A String, The task is to toggle all the characters of the string i.e, to convert Uppercase to Lowercase and vice versa.

import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to toggle : ");
        StringBuilder str = new StringBuilder(sc.nextLine());  //ApHYIcs

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=65 && ascii <=90 || ascii >=97 && ascii <=122){

                if(ascii>=65 && ascii <=90){
                    ascii+=32;
                    char dh = (char)ascii;
                    str.setCharAt(i,dh);
                }else{
                    ascii-=32;
                    char dh = (char)ascii;
                    str.setCharAt(i,dh);
                }
            }
        }
        System.out.println(str);
    }
}

