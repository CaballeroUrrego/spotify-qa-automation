package com.spotify.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/navigation_spotify.feature", // Ruta a su archivo .feature
                glue = "com.spotify.automation.steps" // Paquete donde están sus Step Definitions
)
public class NavigationTestRunner {
        // Esta clase queda vacía. Solo contiene las anotaciones para Maven/Serenity.
}