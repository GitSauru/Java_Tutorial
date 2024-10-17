public class ReverseStringArray {
    public static void  PrintArray(String[]Names){
      for(int i=0; i<Names.length; i++){
        System.out.println(Names[i]);
      }
    }

    public static void  PrintArray2(int[]numbers){
        for(int i=0; i<numbers.length; i++){
          System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        PrintArray(Reverse(new String[]{"Saurabh","Rahul","Sarvesh"}));
        PrintArray2(Reverse2(new int[]{1,2,3,4}));
    }

    public static String[] Reverse(String[] store){
     String[] result  = new String[store.length];
     int length = store.length;
     for(int i=0, j=length-1; i<length; i++,j--){
        result[j] = store[i];
     }
     return result;

    }

    public static int[] Reverse2(int[] store){
        int[] result2  = new int[store.length];
        int length = store.length;
        for(int i=0, j=length-1; i<length; i++,j--){
           result2[j] = store[i];
        }
        return result2;
   
       }
}
