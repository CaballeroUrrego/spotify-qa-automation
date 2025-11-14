package com.spotify.automation.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationSteps extends ScenarioSteps {
    @Given("que el usuario está en la página principal de Spotify")
    @Step("El usuario está en la página principal")
    public void que_el_usuario_está_en_la_página_principal_de_spotify() {
        throw new PendingException();
    }
    
    @When("el usuario navega a la sección de Busqueda")
    @Step("Navegar a la sección de Búsqueda")
    public void el_usuario_navega_a_la_sección_de_busqueda() {
        throw new PendingException();
    }
    
    @When("selecciona la primera categoria de playlist popular")
    @Step("Seleccionar la primera categoría popular")
    public void selecciona_la_primera_categoria_de_playlist_popular() {
        throw new PendingException();
    }
    
    @Then("se debe mostrar la pagina de detalle de la playlist o categoria")
    @Step("Verificar la página de detalle de la playlist")
    public void se_debe_mostrar_la_pagina_de_detalle_de_la_playlist_o_categoria() {
        throw new PendingException();
    }
}
