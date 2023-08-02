# WeatherApp
Простой агрегатор информации о погоде из открытого сервиса OpenWeatherMap. 
Задание выполнено при помощи Java и Spring Boot.  

### Структура проекта:  
- controller
- model
- service  
- resource

## Запуск
1. Клонировать код из репозитория
2. Вставить токен из сервиса OpenWeatherMap
3. Запустить приложение

## Руководство  
- HTTP GET /api/weather/{city} - Возвращает текущую JSON информацию о погоде в указанном городе
  
![image](https://github.com/Comrade1l/WeatherApp/assets/110826937/4f8d7d4d-daad-4d01-9306-c6946bb693cc)
- HTTP GET /api/forecast/{city} - Возвращает текущую JSON информацию о погоде в указанном городе в течение 5 дней с интервалом 3 часа
  
![image](https://github.com/Comrade1l/WeatherApp/assets/110826937/da41e98e-3230-4829-bcea-d0d22614a5ed)


