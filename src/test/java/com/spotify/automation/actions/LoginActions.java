package com.spotify.automation.actions;

import com.spotify.automation.pages.LoginPage;
import net.serenitybdd.annotations.Step; // <--- IMPORT CORRECTO
import org.junit.Assert;

public class LoginActions {

    private LoginPage loginPage;

    @Step("Abrir la página de login de Spotify")
    public void openLoginPage() {
        loginPage.openLoginPage();
    }

    @Step("Intentar login con credenciales inválidas: {0} / {1}")
    public void enterInvalidCredentials(String email, String password) {
        loginPage.enterUsername(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Step("Verificar que se muestra mensaje de error")
    public void verifyErrorMessage() {
        String msg = loginPage.getErrorMessage();
        Assert.assertTrue("Se esperaba un mensaje de error", msg != null && !msg.isEmpty());
    }
}
