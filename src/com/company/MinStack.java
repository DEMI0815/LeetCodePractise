package com.company;

import java.util.Stack;

class MinStack {

    /**
     * initialize your data structure here.
     */
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
        stack.add(x);
        helper.add(helper.isEmpty()? x : Math.min(x, helper.peek()));
    }

    public void pop() {
        stack.pop();
        helper.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
