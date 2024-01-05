
public class passing_returning_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = passing_array(arr);
        System.out.println(sum);
        int[] narr = returning_array(sum);
        for (int x: narr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static int passing_array(int[] arr){
        int sum = 0;
        for (int x: arr){
            sum += x;
        }
        return sum;
    }
    public static int[] returning_array(int sum){
        int arr[] = new int[sum];
        for (int i=0; i<sum; i++){
            arr[i] = 1;
        }
        return arr;
    }
}
