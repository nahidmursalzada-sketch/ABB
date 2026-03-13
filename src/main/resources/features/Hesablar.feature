@Hesablar
Feature: Hesablar funksionalligi

  Scenario: Istifadeci DigiHesab Max sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci DigiHesab Max linkine klik edir
    Then DigiHesab Max sehifesi acilir

  Scenario: Istifadeci DigiHesab sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci DigiHesab linkine klik edir
    Then DigiHesab sehifesi acilir

  Scenario: Istifadeci Cari hesab sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci Cari hesab linkine klik edir
    Then Cari hesab sehifesi acilir

  Scenario: Istifadeci Dama-Dama sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci Dama-Dama linkine klik edir
    Then Dama-Dama sehifesi acilir

  Scenario: Istifadeci hesablar ana sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    Then Hesablar sehifesi acilir

  Scenario: Istifadeci EN DigiHesab Max sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN DigiHesab Max sehifesine kecir
    Then EN DigiHesab Max sehifesi acilir

  Scenario: Istifadeci EN DigiHesab sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN DigiHesab sehifesine kecir
    Then EN DigiHesab sehifesi acilir

  Scenario: Istifadeci DigiHesab Max URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci DigiHesab Max linkine klik edir
    Then DigiHesab Max URL-i dogrudur

  Scenario: Istifadeci Cari hesab URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci Cari hesab linkine klik edir
    Then Cari hesab URL-i dogrudur

  Scenario: Istifadeci Dama-Dama URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci Dama-Dama linkine klik edir
    Then Dama-Dama URL-i dogrudur

  Scenario: Istifadeci EN Cari hesab sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Cari hesab sehifesine kecir
    Then EN Cari hesab sehifesi acilir

  Scenario: Istifadeci DigiHesab URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Hesablar alt menusuna klik edir
    And Istifadeci DigiHesab linkine klik edir
    Then DigiHesab URL-i dogrudur
