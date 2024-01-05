public class array{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        var arr2 = new int[5];
        arr2[0] = 4;
        arr2[2] = 6;
        arr2[1] = 5;
        arr2[4] = 9;
        arr2[3] = 3;
        for (int x: arr2){
            System.out.print(x + " ");
        }
    }
}