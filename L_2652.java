import java.util.*;
class L_2652 {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i% 3 == 0 || i%5 == 0 || i%7 == 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfMultiples(n));
        sc.close();;
    }
}