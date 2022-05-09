package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class SearchReset extends SetUp {

	public SearchReset() {
		super();
	}

	@Test
	public void testSearchReset() throws Exception {
		super.initialLogin();
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/Homepage");
		driver.findElement(By.id("gameName")).click();
		driver.findElement(By.id("gameName")).clear();
		driver.findElement(By.id("gameName")).sendKeys("Among Us");
		driver.findElement(By.id("author")).click();
		driver.findElement(By.id("author")).clear();
		driver.findElement(By.id("author")).sendKeys("user4");
		driver.findElement(By.id("genre1")).click();
		driver.findElement(By.id("genre2")).click();
		driver.findElement(By.id("genre3")).click();
		driver.findElement(By.id("genre4")).click();
		driver.findElement(By.id("genre5")).click();
		driver.findElement(By.id("genre6")).click();
		driver.findElement(By.id("rad")).click();

		driver.findElement(By.xpath("//input[@value='Reset']")).click();

		boolean genre1Button = driver.findElement(By.id("genre1")).isSelected();
		boolean genre2Button = driver.findElement(By.id("genre2")).isSelected();
		boolean genre3Button = driver.findElement(By.id("genre3")).isSelected();
		boolean genre4Button = driver.findElement(By.id("genre4")).isSelected();
		boolean genre5Button = driver.findElement(By.id("genre5")).isSelected();
		boolean genre6Button = driver.findElement(By.id("genre6")).isSelected();
		boolean rating1Button = driver.findElement(By.id("rad")).isSelected();

		boolean expected = false;

		boolean result = genre1Button || genre2Button || genre3Button || genre4Button || genre5Button || genre6Button
				|| rating1Button;

		Assert.assertEquals(expected, result);
	}

}
