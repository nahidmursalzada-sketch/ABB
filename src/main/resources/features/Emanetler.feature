@Emanetler
Feature: Emanetler funksionalligi

  Scenario: Istifadeci DigiDeposit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci DigiDeposit linkine klik edir
    Then DigiDeposit sehifesi acilir

  Scenario: Istifadeci klassik emanet sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci Klassik emanet linkine klik edir
    Then Klassik emanet sehifesi acilir

  Scenario: Istifadeci depozit seyfi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci Depozit seyfi linkine klik edir
    Then Depozit seyfi sehifesi acilir

  Scenario: Istifadeci emanetli ipoteka krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci Emanetli ipoteka krediti linkine klik edir
    Then Emanetli ipoteka krediti sehifesi acilir

  Scenario: Istifadeci emanetler ana sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    Then Emanetler sehifesi acilir

  Scenario: Istifadeci EN digideposit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN DigiDeposit sehifesine kecir
    Then EN DigiDeposit sehifesi acilir

  Scenario: Istifadeci EN klassik emanet sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN klassik emanet sehifesine kecir
    Then EN klassik emanet sehifesi acilir

  Scenario: Istifadeci DigiDeposit URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci DigiDeposit linkine klik edir
    Then DigiDeposit URL-i dogrudur

  Scenario: Istifadeci klassik emanet URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci Klassik emanet linkine klik edir
    Then Klassik emanet URL-i dogrudur

  Scenario: Istifadeci depozit seyfi URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emanetler alt menusuna klik edir
    And Istifadeci Depozit seyfi linkine klik edir
    Then Depozit seyfi URL-i dogrudur
