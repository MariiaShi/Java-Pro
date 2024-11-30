package homework3;

public class Main {
    // Главный класс для симуляции конференции
        public static void main(String[] args) {
            // Переводчики для конференции
            Translator engToRus = new EnglishToRussianTranslator("Мария");
            Translator rusToGer = new RussianToGermanTranslator("Михаэль");
            Translator engToJpn = new EnglishToJapaneseTranslator("Айко");

            // Имитация перевода фразы на разных языках
            String phrase = "Hello, World";

            System.out.println("Конференция начинается. Переводы:");
            engToRus.displayInfo();
            System.out.println(engToRus.translate(phrase));

            rusToGer.displayInfo();
            System.out.println(rusToGer.translate("Привет, Мир"));

            engToJpn.displayInfo();
            System.out.println(engToJpn.translate(phrase));
        }
    }


