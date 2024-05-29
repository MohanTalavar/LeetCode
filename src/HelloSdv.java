import java.util.Scanner;
public class HelloSdv{
    public static void main(String[] args){
        System.out.println("Welcome Mohan");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full Name & email:");
        String fullName = sc.nextLine();
        String email = sc.next();

        System.out.println("Full Name : " + fullName);
        System.out.println("Email : "+email);

    }
}