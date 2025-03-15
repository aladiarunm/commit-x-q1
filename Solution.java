import java.util.Scanner;

class Solution{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int max = 0;
        int l=0,r=1;
        while(r<n){
            int sum=0;
            for(int i=l;i<r;i++){
                sum+=arr[i];
            }
            r++;
            if(sum<max) l++;
            max = Math.max(sum,max);
        }
        
        System.out.println(max); 
    }
}