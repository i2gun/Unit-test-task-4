# Unit-tests. Зависимости в тестах  

## 1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

**Во-первых: _Изолирование зависимостей:_** Заглушки позволяют изолировать тестируемый модуль от внешних зависимостей, таких как базы данных, сетевые запросы или другие службы. Это делает тестирование с предсказуемым поведением сторонних объектов и позволяет концентрироваться на проверке корректности логики внутри тестируемого модуля.

**Во-вторых: _Ускорение тестирования:_** Заглушки работают быстрее, чем реальные зависимости, такие как базы данных или внешние службы. Это способствует ускорению выполнения тестов и повышению эффективности тестирования.

**В-тертьих: _Тестирование ошибок и граничных условий:_** С помощью заглушек можно создавать такие ситуации, которые у реальных зависимостей могут возникать очень редко (либо при определенной комбинации событий) и существует риск в тестах с реальными зависимостями так и не встретить такую ситуацию и соответствено не проветистировать ее. 

**В-четвертых: _Создание стабильных тестов:_** Заглушки обеспечивают стабильность тестов, независимо от внешних факторов, таких как недоступность внешней зависимости, либо проблемы с выходом в интернет и др.

**В-пятых: _Раннее тестирование:_** . В некоторых случаях часть компонентов может быть еще не готова, недоступна или не полностью реализована. Использование заглушек позволяет начать тестирование на ранних этапах процесса разработки, еще до того, как все зависимости будут готовы. Это актуально при параллельной разработке. Если интерфейсы согласованы, разработчики могут создавать заглушки для моделирования поведения компонентов, которые еще не реализованы другими.


## 2) Какой тип тестовой заглушки из пяти (dummy, stub, mock, spy, fake) следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
Если нужно проверить, что метод был вызван с определенными аргументами, можно использовать **spy** или **mock** в качестве тестового двойника. Они оба предназначены для отслеживания и проверки взаимодействия с тестируемой системой. В обоих случаях можно настроить их с ожидаемыми вызовами методов и аргументами, а затем выполнять код, который должен выполнять эти вызовы. После этого можно использовать spy или mock, чтобы проверить, был ли метод вызван должным образом.

## 3) Какой тип тестовой заглушки из пяти (dummy, stub, mock, spy, fake) следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
Для данных целей подходит заглушка **stub**, который является тестовым двойником, предоставляющим заранее определенные ответы на вызовы методов. Эта заглушка используются для моделирования поведения реального объекта путем возврата фиксированного значения или предопределенного исключения.

## 4) Какой тип тестовой заглушки из пяти (dummy, stub, mock, spy, fake) вы бы использовали для имитации взаимодействия с внешним API или базой данных? 
При моделировании взаимодействия с внешним API или базой данных при тестировании программного обеспечения можно использовать **mock** или **fake**.
1. **mock** загушка: это смоделированный объект, имитирующий поведение реального объекта, служит для проверки взаимодействия между компонентами. Моки используются для того чтобы убедиться, что определенные методы или функции вызываются с определенными параметрами в процессе тестирования.
2. **fake** заглушка: это упрощенная реализация компонента или системы, имитирующая определенные аспекты реального объекта или компонента. Фейки используются для замены реальных зависимостей, таких как внешние API или базы данных, более простыми альтернативами в целях тестирования.
