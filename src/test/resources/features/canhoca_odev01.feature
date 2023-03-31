@Canhoca_odev1
Feature: N11_magaza_arama
  Scenario: TC01_magaza_isimleri_yazdırma
    Given Kulanici "https://www.n11.com" sayfasina gider
    When  Kullanici magazalar butonuna tiklar
    And Kullanici A butonuna basar
    And Kullanici A harfiyle baslayan bütün magaza ismlerini excel dosyasına yazdırır
    Then Kullanici dataların excel dosyasına yazdirildigini dogrular