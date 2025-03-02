class StockSpanner {
    static class Pair{
        int index;
        int value;
        public Pair(int index,int value){
            this.index=index;
            this.value=value;
        }
    }
    Stack<Pair> s;
    int index;
    ArrayList<Integer> list;
    public StockSpanner() {
        s=new Stack<>();
        list=new ArrayList<>();
        index=0;
    }
    
    public int next(int price) {
        list.add(price);
        while(!s.isEmpty() && s.peek().value<=price){
            s.pop();
        }
        int span=s.isEmpty()?(index+1):index-s.peek().index;
        s.push(new Pair(index,price));
        index++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
