public class Demo069 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        System.out.println("Elements of the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }
        
        System.out.println("\nSum of all elements: " + sum);
    }
}
