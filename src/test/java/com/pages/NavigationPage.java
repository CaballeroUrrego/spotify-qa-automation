package com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Define la URL de inicio y los localizadores de la barra lateral de
 * navegación.
 *
 * NOTA: La URL base para el método .open() se toma del archivo
 * 'serenity.properties' para evitar problemas de compatibilidad con Serenity
 * 4.x.
 */
public class NavigationPage extends PageObject {

    // Localizador para el botón de "Search" o "Buscar" en la barra lateral
    public static final By BTN_SEARCH = By.xpath("//a[@href='/search']");

    // Localizador para el título "Browse All" o "Explorar todo"
    public static final By TITLE_EXPLORE_ALL = By.xpath("//h2[text()='Browse All' or text()='Explorar todo']");

    // Localizador para la primera tarjeta de categoría (asumimos que siempre hay
    // una visible)
    public static final By FIRST_PLAYLIST_CARD = By.xpath("//div[@data-testid='grid-container']/div[1]/a");

    // Localizador para verificar si el título principal (<h1>) de la playlist o
    // categoría se muestra
    public static final By PLAYLIST_DETAIL_TITLE = By.xpath("//h1");

    public void navigateToSearchPage() {
        find(BTN_SEARCH).click();
    }

    public void clickFirstPlaylistCategory() {
        // 1. Esperamos a que el encabezado "Explorar todo" sea visible (Garantiza que
        // la página de búsqueda ha cargado)
        find(TITLE_EXPLORE_ALL).waitUntilVisible();

        // 2. Hacemos clic en la primera tarjeta de playlist/categoría disponible
        find(FIRST_PLAYLIST_CARD).click();
    }

    public boolean isPlaylistDetailPageDisplayed() {
        // Verifica que el título <h1> (título de la playlist) sea visible
        return find(PLAYLIST_DETAIL_TITLE).isVisible();
    }
}