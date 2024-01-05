class Operations{
    int[] arr;
    public Operations(int[] a){
        arr = a;
    }
    public int searching(int e){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == e){
                return i;
            }
        }
        return -1;
    }
    public int[] reverse(){
        int rev[] = new int[arr.length];
        for (int i=0; i<arr.length; i++) rev[i] = arr[arr.length-i-1];
        return rev;
    }
    public int[] lrotate(){
        int[] rev = arr.clone();
        int temp = rev[arr.length-1];
        int temp2;
        for (int i=arr.length-1; i>0; i--){
            temp2 = rev[i-1];
            rev[i-1] = temp;
            temp = temp2;
        }
        rev[arr.length-1] = temp;
        return rev;
    }
    public int[] rrotate(){
        int[] rev = arr.clone();
        int temp = rev[0];
        int temp2;
        for (int i=0; i<arr.length-1; i++){
            temp2 = rev[i+1];
            rev[i+1] = temp;
            temp = temp2;
        }
        rev[0] = temp;
        return rev;
    }
    public void subarrays(int start, int end){
        if (end == arr.length) return;
        else if (start > end) subarrays(0, end+1);
        else {
            System.out.print("[");
            for (int i=start; i<end; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[end] + "]");
            subarrays(start+1, end);
        }
        return;
    }
}
public class array_operations {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 6, 8, 0};
        Operations op = new Operations(arr);
        System.out.println(op.searching(6));
        for (int x: op.reverse()){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x: op.lrotate()){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x: op.rrotate()){
            System.out.print(x + " ");
        }
        System.out.println();
        op.subarrays(0, 0);
    }
}
