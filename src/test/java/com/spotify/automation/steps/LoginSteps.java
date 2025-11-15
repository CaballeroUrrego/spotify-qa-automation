package com.spotify.automation.steps;

import com.spotify.automation.actions.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class LoginSteps {

    @Steps
    LoginActions loginActions;

    @Given("que el usuario está en la página de login de Spotify")
    public void usuarioEstaEnLogin() {
        loginActions.openLoginPage();
    }

    @When("el usuario ingresa credenciales inválidas")
    public void usuarioIngresaCredencialesInvalidas() {
        loginActions.enterInvalidCredentials("correo@falso.com", "passwordIncorrecto");
    }

    @Then("debe mostrarse un mensaje de error")
    public void debeMostrarseMensajeError() {
        loginActions.verifyErrorMessage();
    }
}
