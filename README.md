WFRPCharacterSheet (Warhammer Fantasy RolePlay CharacterSheet)

Jest to projekt tworzony z myślą o graczach jednego z najpopularniejszego systemu RPG, jakim jest Warhammer Fantasy Roleplay (II edycja).
W programie będzie możlwiość tworzenia nowych postaci oraz ich zapisu. Ponadto sam program będzie oferować testów konkretnych cech bez możliwości
podglądu konkretnego wyniku (na ekranie pojawi się tylko informacja dotycząca czy dany test jest zdany lub nie zdany).

Sam projekt traktuje przedewszystkim jako element nauki. Na ten moment zostały zaimplementowane:

1) <a href = "https://github.com/SlintPunk/WFRPCharacterSheet/tree/master/app/src/main/java/com/example/android/warhammerfrpcharactersheet"> Kod obsługujący ekran startowy (MainActivity) oraz wybór rasy (RaceChoiceActivity), </a>
        
2) <a href = "https://github.com/SlintPunk/WFRPCharacterSheet/blob/master/app/src/main/java/warhammercharactercreator/Character.java"> Klasa obsługująca konkretną postać (Character.java), </a>

3) <a href = "https://github.com/SlintPunk/WFRPCharacterSheet/tree/master/app/src/main/java/warhammercharactercreator">Abstakcyjna klasa odpowiedzialna za rasę (Race.java) oraz odpowiednie klasy dziedziczące (Elf.java itd.) </a>

4) <a href = "https://github.com/SlintPunk/WFRPCharacterSheet/blob/master/app/src/main/java/warhammercharactercreator/RaceFactory.java"> Wzorzec projektowy prosta fabryka (statyczna) do obsługi tworzenia obiektów rasy. </a>

5) <a href = "https://github.com/SlintPunk/WFRPCharacterSheet/blob/master/app/src/main/java/warhammercharactercreator/Dice.java"> "Statyczna" klasa Dice.java obsługująca rzuty kostką. </a>

6) <a href = "https://github.com/SlintPunk/WFRPCharacterSheet/blob/master/app/src/test/java/com/example/android/warhammerfrpcharactersheet/RaceFactoryCheckerTest.java"> Klasa z testem jednostkowym (RaceFactoryCheckerTest.java) sprawdzający poprawność działania prostej fabryki. </a>

Na ten moment planowane jest dodanie następujących funkcjonalności:

1) Dodanie nazwy postaci.
2) Dodanie metod odpowiedzialnych za losowanie cech (przy użyciu klasy Dice oraz odpowiedniej klasy Race),
3) Dodanie klasy odpowiedzialnej za obsługę profesji oraz (prawdopodobnie) ArrayListy które będą obsługiwać konkretną profesje dla danej rasy (wraz ze schematami rozwoju),
3) Stworzenie odpowiednich Activity które będą obsługiwać rzuty oraz wyświetlanie karty postaci,
4) Możliwość zapisu/odczytu,
5) Tworzenie randomowej postaci.

Sam kod także wymaga poprawek:
1) Uporządkowanie Activity na metody,
2) Krótsze komentarze oraz zmiana nazwy cech postaci na inne (bardziej treściwe), 
3) Zastąpienie każdego użycia Random.nextInt na Dice (klasa powstała później, przez co w kodzie każdorazowo użyłem obiektu Random).

W samym repozytorium nie dodałem obrazów które są obsługiwane przez ButtonView w Acitivity, ze względu na brak praw autorskich do ich użycia i rozpowszechniania.
