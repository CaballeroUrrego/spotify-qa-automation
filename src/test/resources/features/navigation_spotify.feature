Feature: Navegacion a Playlists Populares
  Como usuario de Spotify
  Quiero navegar a la seccion de busqueda
  Para poder seleccionar una playlist popular y ver su detalle

  Scenario: Navegacion exitosa a una categoria de Playlist
    Given que el usuario está en la página principal de Spotify
    When el usuario navega a la sección de Busqueda
    And selecciona la primera categoria de playlist popular
    Then se debe mostrar la pagina de detalle de la playlist o categoria