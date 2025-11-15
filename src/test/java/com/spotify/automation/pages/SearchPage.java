package com.spotify.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {

    private static final By SEARCH_INPUT = By.cssSelector("input[data-testid='search-input']");
    private static final String RESULT_TITLE_XPATH = "//div[@data-testid='tracklist-row']//span[text()='%s']";

    /** Espera a que el input de búsqueda esté visible */
    public void waitForSearchPage() {
        $(SEARCH_INPUT).waitUntilVisible();
    }

    /** Escribe en el buscador y presiona Enter */
    public void searchFor(String query) {
        waitForSearchPage();
        $(SEARCH_INPUT).clear();
        $(SEARCH_INPUT).typeAndEnter(query);
    }

    /** Obtiene el texto de la canción encontrada */
    public String getResultTitle(String expectedName) {
        By locator = By.xpath(String.format(RESULT_TITLE_XPATH, expectedName));
        return $(locator).waitUntilVisible().getText();
    }
}
