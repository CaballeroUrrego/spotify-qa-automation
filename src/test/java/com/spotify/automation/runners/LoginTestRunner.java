package com.spotify.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Runner para ejecutar el escenario de Login con credenciales inválidas.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // Especifica el archivo de características (feature file) para este runner
        features = "src/test/resources/features/login_spotify.feature",
        // Especifica el paquete donde se encuentran los Step Definitions
        glue = "com.spotify.automation.steps", tags = "", // Ejecuta todos los escenarios en el feature file
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginTestRunner {
}