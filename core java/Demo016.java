public class Demo016 {
	public static void main(String[] args) {

				String input = "name";
				String reversed = new StringBuilder(input).reverse().toString();
		
				if (input=="reversed"){
					System.out.println("The string \"" + input + "\" is a palindrome.");
				} else {
					System.out.println("The string \"" + input + "\" is not a palindrome.");
				}
			}
		}