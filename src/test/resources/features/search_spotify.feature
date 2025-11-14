@search @smoke
Feature: Búsqueda de Contenido en Spotify Web
  Como usuario de Spotify
  Quiero usar la funcionalidad de búsqueda
  Para encontrar artistas específicos.

  Scenario: 02. Búsqueda de artista por nombre
    Given que estoy logueado en Spotify Web
    When busco el término: "Coldplay"
    Then el resultado de la búsqueda debe mostrar al artista "Coldplay" como resultado principal