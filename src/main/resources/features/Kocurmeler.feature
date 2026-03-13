@Kocurmeler
Feature: Kocurmeler funksionalligi

  Scenario: Istifadeci tecili pul kocurmeleri sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Tecili pul kocurmeleri linkine klik edir
    Then Tecili pul kocurmeleri sehifesi acilir

  Scenario: Istifadeci bank kocurmeleri sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Bank kocurmeleri linkine klik edir
    Then Bank kocurmeleri sehifesi acilir

  Scenario: Istifadeci DigiTransfer sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci DigiTransfer linkine klik edir
    Then DigiTransfer sehifesi acilir

  Scenario: Istifadeci Western Union sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Western Union linkine klik edir
    Then Western Union sehifesi acilir

  Scenario: Istifadeci Granat sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Granat linkine klik edir
    Then Granat sehifesi acilir

  Scenario: Istifadeci Manat Express sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Manat Express linkine klik edir
    Then Manat Express sehifesi acilir

  Scenario: Istifadeci UPT sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci UPT linkine klik edir
    Then UPT sehifesi acilir

  Scenario: Istifadeci emeliyyatlar ana sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    Then Emeliyyatlar sehifesi acilir

  Scenario: Istifadeci tecili pul kocurmeleri URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Tecili pul kocurmeleri linkine klik edir
    Then Tecili pul kocurmeleri URL-i dogrudur

  Scenario: Istifadeci bank kocurmeleri URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Bank kocurmeleri linkine klik edir
    Then Bank kocurmeleri URL-i dogrudur

  Scenario: Istifadeci EN tecili pul kocurmeleri sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN tecili pul kocurmeleri sehifesine kecir
    Then EN tecili pul kocurmeleri sehifesi acilir

  Scenario: Istifadeci EN bank kocurmeleri sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN bank kocurmeleri sehifesine kecir
    Then EN bank kocurmeleri sehifesi acilir

  Scenario: Istifadeci DigiTransfer URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci DigiTransfer linkine klik edir
    Then DigiTransfer URL-i dogrudur

  Scenario: Istifadeci Western Union URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Emeliyyatlar alt menusuna klik edir
    And Istifadeci Western Union linkine klik edir
    Then Western Union URL-i dogrudur

  Scenario: Istifadeci EN emeliyyatlar sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN emeliyyatlar sehifesine kecir
    Then EN emeliyyatlar sehifesi acilir
