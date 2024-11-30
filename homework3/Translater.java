package homework3;

abstract class Translator {
    protected String name;
    protected String fromLanguage;
    protected String toLanguage;

    public Translator(String name, String fromLanguage, String toLanguage) {
        this.name = name;
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
    }

    // Метод для получения информации
    public void displayInfo() {
        System.out.println("Translator: " + name);
        System.out.println("Translating from: " + fromLanguage + " to: " + toLanguage);
    }

    // Абстрактный метод перевода
    public abstract String translate(String text);
}

// Переводчик с английского на русский
class EnglishToRussianTranslator extends Translator {
    public EnglishToRussianTranslator(String name) {
        super(name, "English", "Russian");
    }

    @Override
    public String translate(String text) {
        // Простая имитация перевода
        return "Перевод с английского на русский: " + text.replace("Hello", "Привет").replace("World", "Мир");
    }
}

// Переводчик с русского на немецкий
class RussianToGermanTranslator extends Translator {
    public RussianToGermanTranslator(String name) {
        super(name, "Russian", "German");
    }

    @Override
    public String translate(String text) {
        // Простая имитация перевода
        return "Übersetzung vom Russischen ins Deutsche: " + text.replace("Привет", "Hallo").replace("Мир", "Welt");
    }
}

// Переводчик с английского на японский
class EnglishToJapaneseTranslator extends Translator {
    public EnglishToJapaneseTranslator(String name) {
        super(name, "English", "Japanese");
    }

    @Override
    public String translate(String text) {
        // Простая имитация перевода
        return "英語から日本語への翻訳: " + text.replace("Hello", "こんにちは").replace("World", "世界");
    }
}

