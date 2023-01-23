package it.develhope.encapsulation02;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
	private String name;
	private String surname;
	private double height;
	private int age;
}
