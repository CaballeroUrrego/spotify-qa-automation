package com.spotify.automation.steps;

import com.spotify.automation.actions.NavigationActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class NavigationSteps {

    @Steps
    NavigationActions navigationActions;

    @Given("que el usuario está en la página principal de Spotify")
    public void usuarioEnPaginaPrincipal() {
        navigationActions.openHomePage();
    }

    @When("el usuario navega a la sección de Busqueda")
    public void navegaASeccionBusqueda() {
        navigationActions.navigateToSearch();
    }

    @When("selecciona la primera categoria de playlist popular")
    public void seleccionaCategoriaPopular() {
        navigationActions.selectFirstPlaylist(); // ← CORREGIDO
    }

    @Then("se debe mostrar la pagina de detalle de la playlist o categoria")
    public void seMuestraDetalle() {
        navigationActions.playlistDetailIsVisible(); // ← CORREGIDO
    }
}
