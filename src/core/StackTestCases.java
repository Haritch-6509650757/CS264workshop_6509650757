package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
		public void testCreateNewEmptyStack() throws Exception {
			Stack s1 = new Stack(0);
			
			assertEquals(true, s1.isEmpty()); 
			assertEquals(0, s1.getsize());
			
		}
		
	//TC2
		public void testPushElmTop() throws Exception {
			Stack s2 = new Stack(2);
			/*
			 * assertEquals(false, s2.isFull()); s2.push(1); System.out.println(s2.Top());
			 */
			int x = 1;
			boolean isFullStack = s2.isFull();
			if(isFullStack == false) {
				s2.push(x);
			}
			System.out.println(s2.Top());
			
			assertEquals(x, s2.Top());
		}
	
	//TC3
		public void testLastinFirstout() throws Exception {
			Stack s3 = new Stack(3);
			int x=1,y=2,z=3;
			s3.push(x);
			s3.push(y);
			s3.push(z);
			assertEquals(z, s3.pop());
			assertEquals(y, s3.pop());
			assertEquals(x, s3.pop());
		}
		
	//TC4
		public void testPushelmtolimit() throws Exception {
			Stack s4 = new Stack(3);
			s4.push(1);
			s4.push(2);
			s4.push(3);
			s4.push(4); 
		}
		
}
