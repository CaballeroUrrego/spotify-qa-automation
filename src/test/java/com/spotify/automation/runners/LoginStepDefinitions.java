package com.spotify.automation.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
// Importa las clases de PageObject y Actions necesarias aquí

public class LoginStepDefinitions {

    // Asume que aquí tienes tus otros pasos de Given.
    // ...

    @When("ingreso un correo ficticio y contraseña inválida")
    public void ingresoUnCorreoFicticioYContraseñaInválida() {
        // TODO: Implementar la acción real de ingresar credenciales en la página de
        // Login.
        // Ejemplo (ajusta según tus PageObjects/Tasks):
        // loginActions.ingresarCredenciales("correo_ficticio@ejemplo.com",
        // "password_invalida");
        throw new io.cucumber.java.PendingException(
                "Paso pendiente: Implementar el ingreso de credenciales inválidas.");
    }

    @Then("se debe mostrar el mensaje de error: {string}")
    public void seDebeMostrarElMensajeDeError(String mensajeEsperado) {
        // TODO: Implementar la aserción para verificar el mensaje de error.
        // Ejemplo (ajusta según tus PageObjects/Questions):
        // loginQuestions.elMensajeDeErrorEs(mensajeEsperado);
        throw new io.cucumber.java.PendingException(
                "Paso pendiente: Implementar la verificación del mensaje de error.");
    }

}