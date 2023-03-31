@scenario_outline_1
Feature: arama_feature_2

  Background:
    Given kullanici google gider
  @regression
  Scenario Outline: "<product>"_testi
    When kullanici "<product>" için arama yapar
    Then sonuclarin "<sonuc>" icerdigini dogrula
    Then close the application

    Examples: data
      | product | sonuc  |
      | iphone  | iphone |
      | tesla   | tesla  |
      | tv      | tv     |
      | flower  | flower |
      | cat     | cat    |
      | dog     | dog    |


#Scenario -> Scenario Outline
#"" -> "<sutun_ismi>"
#Example kelimesi Scenario Outline dan sonra kullanilmali
#Example verilerin kullanildagi yerdir


