import java.util.*;
class L_2780 {
    public static int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> left=new HashMap<>();
        Map<Integer,Integer> right=new HashMap<>();
        for(int num:nums){
            right.put(num,right.getOrDefault(num, 0)+1);
        }
        int n=nums.size();
        for(int i=0;i<n;i++){
            int num=nums.get(i);
            left.put(num,left.getOrDefault(num,0)+1);
            right.put(num,right.get(num)-1);
            if(left.get(num)*2>(i+1) && right.get(num)*2>(n-1-i)){
                return i;
            }    
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            nums.add(sc.nextInt());
        }
        System.out.println(minimumIndex(nums));
        sc.close();
    }
}
