import java.util.Arrays;

public class p4 {
    public static int[] reverse(int[] arr, int start, boolean end) {
        int temp;
        if (end) {
            for (int i=start; i<arr.length/2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        } else {
            for (int i=0; i<start/2; i++) {
                temp = arr[i];
                arr[i] = arr[start-1-i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void lrotateby(int[] arr, int d) {
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse(arr, 2, true)));
    }
}
