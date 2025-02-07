public class Demo068{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int count = 0;
        
        System.out.println("Even elements of the array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                count++;
            }
        }
        
        System.out.println("\nCount of even numbers: " + count);
    }
}
