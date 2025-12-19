# UI Automation Tests (Web + Mobile)

Учебный проект по автоматизированному тестированию пользовательских интерфейсов:
- **веб-сайт Wikipedia** (Selenium WebDriver)
- **Android-приложение Wikipedia** (Appium)

Проект реализован в рамках задания по UI-тестированию и демонстрирует навыки
работы с Selenium, Appium, TestNG и Page Object Model.

---

## Часть 1. Автотесты веб-сайта Wikipedia

### Описание
Автоматизированные UI-тесты для публичного сайта https://www.wikipedia.org/  
Сайт выбран из-за простого интерфейса, отсутствия авторизации и стабильных элементов.

Тесты проверяют основные пользовательские сценарии:
- навигацию;
- поиск;
- корректность отображения контента;
- многоязычность и локализацию.

### Покрытые сценарии
1. Открытие главной страницы и проверка заголовка
2. Поиск статьи по ключевому слову
3. Открытие статьи
4. Возможность смены языка интерфейса
5. Переключение языка на русский и проверка URL

### Используемые технологии
- Java 11+
- Selenium WebDriver
- TestNG
- WebDriverManager
- Maven
- Page Object Model (POM)

##  Структура проекта
src
└── test
├── java
│   ├── base
│   │   └── BaseWebTest.java
│   ├── pages
│   │   ├── MainPage.java
│   │   └── ArticlePage.java
│   └── tests
│       └── WikipediaWebTest.java
└── resources
└── testng.xml
pom.xml
README.md

## Требования к окружению

### Общее
- JDK 11 или выше
- Maven 3.8+
- Git

### Для веб-тестов
- Google Chrome (или другой браузер)
- Интернет-соединение

## Запуск тестов

###
```bash
mvn test

![Скрин](C:\Users\Mouse\Downloads\Telegram Desktop\photo_2025-12-19_23-45-40.jpg)