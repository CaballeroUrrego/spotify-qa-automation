package com.spotify.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {

    // Localizador del campo de búsqueda (usando un selector que podríamos encontrar
    // en Spotify)
    private final By SEARCH_INPUT = By.cssSelector("input[data-testid='search-input']");

    // Localizador genérico para el encabezado principal de la sección de resultados
    private final By SEARCH_RESULTS_HEADER = By.cssSelector("h1[data-testid='search-results-header']");

    // Patrón para verificar la existencia de un resultado con un nombre específico,
    // corrigiendo el error de sintaxis al usar String.format en lugar del método
    // .of()
    private static final String RESULT_TITLE_XPATH_PATTERN = "//h3[text()='%s']";

    /**
     * Espera a que la página de búsqueda esté cargada verificando la presencia del
     * input.
     * Corregido: Usa $(By).waitUntilVisible() que es la sintaxis correcta en
     * Serenity BDD.
     */
    public void ensureSearchPageIsVisible() {
        $(SEARCH_INPUT).waitUntilVisible();
    }

    /**
     * Escribe el término de búsqueda y presiona enter.
     * 
     * @param term El término a buscar.
     */
    public void searchFor(String term) {
        ensureSearchPageIsVisible();
        find(SEARCH_INPUT).typeAndEnter(term);
    }

    /**
     * Obtiene el texto de un resultado específico para verificar que el resultado
     * es correcto.
     * 
     * @param expectedResultName El nombre del resultado esperado (ej: "Coldplay").
     * @return String El texto del resultado encontrado.
     */
    public String getResultTitle(String expectedResultName) {
        // Construye el localizador dinámico usando String.format()
        String dynamicLocator = String.format(RESULT_TITLE_XPATH_PATTERN, expectedResultName);

        // Espera a que el título del resultado esté visible y retorna su texto.
        return $(By.xpath(dynamicLocator)).waitUntilVisible().getText();
    }
}