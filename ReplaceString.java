package com.bridge.programs;

import java.util.*;

public class ReplaceString {
	public static void main(String[] args) {
		
		String str="hello <<UserName>>,how are you?";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String n1=sc.next();
		
		
		if(n1.length()>3) {
		String n2=str.replaceAll("<<UserName>>",n1);
		
		 System.out.println(n2);
		
		}
        
	}

}
