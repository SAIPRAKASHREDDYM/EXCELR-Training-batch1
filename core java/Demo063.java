public class Demo063{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        if (arr.length >= 1) {
            int sum = arr[0] + arr[arr.length - 1];
            System.out.println("Sum of first and last element: " + sum);
        } else {
            System.out.println("Array must have at least one element");
        }
    }
}
