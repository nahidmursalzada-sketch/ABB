@Biznes
Feature: Biznes funksionalligi

  Scenario: Istifadeci Korporativ sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    Then Korporativ sehifesi acilir

  Scenario: Istifadeci Kicik ve Orta Biznes sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    Then Kicik ve Orta Biznes sehifesi acilir

  Scenario: Istifadeci Mikro Biznes sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Mikro Biznes linkine klik edir
    Then Mikro Biznes sehifesi acilir

  Scenario: Istifadeci Korporativ kreditler sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Korporativ kreditler linkine klik edir
    Then Korporativ kreditler sehifesi acilir

  Scenario: Istifadeci Emekhaqi kartlari sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Emekhaqi kartlari linkine klik edir
    Then Emekhaqi kartlari sehifesi acilir

  Scenario: Istifadeci Korporativ VISA Business Platinum sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci VISA Business Platinum linkine klik edir
    Then VISA Business Platinum sehifesi acilir

  Scenario: Istifadeci Korporativ Mastercard Corporate sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Mastercard Corporate linkine klik edir
    Then Mastercard Corporate sehifesi acilir

  Scenario: Istifadeci Korporativ Mastercard Business sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Mastercard Business linkine klik edir
    Then Mastercard Business sehifesi acilir

  Scenario: Istifadeci Korporativ VISA Business sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci VISA Business linkine klik edir
    Then VISA Business sehifesi acilir

  Scenario: Istifadeci Korporativ VISA Business Gold sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci VISA Business Gold linkine klik edir
    Then VISA Business Gold sehifesi acilir

  Scenario: Istifadeci Korporativ Gomruk Karti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Gomruk Karti linkine klik edir
    Then Gomruk Karti sehifesi acilir

  Scenario: Istifadeci Korporativ Pul Kocurmeleri sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Korporativ Pul Kocurmeleri linkine klik edir
    Then Korporativ Pul Kocurmeleri sehifesi acilir

  Scenario: Istifadeci Korporativ Senedli Emeliyyatlar sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Senedli Emeliyyatlar linkine klik edir
    Then Senedli Emeliyyatlar sehifesi acilir

  Scenario: Istifadeci Korporativ Ani Odenis Sistemi sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Ani Odenis Sistemi linkine klik edir
    Then Ani Odenis Sistemi sehifesi acilir

  Scenario: Istifadeci KOB Ani Kredit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    And Istifadeci KOB Ani Kredit linkine klik edir
    Then KOB Ani Kredit sehifesi acilir

  Scenario: Istifadeci KOB Sahibkar Krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    And Istifadeci KOB Sahibkar Krediti linkine klik edir
    Then KOB Sahibkar Krediti sehifesi acilir

  Scenario: Istifadeci KOB Qarantiya sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    And Istifadeci KOB Qarantiya linkine klik edir
    Then KOB Qarantiya sehifesi acilir

  Scenario: Istifadeci KOB Odenis Kartlari sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    And Istifadeci KOB Odenis Kartlari linkine klik edir
    Then KOB Odenis Kartlari sehifesi acilir

  Scenario: Istifadeci Korporativ URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    Then Korporativ URL-i dogrudur

  Scenario: Istifadeci KOB URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    Then KOB URL-i dogrudur

  Scenario: Istifadeci Mikro Biznes URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Mikro Biznes linkine klik edir
    Then Mikro Biznes URL-i dogrudur

  Scenario: Istifadeci EN Korporativ sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Korporativ sehifesine kecir
    Then EN Korporativ sehifesi acilir

  Scenario: Istifadeci EN KOB sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN KOB sehifesine kecir
    Then EN KOB sehifesi acilir

  Scenario: Istifadeci EN Mikro Biznes sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Mikro Biznes sehifesine kecir
    Then EN Mikro Biznes sehifesi acilir

  Scenario: Istifadeci Korporativ kreditler URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Korporativ kreditler linkine klik edir
    Then Korporativ kreditler URL-i dogrudur

  Scenario: Istifadeci VISA Business Platinum URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci VISA Business Platinum linkine klik edir
    Then VISA Business Platinum URL-i dogrudur

  Scenario: Istifadeci Emekhaqi kartlari URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Emekhaqi kartlari linkine klik edir
    Then Emekhaqi kartlari URL-i dogrudur

  Scenario: Istifadeci KOB Ani Kredit URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Kicik ve Orta Biznes linkine klik edir
    And Istifadeci KOB Ani Kredit linkine klik edir
    Then KOB Ani Kredit URL-i dogrudur

  Scenario: Istifadeci EN Korporativ kreditler sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN Korporativ kreditler sehifesine kecir
    Then EN Korporativ kreditler sehifesi acilir

  Scenario: Istifadeci Mastercard Corporate URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Korporativ linkine klik edir
    And Istifadeci Mastercard Corporate linkine klik edir
    Then Mastercard Corporate URL-i dogrudur
