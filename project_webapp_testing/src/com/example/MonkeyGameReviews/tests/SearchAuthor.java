package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SearchAuthor extends SetUp {

	public SearchAuthor() {
		super();

	}

	@Test
	public void testSearchAuthor() throws Exception {
		super.initialLogin();
		driver.findElement(By.id("author")).click();
		driver.findElement(By.id("author")).clear();
		driver.findElement(By.id("author")).sendKeys("user15");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String expected = "Review by: user15";
		String result = driver.findElement(By.xpath("//*[text()='Review by: user15']")).getText();

		Assert.assertEquals(expected, result);

	}

}
