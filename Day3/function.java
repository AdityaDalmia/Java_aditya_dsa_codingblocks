package Day3;
public class function {
    static int digit(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;

}

public static void main(String[] args) {
    System.out.println(digit(995831));
}
}
   