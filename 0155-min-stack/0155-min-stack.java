class MinStack {
     Stack<Long> st = new Stack<>();
    long min;
    public MinStack() {
        // while(st.isEmpty()==false)
        //     st.pop();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long value = Long.valueOf(val);
           if(st.isEmpty()){
               st.push(value);
               min = value;
           }else{
               if(value<min){
                   st.push(2*value - min);
                   min = value;
               }else{
                   st.push(value);
               }
           }
    }
    
    public void pop() {
       // if(st.isEmpty()) return -1;
            Long val = st.pop();
            if(val < min){
                Long a = min;
                min = 2*min - val;
                // return a.intValue();
            }
           // return val.intValue();
    }
    
    public int top() {
        if(st.isEmpty())
              return -1;
            Long val = st.peek();
            if(val<min){
                 Long a = min;
                return a.intValue();
            }
            return val.intValue();
    }
    
    public int getMin() {
        if(st.isEmpty())
               return -1;
            Long a = min;
           return a.intValue();
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