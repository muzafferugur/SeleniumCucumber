Feature: US1010 herokuapp Delete testi

  @herokuapp
  Scenario: TC15 herokuapp'dan delete butonu calismali

    Given kullanici "herokuappUrl" anasayfasinda
    And add element butonuna basar
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basar
    And sayfayi kapatir

