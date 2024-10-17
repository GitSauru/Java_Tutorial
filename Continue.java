public class Continue {
public static void main(String[] args) {
    for(int i = 50; i>=0; i-=10){
        if(i==30){
            continue;
        }
        System.out.println(i);
    }
}
}
