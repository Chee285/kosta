import java.util.*;

https://programmers.co.kr/learn/courses/30/lessons/42583

public class Bridge {
	int bridge_length;
	int weight;
	int currentweight;
	int totaltime;
	Queue<Integer> bridgeQueue = new LinkedList<>();
	
	Bridge(int bridge_length, int weight) {
		this.bridge_length = bridge_length;
		this.weight = weight;
	}
	
	void addBridgeQueue(int truck_weight) {
		bridgeQueue.add(truck_weight);
		currentweight += truck_weight;
		totaltime++;
	}
	
	int getTime() {
		return totaltime+bridge_length;
	}
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Bridge b = new Bridge(bridge_length, weight);
        for(int i : truck_weights) {
			while(true) {
				if(b.bridgeQueue.isEmpty()) {
					b.addBridgeQueue(i);
					break;
				}
				else if(b.bridgeQueue.size()==b.bridge_length) {
					b.currentweight -= b.bridgeQueue.poll();
				}
				else {
					if(b.currentweight + i > b.weight) {
						b.totaltime++;
						b.bridgeQueue.add(0);
					}
					else {
						b.addBridgeQueue(i);
						break;
					}
				}
			}
		}
        return b.getTime();
    }
}
