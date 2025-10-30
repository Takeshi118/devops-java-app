# Используем официальный образ Java
FROM openjdk:17-jdk-slim

# Создаем рабочую директорию
WORKDIR /app

# Копируем JAR файл в контейнер
COPY target/devops-java-app-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт
EXPOSE 8081

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]