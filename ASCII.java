package bhagirath;
import java.util.*;
public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.println("enter the char");
        char character = input.next().charAt(0);
        int asciiValue=(int)character;
        System.out.println(asciiValue);
        input.close();
    }
	}

