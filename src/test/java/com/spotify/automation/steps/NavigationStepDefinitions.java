package com.spotify.automation.steps;

// CORRECCIÓN CRÍTICA: La clase NavigationPage está en el paquete 'com.pages'
import com.pages.NavigationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
// CORRECCIÓN CLAVE: Se cambió el import de 'net.thucydides.core.annotations.Steps' 
// a 'net.serenitybdd.annotations.Steps' para Serenity BDD versión 4.x.
import net.serenitybdd.annotations.Steps;
import static org.junit.Assert.assertTrue;

public class NavigationStepDefinitions {

    // Inyectamos la dependencia del Page Object con la anotación @Steps de
    // Serenity.
    @Steps
    NavigationPage navigationPage;

    @Given("que el usuario está en la página principal de Spotify")
    public void que_el_usuario_esta_en_la_pagina_principal_de_spotify() {
        // La URL base se configura en serenity.conf, por lo que solo abrimos la
        // aplicación.
        navigationPage.open();
    }

    @When("el usuario navega a la sección de Busqueda")
    public void el_usuario_navega_a_la_seccion_de_busqueda() {
        navigationPage.navigateToSearchPage();
    }

    @When("selecciona la primera categoria de playlist popular")
    public void selecciona_la_primera_categoria_de_playlist_popular() {
        navigationPage.clickFirstPlaylistCategory();
    }

    @Then("se debe mostrar la pagina de detalle de la playlist o categoria")
    public void se_debe_mostrar_la_pagina_de_detalle_de_la_playlist_o_categoria() {
        // Usamos la aserción de JUnit para validar que el resultado es el esperado
        assertTrue("La página de detalle de la playlist NO se mostró",
                navigationPage.isPlaylistDetailPageDisplayed());
    }

}