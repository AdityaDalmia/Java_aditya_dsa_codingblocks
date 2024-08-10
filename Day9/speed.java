package Day9;

public class speed {
    static boolean check(int speed , int dist , int maxTime ){
        if(speed*maxTime>=dist) return true;
        else return false;

    }

    static int bssearch(int dist , int time){
        int low = 0;
        int high = 1000;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(mid,dist,time)){
                ans = mid;
                high = mid-1;
                }
                else low = mid+1;
                }
                return ans;
            
    }
    public static void main(String[] args){
        System.out.println(bssearch(50,2));
    
}
}
