package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class CheckReview extends SetUp {

	private String gameName = "Portal 2";
	private String gameReview = "The cake is a lie.";

	public CheckReview() {
		super();
	}

	@Test
	public void testCreateEntry() throws Exception {
		super.initialLogin();
		driver.findElement(By.xpath("//button[@onclick=\"window.location.href='CreateReview'\"]")).click();
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/CreateReview");
		driver.findElement(By.id("gameName")).click();
		driver.findElement(By.id("gameName")).clear();
		driver.findElement(By.id("gameName")).sendKeys(gameName);
		driver.findElement(By.id("genre3")).click();
		driver.findElement(By.id("5star")).click();
		driver.findElement(By.id("review")).click();
		driver.findElement(By.id("review")).clear();
		driver.findElement(By.id("review")).sendKeys(gameReview);
		driver.findElement(By.xpath("//input[@value='Create Review']")).click();
		driver.findElement(By.xpath("//button[@onclick=\"window.location.href='UserProfile'\"]")).click();

		String expected = gameReview;
		String path = "//*[text()='" + gameReview + "']";
		String result = driver.findElement(By.xpath(path)).getText();

		Assert.assertEquals(expected, result);
	}

}