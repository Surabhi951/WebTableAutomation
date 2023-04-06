package bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebTableElement {

    WebDriver driver;

    public WebTableElement(WebDriver driver) {
        this.driver = driver;
    }

    public void handleWebTable() {

        List<WebElement> headings = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/tbody"));
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (WebElement heading : headings) {
            String[] words = heading.getText().split("\\s+");
            for (String word : words) {
                if (wordFrequency.containsKey(word)) {
                    wordFrequency.put(word, wordFrequency.get(word) + 1);
                } else {
                    wordFrequency.put(word, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Word :- " + entry.getKey() + " ******* Frequency :- " + entry.getValue());
        }

        String mostCommonWord = "";
        int highestFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                mostCommonWord = entry.getKey();
                highestFrequency = entry.getValue();
            }
        }
        System.out.println();
        System.out.println("MostCommonWords : " + mostCommonWord);
        System.out.println("HighestFrequency : " + highestFrequency);
    }
}
