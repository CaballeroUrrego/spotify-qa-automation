package com.spotify;

// CORRECCIÓN CLAVE: Usamos la ruta completa a la clase LoginPage
import com.spotify.automation.pages.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Shared; // CORRECCIÓN: Usar @Shared para inyectar PageObjects

/**
 * Clase de Tareas (Actions) de alto nivel relacionadas con el Login.
 * Esta capa es llamada por los Step Definitions de Cucumber (el 'glue code')
 * e interactúa directamente con los Page Objects.
 * Cumple con el criterio de 'Scripts modulares y reutilizables'.
 */
public class LoginActions {

    // Inyectamos el Page Object de Login
    @Shared // Usar @Shared en lugar de @Steps para inyectar un PageObject
    private LoginPage loginPage;

    /**
     * Tarea: Navegar al formulario de login e intentar iniciar sesión con
     * credenciales inválidas.
     * * @param email El correo electrónico ficticio a ingresar.
     * 
     * @param password La contraseña inválida a ingresar.
     */
    @Step("El usuario navega a la página de login e ingresa el correo '{0}' y la contraseña '{1}'")
    public void ingresarCredenciales(String email, String password) {
        // 1. Navegar al formulario de login haciendo clic en el botón "Iniciar Sesión"
        loginPage.navigateToLoginPage();

        // 2. Ingresar y enviar las credenciales inválidas
        loginPage.submitInvalidCredentials(email, password);
    }

    /**
     * Tarea: Obtener el mensaje de error de la interfaz para su posterior
     * verificación.
     * * @return El texto del mensaje de error visible.
     */
    @Step("El usuario verifica que el mensaje de error sea visible y retorna su texto")
    public String obtenerMensajeDeError() {
        return loginPage.getErrorMessageText();
    }
}