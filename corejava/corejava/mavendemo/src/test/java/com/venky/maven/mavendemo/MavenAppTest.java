package com.venky.maven.mavendemo;

import org.junit.Test;

import com.venky.maven.mavendemo.App;

import junit.framework.Assert;

public class MavenAppTest {

	@AnnotationTest2
	public void givenANameWhenHelloThenReturnHelloName() {
		App app = new App();
		String result = app.hello("Bharath");
		Assert.assertNotNull(result);
		Assert.assertEquals("Hello Bharath", result);

	}
}
