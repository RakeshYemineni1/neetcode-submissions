class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int st : stones){
            pq.offer(st);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();

            if(y < x) pq.add(x - y);
        }

        return (pq.size() == 1) ? pq.poll() : 0;
    }
}
