public class Selectionsort {
    public static void main(String[] args) {
        int nums[]={5,3,8,4,7,2};
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int minpos=i;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]<nums[minpos])
                {
                    minpos=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minpos];
            nums[minpos]=temp;
            count++;
        }
        System.out.println("swap count is:"+count);
        System.out.println("sorted array is:");
        for(int nums1:nums)
        {
            System.out.print(nums1+" ");
        }
    }
}
