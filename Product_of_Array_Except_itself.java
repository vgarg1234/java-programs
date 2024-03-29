public class Product_of_Array_Except_itself {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = productExceptSelf(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] productExceptSelf(int[] arr) {
        int[] left = new int[arr.length];
        left[0] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        int[] right = new int[arr.length];
        right[right.length - 1] = 1;
        for (int j = right.length - 2; j >= 0; j--) {
            right[j] = right[j + 1] * arr[j + 1];
        }
        for (int i = 0; i < right.length; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
    }
}
