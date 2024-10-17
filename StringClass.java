public class StringClass {
    public static void main(String[] args) {
        String s = "My name is Monica";
        System.out.println(s);
        System.out.println(s.charAt(5));
        System.out.println();
        
        String Str1 = "Learning";
        String Str2 = new String("learning");
        String str3 = new String("Java Tutorial");
        System.out.println(Str1.compareToIgnoreCase(Str2));
        System.out.println(Str1.compareTo(Str2));
        System.out.println();
        String str4 = "Hi";
        String str5 = new String(" Monica");
        System.out.println(str4.concat(str5));
        System.out.println();
        char[] char1 = {'H','e','l','l','o'};
        System.out.println(String.copyValueOf(char1));
        System.out.println(String.copyValueOf(char1, 1, 3));
        System.out.println(Str1.endsWith("ng"));
        System.out.println(str5.length());
        System.out.println(str3.replace('J', 'H'));
        
    }

     
           
        }
        
    

