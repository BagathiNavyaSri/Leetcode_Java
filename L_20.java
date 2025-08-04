//Checking False Case
import java.util.*;
class L_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                //Checking false case
                if((ch ==')' && top != '(') ||
                    ( ch == ']' && top != '[') ||
                    (ch == '}' && top !='{')){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    }
}


//Checking True case


// class Solution {
//     public static boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         boolean res = true;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             if (c == '(' || c == '[' || c == '{') {
//                 st.push(c);
//             } else {
//                 if (st.isEmpty()) {
//                     return false;
//                 }
//                 char top = st.pop();
//                 if ((c == ')' && top == '(') ||
//                         (c == ']' && top == '[') ||
//                         (c == '}' && top == '{')) {
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         return st.isEmpty();
//     }
// }