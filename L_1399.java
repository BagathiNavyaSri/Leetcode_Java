import java.util.*;
class L_1399 {
    public static int countLargestGroup(int n) {
        Map<Integer, Integer> dict = new HashMap<>();
        for(int i = 1; i<= n;i++){
            int sum = digitSum(i);
            dict.put(sum, dict.getOrDefault(sum, 0)+1);
            
        }

        int max = 0;        
        for(int val : dict.values()){
            if(val > max){
                max = val;
            }
        }

        int count = 0;
        for(int val : dict.values()){
            if(val == max){
                count++;
            }
        }
        return count;
    }

    private static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(countLargestGroup(n1));
        sc.close();
    }
    
}