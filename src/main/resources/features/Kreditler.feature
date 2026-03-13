@Kreditler
Feature: Kreditler funksionalligi

  Scenario: Istifadeci nagd kredit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Nagd kredit linkine klik edir
    Then Nagd kredit sehifesi acilir

  Scenario: Istifadeci avans kredit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Avans kredit linkine klik edir
    Then Avans kredit sehifesi acilir

  Scenario: Istifadeci indi al sonra ode sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Indi al sonra ode linkine klik edir
    Then Indi al sonra ode sehifesi acilir

  Scenario: Istifadeci avtomobil krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Avtomobil krediti linkine klik edir
    Then Avtomobil krediti sehifesi acilir

  Scenario: Istifadeci emanetci nagd krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Emanetci nagd krediti linkine klik edir
    Then Emanetci nagd krediti sehifesi acilir

  Scenario: Istifadeci ipoteka krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Ipoteka krediti linkine klik edir
    Then Ipoteka krediti sehifesi acilir

  Scenario: Istifadeci emanetci kredit limiti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Emanetci kredit limiti linkine klik edir
    Then Emanetci kredit limiti sehifesi acilir

  Scenario: Istifadeci kreditler ana sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    Then Kreditler sehifesi acilir

  Scenario: Istifadeci EN nagd kredit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN nagd kredit sehifesine kecir
    Then EN nagd kredit sehifesi acilir

  Scenario: Istifadeci EN avans kredit sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN avans kredit sehifesine kecir
    Then EN avans kredit sehifesi acilir

  Scenario: Istifadeci EN ipoteka krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN ipoteka krediti sehifesine kecir
    Then EN ipoteka krediti sehifesi acilir

  Scenario: Istifadeci EN avtomobil krediti sehifesine daxil olur
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN avtomobil krediti sehifesine kecir
    Then EN avtomobil krediti sehifesi acilir

  Scenario: Istifadeci nagd kredit URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Nagd kredit linkine klik edir
    Then Nagd kredit URL-i dogrudur

  Scenario: Istifadeci ipoteka krediti URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Ipoteka krediti linkine klik edir
    Then Ipoteka krediti URL-i dogrudur

  Scenario: Istifadeci avans kredit URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Avans kredit linkine klik edir
    Then Avans kredit URL-i dogrudur

  Scenario: Istifadeci avtomobil krediti URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Avtomobil krediti linkine klik edir
    Then Avtomobil krediti URL-i dogrudur

  Scenario: Istifadeci emanetci nagd krediti URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Emanetci nagd krediti linkine klik edir
    Then Emanetci nagd krediti URL-i dogrudur

  Scenario: Istifadeci indi al sonra ode URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Kreditler alt menusuna klik edir
    And Istifadeci Indi al sonra ode linkine klik edir
    Then Indi al sonra ode URL-i dogrudur
