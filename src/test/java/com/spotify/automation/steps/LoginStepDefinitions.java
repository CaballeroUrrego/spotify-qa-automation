package com.spotify.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("que estoy en la página de login de Spotify")
    public void estoyEnLogin() {
        System.out.println("Entré a la página de login");
    }

    @When("ingreso mis credenciales válidas")
    public void ingresoCredenciales() {
        System.out.println("Ingreso usuario y contraseña");
    }

    @Then("debo ver mi página principal")
    public void verPaginaPrincipal() {
        System.out.println("Ingreso exitoso");
    }
}
