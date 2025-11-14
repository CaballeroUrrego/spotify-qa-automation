package com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigationPage extends PageObject {

    // Localizador para el botón de "Search" o "Buscar" en la barra lateral
    public static final By BTN_SEARCH = By.xpath("//a[@href='/search']");

    // Localizador para el título "Browse All" o "Explorar todo"
    // Usaremos un XPATH que contenga el texto, ya que la página de Spotify es
    // dinámica
    public static final By TITLE_EXPLORE_ALL = By.xpath("//h2[text()='Browse All' or text()='Explorar todo']");

    // Localizador para la primera categoría de playlist (asumimos que siempre hay
    // una visible)
    // El 'data-testid="grid-container"' ayuda a seleccionar un elemento dentro de
    // la cuadrícula de categorías.
    public static final By FIRST_PLAYLIST_CARD = By.xpath("//div[@data-testid='grid-container']/div[1]/a");

    // Localizador para verificar si el título de la playlist o la categoría se
    // muestra
    public static final By PLAYLIST_DETAIL_TITLE = By.xpath("//h1");

    public void navigateToSearchPage() {
        // Serenity nos permite usar 'find(locator).click()' para interactuar con
        // elementos.
        find(BTN_SEARCH).click();
    }

    public void clickFirstPlaylistCategory() {
        // 1. Esperamos a que el encabezado "Explorar todo" sea visible antes de hacer
        // clic
        find(TITLE_EXPLORE_ALL).waitUntilVisible(); // <-- CORRECCIÓN APLICADA

        // 2. Hacemos clic en la primera tarjeta de playlist
        find(FIRST_PLAYLIST_CARD).click();
    }

    public boolean isPlaylistDetailPageDisplayed() {
        // Verifica que cualquier título <h1> (título de la playlist) sea visible
        return find(PLAYLIST_DETAIL_TITLE).isVisible();
    }
}