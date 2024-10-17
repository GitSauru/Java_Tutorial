
public class ArrayasaReturnvalue {
    public static void PrintArray(int[]redbull){
        for (int i=0; i<redbull.length; i++){
            System.out.print(redbull[i]);
        }
    }
    public static int[]Reverse(int[]store) {
        int[] result = new int[store.length];
        int len = result.length;
        for (int i = 0, j = len - 1; i < len; i++, j--) {
            result[j] = store[i];
        }
        return result;
    }
    public static void main(String[] args) {
        PrintArray(Reverse(new int[]{1,2,3,4,5}));
    }


}
