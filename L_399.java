class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        Map<String, Map<String, Double>> adj_list= new HashMap<>();

        for(int i = 0; i < equations.size(); i++){
            String u = equations.get(i).get(0);    
            String v = equations.get(i).get(1);   
            double val = values[i];
            adj_list.put(u, adj_list.getOrDefault(u, new HashMap<>()));
            adj_list.put(v, adj_list.getOrDefault(v, new HashMap<>()));
            adj_list.get(u).put(v, val);
            adj_list.get(v).put(u, 1/val);
        }

        for(int i = 0; i < queries.size(); i++){
            String src = queries.get(i).get(0);
            String dst = queries.get(i).get(1);
            Set<String> visited = new HashSet<>();

            double w = dfs(adj_list, src, dst, visited);
            res[i] = w;

        }
        return res;
    }

    private static double dfs(Map<String, Map<String, Double>> adj_list, String src, String dst, Set<String> visited){
        //if either src or dst is not in adj_list
        if(!adj_list. containsKey(src) || !adj_list. containsKey(dst)) return -1.0;

        //if both src, and dst are present in adj_list and both are equal
        if(src.equals(dst)) return 1.0;

        //if both src, and dst are present in adj_list and there is a direct connection
        if(adj_list.get(src).containsKey(dst)) return adj_list.get(src).get(dst);

        //if src, and dst are prsnt in adj_list and they dont have direct connection
        visited.add(src);
        for(Map.Entry<String, Double> nei : adj_list.get(src).entrySet()){
            String nxtNode = nei.getKey();
            if(!visited.contains(nxtNode)){
                double temp = dfs(adj_list, nxtNode, dst, visited);
                if(temp != -1.0){
                    return temp * nei.getValue();
                }
            }
        }
        return -1.0;
    }

}
