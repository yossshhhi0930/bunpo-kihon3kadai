java:Lambda.java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10000);
		stream.forEach( e ->  System.out.println( currentTime() +  " " + e ));
	}

	private static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}
```


