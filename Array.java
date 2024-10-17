public class Array {

    public static void main(String[] args) {

        char[] myArray;

        myArray = new char [5];
    
        myArray[0]= 'H';
        myArray[1]= 'e';
        myArray[2]= 'l';
        myArray[3]= 'l';
        myArray[4]= 'o';

        System.out.println(myArray[1]);
        System.out.println(myArray);
        System.out.println(myArray.length);

        double[] myList = {1.1,2.1,3.1,4.1,5.1};
      
        for(int i=0; i<myList.length; i++){
            System.out.println(myList[i]);
        }

        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        int[] numbers = {1,2,3,4,5};
        double a = 0;
        for(int i=0; i<numbers.length; i++){
            a = a+numbers[i];
        }
        System.out.println(a);

        
   
    }
}
