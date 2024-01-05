
public class multidimensional_array {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 2;
        arr[0][1] = 4;
        arr[0][2] = 1;
        arr[1][0] = 5;
        arr[1][1] = 7;
        arr[1][2] = 8;
        arr[2][0] = 9;
        arr[2][1] = 1;
        arr[2][2] = 3;
        for (int[] x: arr){
            for (int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }    
}
