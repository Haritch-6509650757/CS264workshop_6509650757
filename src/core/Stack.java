package core;

import java.util.ArrayList;

public class Stack implements IStack {

	private ArrayList<Object> stack;
	private final int setSize;
	
	public Stack(int setsize) {
		this.setSize = setsize;
		this.stack = new ArrayList<>(setsize);
	}
	
	@Override
	public int getsize() {
		/* return stack.size(); */
		return stack.size();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	@Override
	public boolean isFull() {
		return stack.size() == setSize;
 	}

	@Override
	public void push(Object elm) throws Exception {
		if(!stack.isEmpty()&&!stack.get(0).getClass().isAssignableFrom(elm.getClass())) {
			throw new Exception("All elements in the stack must be of the same type.");
		}
		if(isFull()==true) {
			throw new Exception("Stack is full.");
		}
		stack.add(elm);
	}
	
	@Override
	public Object pop() throws Exception {
		if(isEmpty()==true) {
			throw new Exception("Stack is empty.");
		}
		return stack.remove(stack.size() - 1);
	}	
	
	@Override
	public Object Top() throws Exception {
		if(isEmpty()==true) {
			throw new Exception("Stack is Empty.");
		}
		return stack.get(stack.size() - 1);
	}

}
