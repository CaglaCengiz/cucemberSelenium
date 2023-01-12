Feature: Dinamik Url
  Scenario Outline: Dinamik Urller ile sayfaya erişebilmelidir
    Given kullanici "<url>"sayfasina gider
    Then kullanici 12 sn bekler
    And sayfa basliginin "<kelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |url     |kelime|
      |google  |google|
      |amazon  |amazon|
      |trendyol|trendyol|
