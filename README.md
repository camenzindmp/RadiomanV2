# hw8_Radio
## CYCLOMATIC COMPLEXITY

1. Формулу вычисления количества unit-тестов на основании **значений, генерируемых JaCoCo**

Насколько я понимаю, минимальное количество линейно независимых маршрутов через конкретный метод и будет являться рекомендуемым 
числом unit-тестов для данного метода.

Значит и формула будет соответствовать формуле цикломатической сложности(?)*:

```M = E − N + 2P```

```M``` = цикломатическая сложность;

```N``` = количество возможных исходов (каждый if);

```E``` = минимальное количество "путей", которые приведут к каждому из N-исходов; 

```P``` = количество невязных между собой методов в классе;

**???**

*после настройки complexity в idea я не увидел **значений, генерируемых JaCoCo**, так что могу только предполагать..
