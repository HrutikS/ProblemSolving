class Solution {
    public String destCity(List<List<String>> paths) {
        //First approach
        // List<String> destinations = new ArrayList<>();
        // for(List<String> city : paths){            
        //     destinations.add(city.get(1));
        // }
        // for(List<String> city : paths){
        //     if(destinations.contains(city.get(0))){
        //         destinations.remove(city.get(0));
        //     }
        // }
        // return destinations.get(0);

        //Optimal Solution
        Set<String> set = new HashSet();
        for(List<String> path : paths){
            set.add(path.get(0));
        }
        for(List<String> path : paths){
            if(!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return null;
    } 
}
