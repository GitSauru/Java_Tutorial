public class ArrayasaMethod {
    public static void printArray(int[] Array){
        for(int i=0; i<Array.length; i++){
        System.out.print(Array[i]+" ");
    }
}

    public static void main(String[] args) {
        printArray(new int[]{3,2,5,6,4});
    }
}
