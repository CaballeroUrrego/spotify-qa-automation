package com.spotify.automation.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    @Given("que el usuario está en la página de Busqueda de Spotify")
    @Step("El usuario está en la página de Búsqueda de Spotify")
    public void queElUsuarioEstaEnLaPaginaDeBusquedaDeSpotify() {
        throw new PendingException();
    }
    
    @When("el usuario busca la canción {string}")
    @Step("El usuario busca la canción: {0}")
    public void elUsuarioBuscaLaCancion(String songName) {
        throw new PendingException();
    }
    
    @Then("la canción {string} debe aparecer en los resultados")
    @Step("La canción {0} debe aparecer en los resultados")
    public void laCancionDebeAparecerEnLosResultados(String songName) {
        throw new PendingException();
    }
}
