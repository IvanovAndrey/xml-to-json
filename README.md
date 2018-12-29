1) Клонируем проект из github:

git clone git@github.com:IvanovAndrey/xml-to-json.git

2) переходим в склонированный проект

3) В папке с проектом делаем образ:

./gradlew build docker

4) запускаем контейнер с пробросом на 80й порт:

docker run --name Ivanov_project -p 80:80 -d com.Ivanov/xml-to-json

5) Отправляем POST запрос

![Request](/example/example-of-work.png)

6) После тестирования останавливаем daemon:

docker stop Ivanov_project