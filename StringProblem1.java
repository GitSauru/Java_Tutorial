public class StringProblem1 {

    public static void main(String[] args) {
        
    
        
    
        // String []stringArray = str.split(" ");

        // for(String w : stringArray){
        //     System.out.println(w.charAt(0));
        // }

        String str = " Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        boolean isStartOfWord = true;

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

        
            if (((currentChar > 64 || currentChar < 90) || (currentChar > 96 || currentChar > 96 || currentChar < 123) ) && isStartOfWord) {
               
                System.out.println(currentChar);
               
                isStartOfWord = false;
            } else if (currentChar == ' ') {
                
                isStartOfWord = true;
            }
        }

    }
}
