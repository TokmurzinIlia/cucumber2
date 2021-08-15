#language:ru
#encoding:UTF-8

  @test @login
  Функционал: Проверка авторизации на сайте "https://www.saucedemo.com/" с корректными данными

    Сценарий: Проверка, что при успешной авторизации происходит переход на страницу покупок "PRODUCTS"
      Допустим открыта страница "https://www.saucedemo.com/"
      И в поле Username введено значение "standard_user"
      И в поле Password введено значение "secret_sauce"
      И выполнено нажатие на кнопку "Login"
      Тогда происходит авторизация и переход на страницу покупок "PRODUCTS"
