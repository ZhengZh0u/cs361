/**
 * 
 */
package mystack;

/**
 * @author ZhengZhou 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack==null) {
			throw new IllegalArgumentException("the stack is null");
        }
        T value = theStack.val;
        theStack = theStack.next;
        return value;  
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, theStack);
		if(v instanceof Number) {
		System.out.println("You pushed "+v);
		}else if (v instanceof Person) {
	        Person person = (Person) v; 
	        System.out.println( "You pushed "+person.getFname() + " " + person.getLname());
		}	
        theStack = newNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> myIntStack= new MyStack<>();
		myIntStack.push(1);
		myIntStack.push(2);
		int poppedValue = myIntStack.pop();
        myIntStack.push(5);

		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
        MyStack<Person> myPStack= new MyStack<>();
        Person p1 = new Person("Zheng","Zhou");
        myPStack.push(p1);
        Person p2 = new Person("Christelle"," Scharff");
        myPStack.push(p2);
	}

}
