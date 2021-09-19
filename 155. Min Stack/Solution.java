class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    
    public MinStack() {
            
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= stack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            int poppedEle = stack.pop();
            if(poppedEle == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
