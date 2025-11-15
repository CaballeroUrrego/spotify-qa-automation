package com.spotify.automation.actions;

import com.spotify.automation.pages.SearchPage;
import net.serenitybdd.annotations.Shared;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

/**
 * Actions para búsquedas en Spotify.
 */
public class SearchActions {

    @Shared
    SearchPage searchPage;

    @Step("Abrir página de búsqueda")
    public void openSearchPage() {
        searchPage.open();
        searchPage.waitForSearchPage();
    }

    @Step("Buscar la canción: {0}")
    public void searchSong(String songName) {
        searchPage.searchFor(songName);
    }

    @Step("Verificar que la canción {0} aparece en resultados")
    public void verifySongInResults(String songName) {
        String result = searchPage.getResultTitle(songName);
        Assert.assertEquals(
                "El resultado no coincide con la canción esperada",
                songName,
                result);
    }
}
