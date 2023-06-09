# hotel my camp sitesinde 3 adet negative test senaryosu oluşturalım
  #1- doğru username-yanlış password
  #2- yanlış username-doğru password
  #3- yanlış username-yanlış password

Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "hmcUrl" anasayfasinda
    Then Log in  yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC10 yanlis kullanici adi ile giris yapilamaz
    Given kullanici "hmcUrl" anasayfasinda
    Then Log in  yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC11 yanlis kullanici adi ve yanlis sifre ile giris yapilamaz
    Given kullanici "hmcUrl" anasayfasinda
    Then Log in  yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir