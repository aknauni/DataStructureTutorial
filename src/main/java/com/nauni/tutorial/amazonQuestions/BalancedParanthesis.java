package com.nauni.tutorial.amazonQuestions;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
	
/*	static class stack 
    {
        int top=-1;
        char items[] = new char[100];
 
        void push(char x) 
        {
            if (top == 99) 
            {
                System.out.println("Stack full");
            } 
            else
            {
                items[++top] = x;
            }
        }
 
        char pop() 
        {
            if (top == -1) 
            {
                System.out.println("Underflow error");
                return '\0';
            } 
            else
            {
                char element = items[top];
                top--;
                return element;
            }
        }
 
        boolean isEmpty() 
        {
            return (top == -1) ? true : false;
        }
    }
*/
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression");
		String expression = sc.nextLine();
		char exp[] = expression.toCharArray();
		
		if(isBalancedExp(exp))
			System.out.println("Balanced Expression");
		else
			System.out.println("Not Balanced Expression");
	}

	private static boolean isBalancedExp(char[] exp) {
		
		Stack st = new Stack();
		
		for(int i=0; i<exp.length; i++){
			if(exp[i]=='{' || exp[i]=='[' || exp[i]=='('){
				st.push(exp[i]);
			}
			
			if(exp[i]=='}' || exp[i]==']' || exp[i]==')'){
				if(st.isEmpty()){
					return false;
				}
				else if(!isMatchingPair((char) st.pop(), exp[i])){
					return false;
				}
			}
			
		}
		
		if(st.isEmpty())
			return true;
		else 
			return false;
		
	}

	private static boolean isMatchingPair(char object, char c) {
		if(object == '{' &&  c == '}')
			return true;
		else if(object == '(' &&  c == ')')
			return true;
		else if(object == '[' &&  c == ']')
			return true;
		else return false;
	}

}
