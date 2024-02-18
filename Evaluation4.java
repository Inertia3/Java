//Write a program to create a method takes a string as a input 
//and throws an exception if the string doesnt contains vowel



class Novowelexception extends Exception{
    public Novowelexception(String Str){
        System.out.println("String dpesnot cantain vowels");
    }
}

public class Evaluation4 {

    public static boolean checkForVowel(String str){
        String str1=str.toLowerCase();
        boolean ans = false;
        for(int i = 0; i<str.length(); i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u'){
                ans  = true;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Novowelexception {
        try{
            String str2 = "Ssdsdsds";
            if(!checkForVowel(str2)){
                throw new Novowelexception("String does not contain any vowel");
            }
            // System.out.println("String "+str2+" doesnot contain any vowels.");
        }
        catch(Novowelexception e){
            System.out.println(e);
        }
    }
}

// class Novowelexception extends Exception {
//     public Novowelexception(String message) {
//         super(message);
//     }
// }

// public class Evaluation4 {
//     public static boolean checkForVowel(String str) {
//         String str1 = str.toLowerCase();
//         boolean ans = false;
//         for (int i = 0; i < str.length(); i++) {
//             if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
//                     || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
//                 ans = true;
//                 break;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         try {
//             String str2 = "Ssssd";
//             if (!checkForVowel(str2)) {
//                 throw new Novowelexception("String does not contain any vowel");
//             }
//         } catch (Novowelexception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }
