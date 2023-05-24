Feature: US1009 Datatables sitesine 5 farkli giris yapalim
  
  #Feature File’i Parametre ile Kullanma

  #Scenario Outline : ayni testte birden fazla datayi  kullanmamizi saglar

  #Bir liste kullanmak istedigimiz degeri "<value>"  seklinde yazariz

 # Daha sonra testin sonuna Example s: yazip ilk  satir olarak | value | yazariz ve altina kullanmak
 # istedigimiz degerleri ekleriz. (|elma|,|armut|…  gibi)


  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

  When kullanici "datatablesUrl" anasayfasinda
  Then new butonuna basar
  And firstname bolumune "<firstname>" yazar
  And kullanici 1 sn bekler
  And lastName bolumune "<lastName>" yazar
  And kullanici 1 sn bekler
  And position bolumune "<position>" yazar
  And kullanici 1 sn bekler
  And office bolumune "<office>" yazar
  And kullanici 1 sn bekler
  And extension bolumune "<extension>" yazar
  And kullanici 1 sn bekler
  And startDate bolumune "<startDate>" yazar
  And kullanici 1 sn bekler
  And salary bolumune "<salary>" yazar
  And kullanici 1 sn bekler
  And Create tusuna basar
  When kullanici "<firstname>" ile arama yapar
  Then isim bolumunde "<firstname>" oldugunu test eder
  And sayfayi kapatir

    Examples:
    |firstname|lastName|position|office   |extension|startDate  |salary|
    |Alim         |Alim       |qa           |ankara|UI             |2021-10-11|10000|
    |Berk         |Can         |tester      |ankara|api            |2022-05-05|11000|
    |Huseyin   |Kacmaz |BA          |berlin  |-                |2022-07-10|40000|
    |Fatih         |Sahin     |PO          |berlin  |-                |2022-03-12|45000|
    |Ahmet      |Kaya       |Tester    |ankara|database |2022-06-06|11000|

