# Домашнее задание

∎ Существует паромная переправа. Паром может переправлять одновременно по три 
автомобиля. Чтобы не гонять паром лишний раз, нужно отправлять его, когда у 
переправы соберется минимум три автомобиля. Добавьте в класс конструкцию 
CyclicBarrier, чтобы паром переправлял по три автомобиля

∎ Проведем автомобильную гонку. В гонке принимают участие пять автомобилей. 
Для начала гонки нужно, чтобы выполнялись следующие условия:
- Каждый из пяти автомобилей подъехал к стартовой прямой
- Была дана команда «На старт!»
- Была дана команда «Внимание!»
- Была дана команда «Марш!»
- Важно, чтобы все автомобили стартовали одновременно

Добавьте в класс конструкцию CountDownLatch, чтобы все условия были выполнены

∎ Существует парковка, которая одновременно может вмещать не более 5 
автомобилей. Если парковка заполнена полностью, то вновь прибывший 
автомобиль должен подождать пока не освободится хотя бы одно место. 
После этого он сможет припарковаться. Добавьте в класс конструкцию 
Semaphore, чтобы все условия были выполнены