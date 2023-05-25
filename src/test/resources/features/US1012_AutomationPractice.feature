Feature: US1012 kullanici register yapabilmeli

  Scenario: TC17 kullanici uygun datalarla register olabilmeli

  1.sayfasinagidelim
 Given kullanici {string} anasayfasinda
    Given user websayfasinda
    And user sign in linkinetiklar
    And user Create and account bölümüne email adresigirer
    And Create an Account butonunabasar
    And user kisisel bilgilerini ve iletisim bilgilerini girer And user Register butonunabasar
    Then hesap olustugunudogrulayin