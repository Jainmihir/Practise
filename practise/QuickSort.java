package practise;

public class QuickSort {

    private static int partition(int[] nums, int low, int high) {
        int i = low;
        int j = high;
        int pivot = nums[low];

        while(i<j){
            while(i<=high && nums[i] <= pivot){
                i++;
            }
            while(j>=low && nums[j] > pivot){
                j--;
            }
            if(i < j){
                int temp =  nums[i];
                nums[i] =  nums[j];
                nums[j] = temp;
            }

        }
        int temp =  nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    
    }

    public static void qSort(int nums[] ,int low , int high){
        
        if(low  < high){
            int pi = partition(nums, low , high);
            qSort(nums, low, pi);
            qSort(nums, pi+1, high);
        }
    }

  
}
