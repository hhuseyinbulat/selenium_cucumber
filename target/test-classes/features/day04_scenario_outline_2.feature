@personel_olusturma
Feature: personel_olusturma
  @testrunner
  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tıklar
    And kullanici first name "<firstname>" girer
    And kullanici last name "<lastname>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici start_date "<start_date>" girer
    And kullanici salary "<salary>" girer
    And kullanici create butonuna tıklar
    When kullanici firstname ile "<firstname>" arar
    Then firstname "<firstname>" in olustugunu test et
    Then close the application


    Examples: personel_bilgileri
      | firstname | lastname | positions | office   | extension | start_date  | salary  |
      | john         | walker    | SDET      | istanbul|345           |2023-07-01| 60000  |
      | Zeyno         | talker   | SDET      | Ankara|346           |2023-07-02| 80000  |
      | Cenno        | malker    | Developer      | İzmir|347           |2023-07-03| 100000  |
      | Pero         | falker    | Architecture      | Bursa|348           |2023-07-04| 1200000  |




