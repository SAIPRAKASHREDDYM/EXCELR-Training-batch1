public class Demo054 {
    public static int add(int a) {
        return a;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("Add one number: " + add(5));          
        System.out.println("Add two numbers: " + add(5, 10));    
        System.out.println("Add three numbers: " + add(5, 10, 15)); 
    }
}
