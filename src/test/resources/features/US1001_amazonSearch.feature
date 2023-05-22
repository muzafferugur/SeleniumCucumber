Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

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

  Scenario: TC03 kullanici iphone aratir
    When kullanici amazon anasayfasinda
    And kullanici iphone için arama yapar
    Then sonuclarin iphone içerdiğini test eder
    And sayfayi kapatir
