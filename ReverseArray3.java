public class ReverseArray3 {
    public static void PrintArray(int[]numbers){
        for(int i=0; i<numbers.length; i++){
        System.out.println(numbers[i]);
        }
    }

    public static int[] Reverse(int[]store){
        int[] result = new int[store.length];
        int length = result.length;
        for(int i=0, j=length-1; i<length;i++,j--){
            result[j]=store[i];
        }
        return result;
    }
    public static void main(String[] args) {
        PrintArray(Reverse(new int[]{9,8,7,6,5}));
    }
}
