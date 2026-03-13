@Haqqimizda
Feature: Haqqimizda funksionalligi

  Scenario: Istifadeci Rehberlik sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Rehberlik linkine klik edir
    Then Rehberlik sehifesi acilir

  Scenario: Istifadeci Idareetme ve Komiteler sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Idareetme ve Komiteler linkine klik edir
    Then Idareetme sehifesi acilir

  Scenario: Istifadeci Senedler sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Senedler linkine klik edir
    Then Senedler sehifesi acilir

  Scenario: Istifadeci Hesabatlar sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Hesabatlar linkine klik edir
    Then Hesabatlar sehifesi acilir

  Scenario: Istifadeci Teklif ve Iradlar sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Teklif ve Iradlar linkine klik edir
    Then Teklif ve Iradlar sehifesi acilir

  Scenario: Istifadeci Siyasetlerimiz sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Siyasetlerimiz linkine klik edir
    Then Siyasetlerimiz sehifesi acilir

  Scenario: Istifadeci Korporativ Teqdimat sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Korporativ Teqdimat linkine klik edir
    Then Korporativ Teqdimat sehifesi acilir

  Scenario: Istifadeci Arasdirma sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Arasdirma linkine klik edir
    Then Arasdirma sehifesi acilir

  Scenario: Istifadeci Brend Merkezi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Brend Merkezi linkine klik edir
    Then Brend Merkezi sehifesi acilir

  Scenario: Istifadeci Satinalmalar sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Satinalmalar linkine klik edir
    Then Satinalmalar sehifesi acilir

  Scenario: Istifadeci Investisiya Bankciliqi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Investisiya Bankciliqi linkine klik edir
    Then Investisiya Bankciliqi sehifesi acilir

  Scenario: Istifadeci Rehberlik URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Rehberlik linkine klik edir
    Then Rehberlik URL-i dogrudur

  Scenario: Istifadeci Hesabatlar URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Hesabatlar linkine klik edir
    Then Hesabatlar URL-i dogrudur

  Scenario: Istifadeci EN Rehberlik sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Rehberlik sehifesine kecir
    Then EN Rehberlik sehifesi acilir

  Scenario: Istifadeci EN Hesabatlar sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Hesabatlar sehifesine kecir
    Then EN Hesabatlar sehifesi acilir

  Scenario: Istifadeci EN Senedler sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Senedler sehifesine kecir
    Then EN Senedler sehifesi acilir

  Scenario: Istifadeci Senedler URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Senedler linkine klik edir
    Then Senedler URL-i dogrudur

  Scenario: Istifadeci Teklif ve Iradlar URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Teklif ve Iradlar linkine klik edir
    Then Teklif ve Iradlar URL-i dogrudur

  Scenario: Istifadeci EN Idareetme sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Idareetme sehifesine kecir
    Then EN Idareetme sehifesi acilir
