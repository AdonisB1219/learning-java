

class Solution {
	
	public static void main(String[] args) {
		int[] arr1 = {2,5,6,0,0,0};
		int[] arr2 = {1,2,3};
		merge2(arr1, 3, arr2, 3);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cont1 = n;
        int cont2 = 0;
        int temp;
        if(m==0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
        } else{
        for (int i = 0; i < cont1; i++){
            for (int j = cont2; j < m + n; j++){
                if (nums1[j] < nums2[i] && nums1[j] != 0){
                    continue;
                } else {
                    cont2 = j;
                    temp = nums1[j];
                    nums1[j] = nums2[i];
                    for (int k = nums1.length - n; k > j; k--){
                        nums1[k] = nums1[k-1];
                    }
                    if(j+1 < nums1.length) nums1[j + 1]= temp;
                    break;
                }
            }
        }
        System.out.println(nums1.toString());
        }
        
    }
    
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? 
                                 nums1[tail1--] : nums2[tail2--];
        }

de         while (tail2 >= 0) { //only need to combine with remaining nums2, if any
            nums1[finished--] = nums2[tail2--];
        }
    }
}