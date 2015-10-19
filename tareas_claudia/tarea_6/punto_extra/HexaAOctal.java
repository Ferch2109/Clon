import java.util.Scanner;


public class HexaAOctal{
	public static void main(String[] args) {
		System.out.println("Ingresa tu numero\nHexadecimal a octal");
	
		Scanner in = new Scanner(System.in);
		String hex = in.nextLine();
		int num = Integer.parseInt(hex, 16);

		String octal = Integer.toOctalString(num);

		System.out.println(octal);

	}
}