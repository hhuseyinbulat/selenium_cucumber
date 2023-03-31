@data_tables
Feature: data_tables
  Scenario: TC01_musteri_giris_testi
    Given kullanici "https://www.bluerentalcars.com/login" gider
    When kullanici emaili ve sifresini girer
      | email                         | sifre     |
      |sam.walker@bluerentalcars.com| c!fas_art |

    #Scenari Outline ile DDT yapılabilir. Scenario Outline iyi bilinmelidir.
    #Test adimlarini(STEPS) data reusable yapmak icin kullanilir
    #En çok kullanılan cucumber ozelliklerinden biridir
    #Examples kelisi veri girisleri icin kullanilmalidir
    #Step definitionslardaki data tipi STRINGdir
    #Examples kelimesi en sonda kullanilir
    #Data Tables ile DDT yapılabilir
    #Test adimlarini(STEPS) data reusable yapmak icin kullanilir
    #Scenari Outline kadar yaygın degildir
    #Examples kelimesi kullanılmaz
    #Step definitionslardaki data tipi DATATABLE
    #DataTablelar ara adimlardada(STEPS) kullanilabilir
    #NOT: Datatables ve Scenario Outline birlikle kullanilabilir