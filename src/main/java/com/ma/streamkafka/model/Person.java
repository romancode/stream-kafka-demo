package com.ma.streamkafka.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
public class Person {
	private Integer id;
	private String name;
	private String country;
	private String gender;
}
