Feature: google aramayi islevsel olarak test etme

  Scenario: google aramanin calistigini dogrulayin
    Given tarayici acilir
    When kullanici google a gider
    When kullanici arama kutusuna enuygun metnini girer
    And entera tiklar
    Then kullanici arama sonuclarinda enuygun.com tiklar
