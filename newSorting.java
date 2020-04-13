public class newSorting {

    public void newSorting(int[] nums, int size){
        //base case
        if(nums.length <= size) {
            quickSort(nums, 0, nums.length - 1);
        }

        else{
            int mid = nums.length/2;
            int[] left = new int[mid];
            int[] right = new int[nums.length-mid];
            fill(nums,left,right,mid);
            newSorting(left, size);
            newSorting(right, size);
            mergeSorted(nums, left, right);
        }
    }

    private void fill(int[] nums, int[] left, int[] right, int mid){
        for(int i = 0; i < mid; i++){
            left[i] = nums[i];
        }

        for(int i = 0; i < right.length; i++){
            right[i] = nums[mid++];
        }
    }

    private void mergeSorted(int[] nums, int[] left, int[] right){
        int indexLeft = 0;
        int indexRight = 0;
        int indexNums = 0;

        while(indexLeft < left.length && indexRight < right.length){
            if(left[indexLeft] <= right[indexRight]){
                nums[indexNums] = left[indexLeft];
                indexLeft++;
            }
            else{
                nums[indexNums] = right[indexRight];
                indexRight++;
            }
            indexNums++;
        }

        while(indexLeft < left.length){
            nums[indexNums] = left[indexLeft];
            indexLeft++;
            indexNums++;
        }

        while(indexRight < right.length){
            nums[indexNums] = right[indexRight];
            indexRight++;
            indexNums++;
        }
    }

    private void quickSort(int[] nums, int beginning, int last){
        if(beginning < last){
            int position = part(nums, beginning, last);

            quickSort(nums, beginning, position - 1);
            quickSort(nums, position + 1, last);
        }
    }

    private int part(int[] nums, int beginning, int last){
        int pivot = nums[beginning];
        int less = beginning;
        int more = last;

        while(less < more){
            while(less <= last && nums[less] <= pivot){
                less++;
            }
            while(more >= beginning && nums[more] > pivot){
                more--;
            }
            if(less < more){
                int temp = nums[less];
                nums[less] = nums[more];
                nums[more] = temp;
            }
        }
        int temp = pivot;
        nums[beginning] = nums[more];
        nums[more] = temp;

        return more;
    }
}