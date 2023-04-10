package secretMessages;

import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {
		//declaring a new scanner
		Scanner scan = new Scanner(System.in);
		//output to user to ask for message to encode or decode
		System.out.println("Enter a message to encode or decode:");
		//we will store the users input as a String called message
		String message = scan.nextLine();
		//this will be the String that we will output to the user after encoding or decoding
		String output = "";
		
		//For right now this for loop will start at the end of the input message and write each char until it reaches the start, so it will reverse the message
		for (int x = message.length()-1; x>=0 ; x--) {
			output += message.charAt(x);
		}
		System.out.println(output);
	}
}
