import java.util.stream.Stream;

public class StreamSkipLimit {

	public static void main(String args[]) {

		Stream.of(1, 2, 3, 4, 5)
				.skip(3)
				.forEach(System.out::println);

		Stream.of(1, 2, 3, 4, 5)
				.limit(5)
				.forEach(System.out::println);

	}

}
// https://www.baeldung.com/java-stream-skip-vs-limit---------------------------
