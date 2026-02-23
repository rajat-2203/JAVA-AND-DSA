public class missingelement {
    public static void main(String[] args) {
        int[] arr = {4,0,1,2};
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0;j<arr.length;j++) {
            if(arr[j] != j) {
                System.out.println(j);
                break;

            }
        }
    }
    
}
