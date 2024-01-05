import java.util.Arrays;

public class p3 {
    public static void rearrangemaxmin(int[] arr, int start) {
        int temp;
        if (start >= arr.length-1) System.out.println(Arrays.toString(arr));
        else {
            temp = arr[start];
            arr[start] = arr[arr.length-1];
            for (int i=arr.length-1; i>start+1; i--) arr[i] = arr[i-1];
            arr[start+1] = temp;
            System.out.println(Arrays.toString(arr));
            rearrangemaxmin(arr, start+2);
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        rearrangemaxmin(arr, 0);
    }
}
