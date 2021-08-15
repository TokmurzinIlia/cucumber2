#language:ru
#encoding:UTF-8

@test
Функционал: Параметризированный запуск тестов

  Структура сценария: Проверка цены объектов <objectName>
    Допустим открыта страница "https://www.saucedemo.com/"
    И в поле Username введено значение "standard_user"
    И в поле Password введено значение "secret_sauce"
    И выполнено нажатие на кнопку "Login"
    И выполнено нажатие на ссылку "<objectName>"
    Тогда цена объекта равна "<objectPrice>"

    Примеры:
      | objectName             | objectPrice |
      | Sauce Labs Backpack    | $29.99      |
      | Sauce Labs Bike Light  | $9.99       |
      | Sauce Labs Bolt T-Shirt| $15.99      |
