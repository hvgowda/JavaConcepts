package concepts.nestedclasses;

/**
 * If a declaration of a type (such as a member variable or a parameter name) in
 * a particular scope (such as an inner class or a method definition) has the
 * same name as another declaration in the enclosing scope, then the declaration
 * shadows the declaration of the enclosing scope. You cannot refer to a
 * shadowed declaration by its name alone.
 *
 */
public class Shadowing {

	public int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + Shadowing.this.x);
		}
	}

	public static void main(String... args) {
		Shadowing shadowing = new Shadowing();
		Shadowing.FirstLevel firstLevel = shadowing.new FirstLevel();
		firstLevel.methodInFirstLevel(23);
	}

}