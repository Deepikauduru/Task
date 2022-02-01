package Assignments;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID {

	public static void main(String[] args) {
		ArrayList<String> emails=new ArrayList<String>();
		
		emails.add("ammu@gmail.com");
		emails.add("hani@gmail.com");
		emails.add("geetha833@gmail.com");
		emails.add("Ravi123@gmail.com");
		
		emails.add("abc3yahoo.in");
		emails.add("xy$.co.in");
		
		String pattern="[A-Za-z0-9+.]+@(.+)";
		Pattern p=Pattern.compile(pattern);
		
		for(String email:emails) {
		Matcher match=p.matcher(email);
		System.out.println(email+":"+match.matches()+"\n");
		}

		

	}

}
