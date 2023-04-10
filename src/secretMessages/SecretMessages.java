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
		//set the key that will be used for encoder/decoder
		//we will just add 13 to each character of the message for encoding and subtract for decoding
		char key = 13;
		
		//For right now this for loop goes through and add the key(13) to each char and converts it to that char
		//example A will equal N by adding 13
		for (int x = 0; x < message.length(); x++) {
			output += (char)(message.charAt(x) + key);
		}
		System.out.println(output);
	}
}
