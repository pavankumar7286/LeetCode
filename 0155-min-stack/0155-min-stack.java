class MinStack {

    private Stack<Integer> main;
    private Stack<Integer> min;

    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
        
    }
    
    public void push(int value) {
        if(main.size()==0 || min.peek()>=value){
            min.push(value);
        }
        main.push(value);
    }
    
    public void pop() {
        int ele1 = main.pop();
        int ele2 = min.peek();
        if(ele1==ele2){
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();   
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */