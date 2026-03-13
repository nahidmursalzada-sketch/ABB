@HomePage
Feature: Ana Sehife funksionalligi

  Scenario: Istifadeci ana sehifeni yukleyir
    Given Istifadeci ABB Bank saytina daxil olur
    Then Ana sehife ugurla yuklenir

  Scenario: Istifadeci banner slayderini yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci banner next butonuna klik edir
    Then Banner deyisir

  Scenario: Istifadeci dil deyisdirir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    Then Sehife ingilis dilinde acilir

  Scenario: Istifadeci filiallar sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci filiallar linkine klik edir
    Then Filiallar sehifesi acilir

  Scenario: Istifadeci banner prev butonuna klik edir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci banner prev butonuna klik edir
    Then Banner geri deyisir

  Scenario: Istifadeci valyuta mezenneleri sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci valyuta mezenneleri linkine klik edir
    Then Valyuta mezenneleri sehifesi acilir

  Scenario: Istifadeci investorlarla elaqe sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci investorlarla elaqe linkine klik edir
    Then Investorlarla elaqe sehifesi acilir

  Scenario: Istifadeci ferdi sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Ferdi menusunun uzerine gelir
    And Istifadeci Ferdi linkine klik edir
    Then Ferdi sehifesi acilir

  Scenario: Istifadeci biznes sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Biznes menusunun uzerine gelir
    And Istifadeci Biznes linkine klik edir
    Then Biznes sehifesi acilir

  Scenario: Istifadeci haqqimizda sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci Haqqimizda menusunun uzerine gelir
    And Istifadeci Haqqimizda linkine klik edir
    Then Haqqimizda sehifesi acilir

  Scenario: Istifadeci EN dilinde ferdi sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN ferdi sehifesine kecir
    Then EN ferdi sehifesi acilir

  Scenario: Istifadeci EN dilinde biznes sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN biznes sehifesine kecir
    Then EN biznes sehifesi acilir

  Scenario: Istifadeci EN dilinde haqqimizda sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN haqqimizda sehifesine kecir
    Then EN haqqimizda sehifesi acilir

  Scenario: Istifadeci kampaniyalar sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci kampaniyalar sehifesine kecir
    Then Kampaniyalar sehifesi acilir

  Scenario: Istifadeci xeberler sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci xeberler sehifesine kecir
    Then Xeberler sehifesi acilir

  Scenario: Istifadeci karyera sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci karyera sehifesine kecir
    Then Karyera sehifesi acilir

  Scenario: Istifadeci EN kampaniyalar sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN kampaniyalar sehifesine kecir
    Then EN kampaniyalar sehifesi acilir

  Scenario: Istifadeci EN xeberler sehifesine kecir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci EN diline kecid edir
    And Istifadeci EN xeberler sehifesine kecir
    Then EN xeberler sehifesi acilir

  Scenario: Istifadeci filiallar URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci filiallar linkine klik edir
    Then Filiallar URL-i dogrudur

  Scenario: Istifadeci valyuta mezenneleri URL yoxlayir
    Given Istifadeci ABB Bank saytina daxil olur
    When Istifadeci valyuta mezenneleri linkine klik edir
    Then Valyuta mezenneleri URL-i dogrudur
