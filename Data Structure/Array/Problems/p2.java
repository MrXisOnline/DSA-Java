
import java.util.Arrays;

public class p2 {
    public static void movezeroes_mine(int arr[]) {
        // Complexity O(n^2)
        for (int i=0; i<arr.length-1; i++) if (arr[i] == 0) for (int j=i+1; j<arr.length; j++) if (arr[j] != 0) {
            arr[i] = arr[j];
            arr[j] = 0;
            break;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void movezeroes_gog(int[] arr) {
        // Complexity O(n)
        int count=0;
        for (int i=0; i<arr.length; i++) if (arr[i] != 0) arr[count++] = arr[i];
        for (int i=count; i<arr.length; i++) arr[i] = 0;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {4, 0, 5, 0, 2, 6};
        movezeroes_mine(arr);
        movezeroes_gog(arr);
    }
}
