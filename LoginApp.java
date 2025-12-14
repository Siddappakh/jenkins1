import java.util.Scanner;
public class LoginApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");  
        String pwd = sc.nextLine();  
        if (user.equals("admin") && pwd.equals("1234")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please try again.");
        }   
    }
    
}
