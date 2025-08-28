import java.util.Scanner;

class L_3498 {
    public static int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i<s.length();i++){
            int prod = Math.abs(s.charAt(i)-'z'-1)*(i+1);
            sum += prod;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseDegree(s));
        sc.close();
    }
}