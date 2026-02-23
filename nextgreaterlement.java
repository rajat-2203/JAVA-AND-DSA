import java.util.ArrayList;

public class nextgreaterlement {
    public static void main(String[] args) {
        
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<=nums1.length-1;i++) {
            int j = 0;
            while(nums2[j] != nums1[i]) {
                j++;
            }
            if(j == nums2.length-1) {
                list.add(-1);
            }
            else{
            int flag = 0;
            for(int k = j+1;k<=nums2.length-1;k++) {
                if(nums2[k] > nums1[i]) {
                    list.add(nums2[k]);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                list.add(-1);
            }
        }
        }
        for(int i = 0;i<=list.size()-1;i++) {
            System.out.println(list.get(i));
        }
    }
}