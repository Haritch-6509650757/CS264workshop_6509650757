package core;

public interface IStack {
	
	int getsize();
	boolean isEmpty();
	boolean isFull();
	void push(Object elm)throws Exception;
	Object pop()throws Exception;
	Object Top()throws Exception;
	
	/* void push(Object elm)throws Exception; */
}
