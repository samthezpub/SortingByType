# SortingByType

Привет! Добро пожаловать в репозиторий SortingByType. Этот проект является примером применения паттерна стратегии в контексте сортировки.

## О проекте

Этот проект реализует различные алгоритмы сортировки с использованием паттерна стратегии. При разработке уделялось внимание гибкости и расширяемости кода.

## Особенности

- Использование паттерна стратегии для реализации различных стратегий сортировки.
- Простота добавления новых стратегий без изменения существующего кода.

## Структура проекта

- `src/main/java/org/example/Sorts`: Здесь находится основной код, включая реализацию сортировок и интерфейс стратегии.
- `src/test/java/org/example/Sorts`: Тесты для проверки работоспособности сортировок.
- `src/main/java/org/example/App`  : Здесь находится Main класс, где происходит проверка типа сортировки и другие основные действия

## Как использовать

Пример использования сортировки с паттерном стратегии:

```java
/// Создаём объект sorter
Sorter sorter = new Sorter();

// Устанавливаем одну из сортировок (объект одного из классов BubbleSort, SelectionSort, ShuttleSort)
sorter.setSortType(sortType);
```

Пример установки одного из классов
```java
Sorter sorter = new Sorter();

ISort sortType = new BubbleSort();
sorter.setSortType(sortType);
```

Для того чтобы выполнить сортировку нужно использовать метод executeSort()
```java
Sorter sorter = new Sorter();

ISort sortType = new BubbleSort();
sorter.setSortType(sortType);

System.out.println("Массив после сортировки: " + Arrays.toString(sorter.executeSort(array)));
```
