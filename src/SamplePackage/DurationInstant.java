package SamplePackage;

import java.time.Duration;
import java.time.Instant;

public class DurationInstant {
	public static void main(String[] args) throws InterruptedException {
		Instant first = Instant.now();
		Thread.sleep(10000);
		Instant second = Instant.now();
		Duration d = Duration.between(first, second);
		System.out.println(d);
	}
}
