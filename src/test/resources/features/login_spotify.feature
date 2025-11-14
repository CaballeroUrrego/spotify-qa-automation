@login @negativo @smoke
Feature: Autenticación de Usuarios en Spotify Web
  Como usuario de Spotify
  Quiero intentar iniciar sesión
  Para ser informado de credenciales inválidas.

  Scenario: 01. Login con credenciales inválidas
    Given que estoy en la página de login de Spotify
    When ingreso un correo ficticio y contraseña inválida
    Then se debe mostrar el mensaje de error: "Email o contraseña incorrectos."