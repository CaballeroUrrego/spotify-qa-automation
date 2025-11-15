package com.spotify.automation.actions;

import com.spotify.automation.pages.NavigationPage;
import net.serenitybdd.annotations.Shared;
import net.serenitybdd.annotations.Step;

public class NavigationActions {

    @Shared
    NavigationPage navigationPage;

    @Step("El usuario abre la página principal de Spotify")
    public void openHomePage() {
        navigationPage.openHomePage();
    }

    @Step("El usuario navega a la sección de Búsqueda")
    public void navigateToSearch() {
        navigationPage.navigateToSearchPage();
    }

    @Step("El usuario navega a la Biblioteca")
    public void navigateToLibrary() {
        navigationPage.navigateToLibraryPage();
    }

    @Step("El usuario selecciona la primera playlist de la lista")
    public void selectFirstPlaylist() {
        navigationPage.clickFirstPlaylistCard();
    }

    @Step("Verificar que la página de detalle de la playlist sea visible")
    public boolean playlistDetailIsVisible() {
        return navigationPage.isPlaylistDetailPageDisplayed();
    }
}
