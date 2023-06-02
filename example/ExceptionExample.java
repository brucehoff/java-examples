
public class ExceptionExample {
	
	public static void main(String[] args) {
		try {
			a();
		} catch (RuntimeException re) {
			throw re;
		}
		System.out.println("Everything is wonderful!");
	}

	private static void a() {
			b();
	}

	private static void b() {
		throw new IllegalArgumentException("Exception in b!");
	}

}
