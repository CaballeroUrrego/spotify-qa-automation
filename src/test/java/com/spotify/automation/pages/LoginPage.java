package com.spotify.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "[data-testid='login-error-message'], div[data-testid='error-message']")
    private WebElement errorMessage;

    /** Abre directamente la URL de login */
    public void openLoginPage() {
        openUrl("https://accounts.spotify.com/es/login");
        waitForLoginPage();
    }

    /** Espera a que el campo usuario esté visible */
    public void waitForLoginPage() {
        element(username).waitUntilVisible();
    }

    public void enterUsername(String user) {
        typeInto(username, user);
    }

    public void enterPassword(String pass) {
        typeInto(password, pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    /** Devuelve el texto del mensaje de error */
    public String getErrorMessage() {
        return element(errorMessage).waitUntilVisible().getText();
    }
}
