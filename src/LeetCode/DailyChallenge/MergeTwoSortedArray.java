package LeetCode.DailyChallenge;

public class MergeTwoSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=0, j=0;
        int k = m;
        while (i<m+n && j<n)
        {
            if (nums1[i]!=0 && nums1[i]<nums2[j])
            {
                i++;
            }
            else if (nums1[i]>nums2[j])
            {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums1[k] = temp;
                i++;
                j++;
                k++;
            }
            else
            {

            }
        }
    }
}
