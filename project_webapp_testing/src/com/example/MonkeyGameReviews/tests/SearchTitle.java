package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SearchTitle extends SetUp {

	public SearchTitle() {
		super();
	}

	@Test
	public void testSearchTitle() throws Exception {
		super.initialLogin();
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/Homepage");
		driver.findElement(By.id("gameName")).click();
		driver.findElement(By.id("gameName")).clear();
		driver.findElement(By.id("gameName")).sendKeys("Among Us");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String expected = "Not a lot going on Pretty much the same each time";
		String result = driver.findElement(By.xpath("//*[text()='Not a lot going on Pretty much the same each time']"))
				.getText();

		Assert.assertEquals(expected, result);

	}

}
