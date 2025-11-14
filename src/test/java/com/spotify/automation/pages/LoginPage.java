package com.spotify.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Page Object para la página de Login de Spotify.
 * Contiene todos los localizadores y métodos de bajo nivel para interactuar con
 * el formulario de inicio de sesión.
 */
public class LoginPage extends PageObject {

    // --- LOCALIZADORES ---

    // Botón de "Iniciar Sesión" en la página principal (para navegar al login form)
    private static final By LOGIN_LINK = By.xpath("//button[text()='Iniciar sesión']");

    // Campo de entrada para el correo electrónico o nombre de usuario (en el
    // formulario de login)
    private static final By EMAIL_INPUT = By.id("login-username");

    // Campo de entrada para la contraseña (en el formulario de login)
    private static final By PASSWORD_INPUT = By.id("login-password");

    // Botón de "Iniciar Sesión" dentro del formulario de login
    private static final By SUBMIT_BUTTON = By.id("login-button");

    // Contenedor principal del mensaje de error (generalmente después de fallo)
    private static final By ERROR_MESSAGE_CONTAINER = By.cssSelector("[data-testid='login-error-message']");

    // --- MÉTODOS DE ACCIÓN ---

    /**
     * Navega a la página de Login de Spotify.
     * Abre la URL base y hace clic en el botón de Iniciar Sesión.
     */
    public void navigateToLoginPage() {
        // Abre la URL base (https://open.spotify.com/)
        open();

        // CORRECCIÓN: Usamos find(By).waitUntilVisible() para esperar por el elemento.
        find(LOGIN_LINK).waitUntilVisible().click();
    }

    /**
     * Ingresa las credenciales inválidas y hace clic en el botón de submit.
     */
    public void submitInvalidCredentials(String email, String password) {

        // CORRECCIÓN: find(By).waitUntilPresent() asegura la carga del campo.
        find(EMAIL_INPUT).waitUntilPresent().type(email);

        find(PASSWORD_INPUT).type(password);

        find(SUBMIT_BUTTON).click();
    }

    // --- MÉTODOS DE VERIFICACIÓN (QUESTIONS) ---

    /**
     * Obtiene el texto del mensaje de error que se muestra en el formulario.
     * 
     * @return Texto del mensaje de error.
     */
    public String getErrorMessageText() {
        // CORRECCIÓN: find(By).waitUntilVisible() asegura que el elemento de error esté
        // listo antes de obtener su texto.
        return find(ERROR_MESSAGE_CONTAINER).waitUntilVisible().getText();
    }
}