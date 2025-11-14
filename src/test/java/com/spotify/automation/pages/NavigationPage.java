package com.spotify.automation.pages;

import net.serenitybdd.core.pages.PageObject;
// CORRECCIÓN CLAVE: Usar la importación moderna de Serenity BDD
import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Define la URL de inicio y los Localizadores de la barra lateral de
 * navegación y las categorías principales.
 */
@DefaultUrl("https://open.spotify.com")
public class NavigationPage extends PageObject {

    // --- LOCALIZADORES ---

    // Localizador para el botón de "Search" o "Buscar" en la barra lateral
    // Utilizamos un localizador robusto basado en el atributo href
    public static final By BTN_SEARCH = By.xpath("//a[@href='/search']");

    // Localizador para la primera tarjeta de categoría (la que buscamos para el
    // escenario de playlists). Usamos el data-testid que engloba las tarjetas.
    public static final By FIRST_PLAYLIST_CARD = By.xpath("//div[@data-testid='grid-container']/div[1]/a");

    // Localizador para verificar si el título principal (<h1>) de la playlist o
    // categoría se muestra. Esto sirve como verificación de que la navegación fue
    // exitosa.
    public static final By PLAYLIST_DETAIL_TITLE = By.xpath("//h1");

    // --- MÉTODOS DE ACCIÓN ---

    /**
     * Abre la página principal de Spotify (usa la URL definida en @DefaultUrl).
     */
    public void openSpotifyHomePage() {
        open();
    }

    /** Navega directamente a la página de Búsqueda (Search). */
    public void navigateToSearchPage() {
        // Corregido: Uso del patrón find(By).waitUntilVisible().click()
        find(BTN_SEARCH).waitUntilVisible().click();
    }

    /**
     * Navega a la sección de Playlists Populares (simulando clic en la primera
     * tarjeta).
     */
    public void navigateToTopPlaylists() {
        // 1. Navegar a la página de Búsqueda para ver las categorías de exploración
        navigateToSearchPage();

        // 2. Localizar y hacer clic en la primera tarjeta de playlist/categoría
        // Corregido: Uso del patrón find(By).waitUntilVisible().click()
        find(FIRST_PLAYLIST_CARD).waitUntilVisible().click();
    }

    // --- MÉTODOS DE VERIFICACIÓN (QUESTIONS) ---

    /**
     * Verifica si la página de detalle de la playlist o categoría se ha cargado
     * (verificando el
     * <h1>).
     */
    public boolean isPlaylistDetailPageDisplayed() {
        // Simplemente verifica si el elemento es visible
        return find(PLAYLIST_DETAIL_TITLE).isVisible();
    }
}