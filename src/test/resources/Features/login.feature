Feature: login fonksiyonunu test etme

  Scenario: Kimlik doğrulama ile login
    Given login sayfasina gidilir
    When email ve sifre yazilir
    And login butonununa tiklanir
    Then giris yaptigi gorulur
