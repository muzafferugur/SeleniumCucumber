Feature: Amazon Search

  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella için arama yapar
    And sonuclarin Nutella içerdiğini test eder
    And sayfayi kapatir

    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir