package Day3;
public class function {
    static void armstrong(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;

}
        Math.pow (n%10, armstrong);
public static void main(String[] args) {
    System.out.println(armstrong(995831));
}
}
   