package src.ch.fhnw.oop2.module05.streams;

import java.util.stream.Stream;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Stream
			.iterate(0, n -> n + 2)
			.limit(10)
			.forEach(System.out::println);
	}
}


