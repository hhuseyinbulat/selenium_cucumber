@Haberler
Feature: Google search haber

  Scenario: TC_01_Kullanici_haberler.coma_erisir
    Given Kullanici google a gider
    When Kullanici arama kutusuna "haber" yazar ve arama yapar
    And Kullanici ilk seçeneğe tıklar
    Then Kullanici "https://www.haberler.com/" sayfasında olduğunu doğrular
    Then close the application
