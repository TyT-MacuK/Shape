Task Shapes Part I
Необходимо написать приложение и тесты к нему согласно требованиям, приведенным ниже. В приложении должна быть реализована функциональность, определенная индивидуальным заданием.  
Requirements 
Пусть задание сформулировано следующим образом: «Фигура. Разработать классы Точка и Фигура. Создать методы и тесты: вычисления площади и периметра фигуры; является ли фигура той именно фигурой по определению; пересекает ли фигура только одну из осей координат на заданное расстояние etc.»  
➢ Разработать entity-классы, например: «Разработать классы Точка и Фигура» 
➢ Entity-классы не следует наполнять методами, выполняющими функциональные действия (методами бизнес-логики, такими как вычисление, поиск и т.д.). 
➢ Фигура должна содержать поле id или name. ➢ Разработать action-классы реализующие заданные функциональности, например: «Реализовать методы вычисления площади и периметра фигуры» 
➢ Параметры, необходимые для создания объектов, читать из файла (.txt). Часть данных должна быть некорректной. Если встретилась некорректная строка, приложение должно переходить к следующей строке. Файлы не должны находиться вне каталогов. 
➢ Для чтения информации из файла использовать только возможности, появившиеся в Java8. 
➢ Разработать классы-валидаторы для проверки результатов вычислений параметров фигур, а также для валидации исходных данных для создания объектов entity-классов. Например: корректная строка в файле для создания объекта Круг: «1.0 2.0 3.0», где первое второе – координаты центра, третье - радиус круга; некорректная строка в файле для создания объекта Круг: «2a.0 3.0 4.1» - недопустимый символ «z», всю строку следует считать некорректной здесь и в случаях приведенных ниже; некорректная строка в файле для создания объекта Круг: «1.0 2.0» - недостаточно информации для создания объекта (можно использовать значение по умолчанию, н-р: 1); некорректная строка в файле для создания объекта Круг: «1.0 2.0 -3.0» - невозможно создать Круг с отрицательным радиусом. 
➢ Для классов-сущностей следует переопределять методы класса Object: toString(), equals(), hashCode(). Методы класса Objects использовать нельзя. 
➢ При решении задачи для создания entity-классов использовать паттерн Factory Method. 
➢ Все классы приложения должны быть структурированы по пакетам. 
➢ Использовать собственные классы исключительных ситуаций.
➢ Оформление кода должно соответствовать Java Code Convention. 
➢ Для записи логов использовать Log4J2. Логи писать следует в консоль и в файл. 
➢ Код должен быть покрыт Unit-тестами. Использовать TestNG (JUnit). При написании тестов запрещено: создавать неаннотированные методы, писать логи и использовать операторы ветвления: if, for, while, do\while, switch; использовать в тест-методе более одного Assertметода. 
➢ Класс с методом main в задании должен отсутствовать. Запуск только тестами. 
Task Shapes Part II 
