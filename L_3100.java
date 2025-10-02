class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       int drunk = numBottles;
       while(numBottles >= numExchange){
        numBottles = numBottles - numExchange + 1;  //+1 because another full botttle is getting added
        drunk++;
        numExchange++;
       }
       return drunk;
    }
}
