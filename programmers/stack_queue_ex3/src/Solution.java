import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int truck_index = 0;
        int temp;
        int current_index = 0;
        int total_weight = truck_weights[truck_index];
        Queue<Integer> passing = new LinkedList<>();
        HashMap<Integer, Integer> index_and_time = new HashMap<>();
        HashMap<Integer, Integer> index_and_weight = new HashMap<>();

        passing.offer(truck_index);
        index_and_time.put(truck_index, 1);
        index_and_weight.put(truck_index, truck_weights[truck_index]);

        while(!passing.isEmpty()){
            if(index_and_time.get(passing.peek()) == bridge_length){
                total_weight -= index_and_weight.get(passing.peek());
                index_and_time.remove(passing.peek());
                index_and_weight.remove((passing.peek()));
            }
            if(!passing.isEmpty()){
                for(int i = passing.peek(); i < passing.peek() + passing.size(); i++){
                    temp = index_and_time.get(i);
                    index_and_time.put(i, temp + 1);
                }
            }
            if(truck_index + 1 < truck_weights.length && passing.size() + 1 <= bridge_length && total_weight + truck_weights[truck_index] <= weight){
                truck_index++;
                total_weight += truck_weights[truck_index];
                passing.offer(truck_index);
                index_and_time.put(truck_index, 1);
                index_and_weight.put(truck_index, truck_weights[truck_index]);
            }
            answer++;
        }
        return answer;
    }
}