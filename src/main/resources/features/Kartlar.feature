@Kartlar
Feature: Kartlar funksionalligi

  Scenario: Istifadeci kredit kartlari sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kartlar alt menusuna klik edir
    And Istifadeci Kredit kartlari linkine klik edir
    Then Kredit kartlari sehifesi acilir

  Scenario: Istifadeci debet kartlari sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kartlar alt menusuna klik edir
    And Istifadeci Debet kartlari linkine klik edir
    Then Debet kartlari sehifesi acilir

  Scenario: Istifadeci kartlar ana sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kartlar alt menusuna klik edir
    Then Kartlar sehifesi acilir

  Scenario: Istifadeci EN kredit kartlari sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN kredit kartlari sehifesine kecir
    Then EN kredit kartlari sehifesi acilir

  Scenario: Istifadeci EN debet kartlari sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN debet kartlari sehifesine kecir
    Then EN debet kartlari sehifesi acilir

  Scenario: Istifadeci kredit kartlari URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kartlar alt menusuna klik edir
    And Istifadeci Kredit kartlari linkine klik edir
    Then Kredit kartlari URL-i dogrudur

  Scenario: Istifadeci debet kartlari URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kartlar alt menusuna klik edir
    And Istifadeci Debet kartlari linkine klik edir
    Then Debet kartlari URL-i dogrudur

  Scenario: Istifadeci kartlar sehifesinden kredit kartlarina kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kartlar alt menusuna klik edir
    And Istifadeci Kredit kartlari linkine klik edir
    Then Kredit kartlari sehifesi acilir
