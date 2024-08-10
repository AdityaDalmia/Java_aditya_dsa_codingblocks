package Day8;

public class nger {
    static int[] nser(int[] arr){
        int[] nser = new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(nser==Interger.MAX_VALUE){
                nser[i]=minEle;
            }
            else{}
            nser[i]=minEle;
            
            minEle=Math.min(minEle,arr[i]);
            }
        }
        return nser;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 1, 2, 3, 4,};
        int[] nser = nser(arr);
        for (int i = 0; i < nser.length; i++) {
            System.out.print(nser[i] + " ");
            }
    }
}
