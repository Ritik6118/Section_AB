package Lec_01;

public class Maximum_subarray_Kadens_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] arr) {
        int max=-99999;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<=0){
                sum=0;
            }
        }
        return max;
    }

}
