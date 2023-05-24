@wip
Feature: US1002 Kullanici ortak adimlari Background ile calistirir

    #Background

  #Farklı senaryoların başında ortak adımlarımız varsa:
  #1. Feature file in basina Background oluşturun.
  #2. Bu ortak adımları Background altına yazın.
  #3. Background, aynı Feature file’ daki her Scenario dan önce çalışır
  #4. Duplication olmadigindan emin olun.
  #Background' un altındaki adımı yazdıktan sonra senaryolardan silin.


  Background: ortak adim
    Given kullanici amazon anasayfasinda

  Scenario: TC04 amazon nutella arama
    And kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    @pr2
  Scenario: TC05 amazon java arama
    And kullanici Java icin arama yapar
    Then sonuclarin Java icerdigini test eder
    And sayfayi kapatir