Feature: Preencher

  @tag1
  Scenario: Preencher formulario
    Given que esteja na home do site
    When preencher o formulario
    Then um e-mail sera enviado
