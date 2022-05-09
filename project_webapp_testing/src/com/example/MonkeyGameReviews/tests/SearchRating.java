package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SearchRating extends SetUp {

	public SearchRating() {
		super();
	}

	@Test
	public void testSearchRating() throws Exception {
		super.initialLogin();
		driver.findElement(By.xpath("//div[8]/input")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String expected = "Rating: 2";
		String result = driver.findElement(By.xpath("//*[text()='Rating: 2']")).getText();

		Assert.assertEquals(expected, result);

	}

}
