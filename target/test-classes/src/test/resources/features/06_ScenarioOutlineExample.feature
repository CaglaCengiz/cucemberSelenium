Feature: Amazon Search Feature

  Scenario Outline: Kullanici aratacagi kelimeyi sonuclarda gormelidir
    Given Kullanici amazon sitesine gider
    When Kullanici amazonda "<kelime>" aratir
    Then Kullanici arama sonuclarinda "<kelime>" gormelidir
    And Kullanici ekran goruntusu alır
    And Kullanici browser i kapatir
    Examples:
      | kelime  |
      | mac     |
      | windows |
      | linux   |