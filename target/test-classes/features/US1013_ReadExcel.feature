Feature: US1013 kullanici excel bilgilerine ulasir

  @readExcel
  Scenario: TC18 kullanici excel bilgilerini kullanir

 Scenario: TC18 kullanici excel bilgilerine kullanir
   Given kullanici excel dosyasini kullailabilir hale getirir
   Then -1.satirdaki 2.hucreye yazdirir
   And baskenti Jakarta olan ulke ismini yazdirir
   And Ulke sayisinin 190 oldugunu test eder
   And Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder
   Then 3. Satir ve 2.sutundaki bilgiyi yazdirir