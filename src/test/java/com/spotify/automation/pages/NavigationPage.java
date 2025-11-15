package com.spotify.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigationPage extends PageObject {

    // Selectores REALES de Spotify Web
    private static final By HOME_BUTTON = By.cssSelector("a[href='/']");
    private static final By SEARCH_BUTTON = By.cssSelector("a[href='/search']");
    private static final By LIBRARY_BUTTON = By.cssSelector("a[href='/collection']");
    private static final By FIRST_PLAYLIST_CARD = By.cssSelector("div[data-testid='card']");

    private static final By PLAYLIST_TITLE = By.cssSelector("h1[data-testid='entityTitle']");

    // ---- NAVEGACIÓN ---- //

    public void openHomePage() {
        openUrl("https://open.spotify.com/");
        $(HOME_BUTTON).waitUntilClickable().click();
    }

    public void navigateToSearchPage() {
        $(SEARCH_BUTTON).waitUntilClickable().click();
    }

    public void navigateToLibraryPage() {
        $(LIBRARY_BUTTON).waitUntilClickable().click();
    }

    // ---- PLAYLIST ---- //

    public void clickFirstPlaylistCard() {
        $(FIRST_PLAYLIST_CARD).waitUntilClickable().click();
    }

    public boolean isPlaylistDetailPageDisplayed() {
        return $(PLAYLIST_TITLE).waitUntilVisible().isDisplayed();
    }
}
