package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "t1")
@Primary
public class MrfTyre  implements Tyre  {
	public void rotate() {
		System.out.println("mrf tyre is rotating");
	}
}
