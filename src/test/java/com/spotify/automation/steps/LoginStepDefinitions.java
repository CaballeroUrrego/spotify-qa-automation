package com.spotify.automation.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
// CORRECCIÓN: Se usa la anotación moderna de Serenity BDD 4.x para quitar el error rojo
import net.serenitybdd.annotations.Steps;
// Importa las clases de PageObject y Actions necesarias aquí
// Recuerde que debe añadir un @Steps para inyectar su clase de acciones de Login

public class LoginStepDefinitions {

    // Asume que aquí tienes tus otros pasos de Given.
    // ...

    @When("ingreso un correo ficticio y contraseña inválida")
    public void ingresoUnCorreoFicticioYContraseñaInválida() {

        // Login.
        // Ejemplo (ajusta según tus PageObjects/Tasks):
        // loginActions.ingresarCredenciales("correo_ficticio@ejemplo.com",
        // "password_invalida");
        throw new io.cucumber.java.PendingException(
                "Paso pendiente: Implementar el ingreso de credenciales inválidas.");
    }

    @Then("se debe mostrar el mensaje de error: {string}")
    public void seDebeMostrarElMensajeDeError(String mensajeEsperado) {

        // Ejemplo (ajusta según tus PageObjects/Questions):
        // loginQuestions.elMensajeDeErrorEs(mensajeEsperado);
        throw new io.cucumber.java.PendingException(
                "Paso pendiente: Implementar la verificación del mensaje de error.");
    }

}