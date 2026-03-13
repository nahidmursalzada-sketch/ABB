@Kesbek
Feature: Kesbek funksionalligi

  Scenario: Istifadeci Faydali Kesbek sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Faydali Kesbek linkine klik edir
    Then Faydali Kesbek sehifesi acilir

  Scenario: Istifadeci Fayda Max sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Fayda Max linkine klik edir
    Then Fayda Max sehifesi acilir

  Scenario: Istifadeci Faydali Klub sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Faydali Klub linkine klik edir
    Then Faydali Klub sehifesi acilir

  Scenario: Istifadeci Endirimler sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Endirimler linkine klik edir
    Then Endirimler sehifesi acilir

  Scenario: Istifadeci kesbek ana sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    Then Kesbek sehifesi acilir

  Scenario: Istifadeci Faydali Kesbek URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Faydali Kesbek linkine klik edir
    Then Faydali Kesbek URL-i dogrudur

  Scenario: Istifadeci Fayda Max URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Fayda Max linkine klik edir
    Then Fayda Max URL-i dogrudur

  Scenario: Istifadeci EN Faydali Kesbek sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Faydali Kesbek sehifesine kecir
    Then EN Faydali Kesbek sehifesi acilir

  Scenario: Istifadeci Faydali Klub URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kesbek alt menusuna klik edir
    And Istifadeci Faydali Klub linkine klik edir
    Then Faydali Klub URL-i dogrudur

  Scenario: Istifadeci EN Fayda Max sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Fayda Max sehifesine kecir
    Then EN Fayda Max sehifesi acilir
