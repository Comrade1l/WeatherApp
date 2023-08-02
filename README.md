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
### - HTTP GET /api/weather/{city} - Возвращает текущую JSON информацию о погоде в указанном городе  
  
![image](https://github.com/Comrade1l/WeatherApp/assets/110826937/37149f05-1f63-47d2-a857-4791cbd3292f)  
### - HTTP GET /api/forecast/{city} - Возвращает текущую JSON информацию о погоде в указанном городе в течение 5 дней с интервалом 3 часа
  
![image](https://github.com/Comrade1l/WeatherApp/assets/110826937/28073e5d-efe2-468b-9a1b-4c9c46f5411e)



