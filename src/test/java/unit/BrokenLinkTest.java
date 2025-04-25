package unit;

// Removed unused import
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import io.restassured.RestAssured;

public class BrokenLinkTest extends BaseClass {

	@Test(enabled = false)
	public void test_rest_assured() {
		// driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links - " + links.size());

		List<String> brokenLinkUrls = new ArrayList<>();

		for (WebElement element : links) {
			String link = element.getAttribute("href");
			System.out.println(link);

			if (link.length() == 0) {
				brokenLinkUrls.add(link);
			} else {
				int statusCode = RestAssured.given().get(link).andReturn().statusCode();
				if (statusCode != 200) {
					System.err.println("Status Code - " + statusCode);
					brokenLinkUrls.add(link);
				}
			}
		}

		System.err.println("Total broken links = " + brokenLinkUrls.size());
		System.out.println(brokenLinkUrls);
	}

	@Test
	public void test_in_build_java() {
		// driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links - " + links.size());

		List<String> brokenLinkUrls = new ArrayList<>();

		for (WebElement element : links) {
			String link = element.getAttribute("href");
			System.out.println(link);

			if (link.length() == 0) {
				brokenLinkUrls.add(link);
			} else {
				int statusCode = 0;
				try {
					HttpClient client = HttpClient.newHttpClient();

					HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).GET().build();

					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					statusCode = response.statusCode();
				} catch (Exception e) {
				}
				if (statusCode != 200) {
					System.err.println("Status Code - " + statusCode);
					brokenLinkUrls.add(link);
				}
			}
		}

		System.err.println("Total broken links = " + brokenLinkUrls.size());
		System.out.println(brokenLinkUrls);
	}
}
