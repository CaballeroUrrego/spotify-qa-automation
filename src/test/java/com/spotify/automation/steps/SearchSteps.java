package com.spotify.automation.steps;

import com.spotify.automation.actions.SearchActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class SearchSteps {

    @Steps
    SearchActions searchActions;

    @Given("que el usuario está en la página de Busqueda de Spotify")
    public void usuarioEnBusqueda() {
        searchActions.openSearchPage();
    }

    @When("el usuario busca la canción {string}")
    public void buscaCancion(String songName) {
        searchActions.searchSong(songName);
    }

    @Then("la canción {string} debe aparecer en los resultados")
    public void cancionDebeAparecer(String songName) {
        searchActions.verifySongInResults(songName);
    }
}
