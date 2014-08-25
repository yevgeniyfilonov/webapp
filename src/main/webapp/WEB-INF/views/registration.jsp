<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Главная страница блога</title>
</head>
<body>
<header>
    <a href="/"><img alt="Логотип" id="top-image" src="#"/></a>

    <div id="user-panel">
        <a href="#"><img alt="Иконка юзера" scr=""/></a>
        <a href="javascript:void(0);">[Панель для юзера]</a>
    </div>
</header>
<div id="main">
    <aside class="leftAside">
        <h2>Что нужно для регистрации</h2>

        <p>Что бы регистрация прошла успешно, заполните все поля и нажмите на
            кнопку "Зарегистрироваться"
        </p>
    </aside>
    <section>
        <article>
            <h1>Регистрация</h1>

            <div class="text-article">
                <form method="POST" action="registration">
                    <p>
                        <label for="login">Логин</label>
                        <input type="text" name="login" id="login"/>
                    </p>

                    <p>
                        <label for="email">E-Mail</label>
                        <input type="email" name="email" id="email"/>
                    </p>

                    <p>
                        <label for="password">Пароль</label>
                        <input type="password" name="password" id="password"/>

                        <label for="password2">Повторите пароль</label>
                        <input type="password" name="password2" id="password2"/>
                    </p>

                    <p>
                        <button type="submit">Зарегистрироваться</button>
                    </p>
                </form>
            </div>
        </article>
    </section>
</div>
<div class="fotter-article">
    <span class="autor">Автор статьи: <a href="#">автор</a></span>
    <span class="read"><a href="javascript:void(0);">Читать...</a></span>
    <span class="date-article">Дата статьи: ().().()</span>
</div>
</article>
<article>
    <h1>Статья</h1>

    <div class="text-article">
        Текст статьи
    </div>
    <div class="fotter-article">
        <span class="autor">Автор статьи: <a href="#">автор</a></span>
        <span class="read"><a href="javascript:void(0);">Читать...</a></span>
        <span class="date-article">Дата статьи: ().().()</span>

    </div>
</article>
</section>
</div>
<footer>
    <div>
        <span>Тестовое приложение JAVA EE</span>
    </div>
</footer>
</body>
</html>