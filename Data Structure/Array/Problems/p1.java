// package Problems;


public class p1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 9};
        largest3(arr);
    }
    
    public static void largest3(int[] arr) {
        int i, first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (i=0; i<arr.length; i++){
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second){
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("First: " + first + ", Second: " + second + ", Third: " + third);
    }
    
}
