import java.util.function.IntPredicate;

public class Predicate_lambda {
	public static void main(String[] args) {
		IntPredicate leaathan18 = i -> i < 18;
		IntPredicate morethan10 = i -> i > 10;
		// System.out.println(leaathan18.test(22));
		// System.out.println(morethan10.test(12));
		//System.out.println(leaathan18.and(morethan10).test(90));
		new Predicate_lambda().cal(10, leaathan18, morethan10);
		new Predicate_lambda().cal(15, leaathan18, morethan10);
	}

	void cal(int x, IntPredicate leaathan18, IntPredicate morethan10) {
		if (leaathan18.and(morethan10).test(x)) {
			System.out.println("< 18 and > 10");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
