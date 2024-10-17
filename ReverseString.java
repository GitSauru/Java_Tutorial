public class ReverseString {
    public static void main(String[] args) {
        String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        String temp = "";
        for(int i=0 ; i <= s.length()-1; i++){
            temp = s.charAt(i) + temp;
        }
        System.out.println(temp);
    }
}
