class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x); // Add elemtn into Q2
        while(q1.isEmpty()==false){ //Push all elements, element by elemnt from Q1 to Q2 
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1; //Swap Q1 and Q2
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
        return q1.poll(); //we will pop from Q1's top
    }
    
    public int top() {
        return q1.peek(); //we will top from Q1's top
    }
    
    public boolean empty() {
        //if both Q1 and Q2 is empty, it means our stack is empty so return true, else return false
        return (q2.isEmpty()==true && q1.isEmpty()==true) ? true : false;
    }
}