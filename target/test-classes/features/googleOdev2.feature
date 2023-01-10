Feature: Google da arama
  Scenario: Google istenilen kelimeyi arayıp dogrulamak
    Given Kullanıcı Google a gider
    When Kullanıcı selenyumu aratır
    Then Selenyum kelimesinin gectiğini title de dogrular