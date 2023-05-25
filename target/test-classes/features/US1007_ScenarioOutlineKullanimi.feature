#amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratip
  #sonuclarin arama yaptiğimiz kelimeyi icerdiğini test edelim

  #Feature File’i Parametre ile Kullanma

#Parametreleştirmek ve dinamik hale getirmek için feature file da çift tırnak " " kullanırız.
#Şimdi sadece " " içindeki değeri değiştirerek test datalarini feature file dan kontrol edebiliriz.
#Bu framework u daha dinamik hale getirir, yani kodumuz artik hard coded degildir diyebiliriz.

Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC12 amazonda listedeki elementleri aratma

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella               | nutella                            |
      | java                    | java                                 |
      | elma                   | elma                                |
      | armut                 | armut                              |
