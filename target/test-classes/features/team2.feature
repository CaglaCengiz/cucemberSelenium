Feature: Sahibinden e gider

  Background: Kullanici her senaryoda Sahibinden sitesinde olacaktir
    Given Kullanici Sahibinden sayfasindadir

  Scenario: Kullanici ev aradiginda ev gormelidir
    When Kullanici ev kelimesini arar
    Then Kullanici sayfada ev kelimesi gectigini dogrular

  Scenario: Kullanici araba aradiginda araba gormelidir
    When Kullanici araba kelimesini arar
    Then Kullanici sayfada araba kelimesi gectigini dogrular
