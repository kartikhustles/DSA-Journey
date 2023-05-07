import java.lang.StringBuilder;

public class StringBuilders {
    // public static String toUpperCase(String str) {
    //     StringBuilder sb = new StringBuilder("");

    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for (int i = 1; i < str.length(); i++) {
    //         if (str.charAt(i) == ' ' && i<str.length()-1) {
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         }
    //         else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    // return sb.toString();    
    // }
    // public static void main(String[] args) {
    //     String str = "hi, i am kartik !";
    //     System.out.println(toUpperCase(str));
    // }



    // public static String compress(String str) {
    //     String newStr = "";
    //     //aaabc
    //     for (int i = 0; i < str.length(); i++) {
    //         Integer count = 1;
    //         while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if (count > 1) {
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }

    // public static void main(String[] args) {
    //     String str = "aaabbcccdd";
    //     System.out.println(compress(str));
    // }


    // public static void main(String[] args) {
    //     String str = "ApnaCollege";

    //     String str2 = str.replace("l", "");
    //     System.out.println(str2);

    //     String str3 = str.replace("Apna", "Tera");
    //     System.out.println(str3);

    //     String str4 = str.replaceFirst("e", "f");
    //     System.out.println(str4);

    //     String str5 = str.replaceAll("e", "f");
    //     System.out.println(str5);
    // }
}