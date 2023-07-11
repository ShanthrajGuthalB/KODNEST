import java.util.Scanner;

public class TheSecretMessageDecode {


	    public int decodeCharacter(char ch) {
	        return (int) ch;
	    }

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	TheSecretMessageDecode decoder = new TheSecretMessageDecode();
	    	System.out.println("Enter secret code");
	    	char ch=scan.next().charAt(0);
	        System.out.println(decoder.decodeCharacter(ch));
	        scan.close();
	    }
	}
