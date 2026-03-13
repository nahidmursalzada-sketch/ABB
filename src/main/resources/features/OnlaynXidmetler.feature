@OnlaynXidmetler
Feature: Onlayn Xidmetler funksionalligi

  Scenario: Istifadeci ABB Mobile sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci ABB Mobile linkine klik edir
    Then ABB Mobile sehifesi acilir

  Scenario: Istifadeci Melumat Merkezi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Melumat Merkezi linkine klik edir
    Then Melumat Merkezi sehifesi acilir

  Scenario: Istifadeci Kredit Odenisi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kredit Odenisi linkine klik edir
    Then Kredit Odenisi sehifesi acilir

  Scenario: Istifadeci Karta Medaxil sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Karta Medaxil linkine klik edir
    Then Karta Medaxil sehifesi acilir

  Scenario: Istifadeci Cash by Code sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Cash by Code linkine klik edir
    Then Cash by Code sehifesi acilir

  Scenario: Istifadeci Sigorta sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Sigorta linkine klik edir
    Then Sigorta sehifesi acilir

  Scenario: Istifadeci Investisiya sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Investisiya linkine klik edir
    Then Investisiya sehifesi acilir

  Scenario: Istifadeci Arayis Sifarisi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Arayis Sifarisi linkine klik edir
    Then Arayis Sifarisi sehifesi acilir

  Scenario: Istifadeci Pul Kocurmesi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Pul Kocurmesi linkine klik edir
    Then Pul Kocurmesi sehifesi acilir

  Scenario: Istifadeci PIN kod sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci PIN kod linkine klik edir
    Then PIN kod sehifesi acilir

  Scenario: Istifadeci Iane et sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Iane et linkine klik edir
    Then Iane et sehifesi acilir

  Scenario: Istifadeci EN ABB Mobile sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN ABB Mobile sehifesine kecir
    Then EN ABB Mobile sehifesi acilir

  Scenario: Istifadeci EN Sigorta sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Sigorta sehifesine kecir
    Then EN Sigorta sehifesi acilir

  Scenario: Istifadeci ABB Mobile URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci ABB Mobile linkine klik edir
    Then ABB Mobile URL-i dogrudur

  Scenario: Istifadeci Kredit Odenisi URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kredit Odenisi linkine klik edir
    Then Kredit Odenisi URL-i dogrudur

  Scenario: Istifadeci Karta Medaxil URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Karta Medaxil linkine klik edir
    Then Karta Medaxil URL-i dogrudur

  Scenario: Istifadeci Sigorta URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Sigorta linkine klik edir
    Then Sigorta URL-i dogrudur

  Scenario: Istifadeci Investisiya URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Investisiya linkine klik edir
    Then Investisiya URL-i dogrudur

  Scenario: Istifadeci Cash by Code URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Cash by Code linkine klik edir
    Then Cash by Code URL-i dogrudur

  Scenario: Istifadeci EN Kredit Odenisi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Kredit Odenisi sehifesine kecir
    Then EN Kredit Odenisi sehifesi acilir
