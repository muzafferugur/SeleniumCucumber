Feature: US1009 Datatables sitesine 5 farkli giris yapalim
@datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And firstname bolumune "<firstname>" yazar
    And lastName bolumune "<lastName>" yazar
    And position bolumune "<position>" yazar
    And office bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And startDate bolumune "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    And sayfayi kapatir

    Examples:
    |firstname|lastName|position|office   |extension|startDate  |salary|
    |Alim         |Alim       |qa           |ankara|UI             |2021-10-11|10000|
    |Berk         |Can         |tester      |ankara|api            |2022-5-5    |11000|
    |Huseyin   |Kacmaz |BA          |berlin  |-                |2022-07-10|40000|
    |Fatih         |Sahin     |PO          |berlin  |-                |2022-03-12|45000|
    |Ahmet      |Kaya       |Tester    |ankara|database |2022-06-06|11000|
