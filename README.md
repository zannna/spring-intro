# Wprowadznie do Spring Framework
### [Spring framework](https://docs.spring.io/spring/docs/current/spring-framework-reference/)

1. Zainstaluj środowisko IntelliJ IDEA.
1. Wykonaj `git clone` tego projektu.
1. Zaimportuj projekt do IntelliJ:
    * wybierz `Import Project` a następnie wybierz plik `build.gradle` w katalogu do którego został sklonowany projekt
    * zaznacz `Use auto-import`
    * odznacz `Create separate module per source set`
    * jeżeli pojawia się `NullPointerException` wybierz inną Java JDK w polu `Gradle JVM` (dotyczy komputerów w pracowni)
    * w przypadku problemów z SDK wybierz odpowienie Java JDK w katalogu `C:\Program Files\Java` (dotyczy komputerów w pracowni)
1. Stwórz nowy branch zawierający w nazwie Twoje imię i nazwisko.
1. W pliku `com.example.MyNameMessageServiceTest` w teście `shouldReturnMyNameAsMessage` ustaw wartość zmiennej `expectedMessage` na swoje imię i nazwisko (np. `String expectedMessage = "Jan Kowalski`).
1. Uruchom test`MyNameMessageServiceTest`, upewnij się że nie działa.
1. Wprowadź odpowiednie zmiany w klasie `com.example.MyNameMessageService` aby naprawić niedziałający test. 
1. Uruchomi metodę `main` w klasie `MyApp`, upewnij się że Twoje imię i nazwisko jest wyświetlane na ekranie.
1. Dodaj klasę `RandomTextMessageService` implementującą `MessageService`. Klasa ta jako swój atrybut powinna posiadać tablicę (lub dowolny kontener) zawierającą 10 różnych wiadomości. Metoda `getMessage` tej klasy powinna zwracać losowo jedną z wiadomości przechowywanych wewnątrz klasy.
1. Zmodyfikuj plik `applicationContext.xml` tak, aby uruchamiając metodę `main` w klasie `MyApp` wykorzystywana była klasa `RandomTextMessageService` a nie `MyNameMessageService`.
1. W metodzie `main` klasy `MyApp` dodaj drugą zmienną typu `MessageService`, przypisz to niej ten sam Spring Bean co do wcześniejszej zmiennej.
1. Wypisz na ekran hashCode obu zmiennych - czy są one identyczne?
1. Zmodyfikuj plik `applicationContext.xml` i zmień scope bean'a `messageService` na taki, aby hashCode powyższych zmiennych był różny.
1. W pliku `applicationContext.xml` zakomentują linię z `<bean></bean>` i odkomentuj linię z `<component-scan>`.
1. Do klasy `MyNameMessageService` dodaj adnotację `@Component("messageService")`.
1. Do klasy `RandomTextMessageService` dodaj właściwą adnotację `@Component` (taką, aby kod działał poprawnie).
1. Uruchom metodę `main` w klasie `MyApp` i upewnij się, że poprawnie wyświtla Twoje imię.
1. Stwórz pull request z Twojego brancha do brancha master i zaproś użytkownika `lukasz-gaza-pk` do zrobienia code review.
