package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SearchGenre extends SetUp {

	public SearchGenre() {
		super();
	}

	@Test
	public void testSearchGenre() throws Exception {
		super.initialLogin();
		driver.findElement(By.id("genre2")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String expected = "The Elder Scrolls V: Skyrim Special Edition";
		String result = driver.findElement(By.xpath("//*[text()='The Elder Scrolls V: Skyrim Special Edition']"))
				.getText();

		Assert.assertEquals(expected, result);

	}

}
