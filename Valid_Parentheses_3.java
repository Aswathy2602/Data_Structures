package CIE_1;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Paranthesis to check validity: ");
        String s=sc.nextLine();
        solution ob=new solution();
        System.out.println(ob.validparantheses(s));
    }
}
class solution{
    public boolean validparantheses(String s){
        char []arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                st.push(arr[i]);
            else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (arr[i] == ')' && top != '(' || arr[i] == '}' && top != '{' || arr[i] == ']' && top != '[')
                    return false;
            }
        }
        return  st.isEmpty();
    }
}