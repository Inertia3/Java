import java.util.*;

public class StringMethods{
    public static void main(String[] args){
        System.out.print("Enter your desired String-");
        // String str="  Sahil ";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        System.out.printf("The length of the entered string \"%s\" is:%d",str,n);
    
        System.out.printf("\nLower case of \"%s\" is %s",str,(str.toLowerCase()));

        System.out.printf("\nUpper case of \"%s\" is %s",str,(str.toUpperCase()));

        System.out.printf("\nTrimmed Version of \"%s\" is %s",str,(str.trim()));

        System.out.printf("\nSubstring of \"%s\" is %s",str,(str.substring(2)));

        System.out.printf("\nSubstring of \"%s\" is %s",str,(str.substring(2,6)));

        System.out.printf("\nAfter replacing the letters of string \"%s\" is %s",str,(str.replace('h','a')));

        System.out.println("\nThe entered string starts with sah is:"+str.startsWith("sah"));

        System.out.println("\nThe entered string ends with ari is:"+str.startsWith("ari"));

        System.out.printf("\nIndex of \'h\' is %d",str.indexOf("h")); //returns -1 means no match

        System.out.printf("\nIndex of \'h\' from 5 is %d",str.indexOf("h",5)); //returns -1 means no match

        System.out.println("\nlastIndexOfFunction"+str.lastIndexOf("r"));

        System.out.println("\nlastIndexOfFunction"+str.lastIndexOf("r",2));

        System.out.printf("The entered string \"%s\" is equals to:%s",str,str,str.equals("Sahil Ansari"));

        sc.close();

    }
    
}
