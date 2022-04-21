package OnlineShoppingProject;

	import java.util.Scanner;

	public class UserLoginPage {
	    public String user_name;
	    public int user_id = 1;
	    private String password;
	    public static int count = 1;
	    public static String input;

	    public UserLoginPage (String Ruser, String Rpassword) {

	        this.user_id = count++;
	        this.user_name = Ruser;
	        this.password = Rpassword;
	        count++;

	        System.out.printf("User %s has been crated \n", Ruser);
	        System.out.printf("Enter 'login' to log in or 'register' to open another account");

	    }

	    public static void login(String Luser, String Lpassword) {
	        for (int i = 1; i <= count; i++) {
	            System.out.printf("Enter 'login' to log in or 'register' to open another account");
	            // user_id.users
	            // if(this.user_name)
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("login");
	        System.out.println("register");
	        input = scanner.nextLine();


	            while (input.equals("login")) {

	                System.out.println("username");
	                String Luser = scanner.nextLine();
	                System.out.println("Password");
	                String Lpassword = scanner.nextLine();
	                int a = count;
	                login(Luser, Lpassword);
	                System.out.println("");
	                input = scanner.nextLine();
	            }
	            while (input.equals("register")) {

	                System.out.println("username");
	                String Ruser = scanner.nextLine();
	                System.out.println("Password");
	                String Rpassword = scanner.nextLine();
	                UserLoginPage count = new  UserLoginPage(Ruser, Rpassword);
	                System.out.println("");
	                input = scanner.nextLine();
	            }
	            while ((!input.equals("register")) || (!input.equals("login"))) {
	                System.out.println("invild option, chose login or regiser!");
	                input = scanner.nextLine();


	        }
	            do
	            {
	                System.out.println("Enter \"login\", \"register\", or \"exit\"");
	                input = scanner.nextLine();
	                if (input.equals("login"))
	                {
	                    // get login details
	                }
	                else if (input.equals("register"))
	                {
	                    // get register details
	                }
	                else if (input.equals("exit"))
	                {
	                    break; // exit the loop
	                }
	                else
	                {
	                    // invalid input, tell them to try again
	                }
	            }
	            while (true);
	    }
	}
	

