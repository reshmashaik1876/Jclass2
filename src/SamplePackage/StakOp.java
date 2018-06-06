package SamplePackage;
import java.util.Stack;
public class StakOp {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		System.out.println(s);
		System.out.println(s.contains(2));
		System.out.println(s.isEmpty());
	}

}
