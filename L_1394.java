import java.util.*;
class L_1394 {
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> dict = new HashMap<>();
        for(int num : arr){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }
        int res = -1;
        List<Integer> lst = new ArrayList<>(dict.keySet());
        for(int num : lst){
            if(num == dict.get(num)){
                res = Math.max(res, num);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findLucky(arr));
        sc.close();
    }
}