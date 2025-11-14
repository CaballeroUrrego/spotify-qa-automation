package com.spotify;

import com.spotify.automation.pages.NavigationPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Shared;

/**
 * Clase de Tareas (Actions) de alto nivel relacionadas con la Navegación.
 * Esta capa agrupa las interacciones de NavigationPage.
 */
public class NavigationActions {

    @Shared
    public NavigationPage navigationPage; // Hacemos pública la inyección para fácil acceso en los Steps

    @Step("El usuario abre la página principal de Spotify")
    public void openHomePage() {
        navigationPage.openSpotifyHomePage();
    }

    @Step("El usuario navega a la sección de Búsqueda")
    public void navigateToSearch() {
        navigationPage.navigateToSearchPage();
    }

    @Step("El usuario selecciona la primera categoría de playlist popular")
    public void selectTopPlaylistCategory() {
        // En la implementación de Page, navigateToTopPlaylists() ya hace el clic
        // después de haber navegado a la página de búsqueda (Search).
        // Sin embargo, para cumplir con el patrón Gherkin de 3 pasos,
        // solo llamaremos al clic final, asumiendo que el paso anterior ya navegó a
        // Search.
        navigationPage.find(navigationPage.FIRST_PLAYLIST_CARD).click();
    }

    @Step("Verificar que la página de detalle de la playlist se muestra")
    public boolean isPlaylistDetailVisible() {
        return navigationPage.isPlaylistDetailPageDisplayed();
    }
}