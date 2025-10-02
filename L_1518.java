class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        int curr_count = 0;
        int numBottles1 = numBottles;    //creating a duplicate to track the changes in numBottles
        while(numBottles1 >= numExchange){
            curr_count = 0;
            while(numBottles1 >= numExchange){
                numBottles1 = numBottles1 - numExchange;
                curr_count++;
                count++;
            }
            numBottles1 = numBottles1 + curr_count;
        }
        return numBottles + count;
    }
}
