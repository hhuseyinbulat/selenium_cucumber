@Canhoca_odev2
Feature: Sepete_urun_ekleme
  Scenario: TC01_Sepete_urun_ekleme
    Given Kulanici "https://www.n11.com" sayfasina gider
    When Kullanici Kulaklık arar
    And Kullanici sonuclari yorum sayisina göre sıralar
    And Kullanici ücretsiz kargolari listeler
    And Kullanici ilk sayfadan ilk ve son ürünü sepete ekler
    And Kullanici sepet butonuna tıklar
    And Kullanici sepette bulunan en ucuz ürünün adetini iki olarak secer
    And Kullanici satın al butonuna tıklar
    And Kullanici üye olmadan devam et linkine tıklar
    Then Kullanici misafir kullanıcı olarak ödeme sayfasında bulundugunu dogrular
    Then close the application

