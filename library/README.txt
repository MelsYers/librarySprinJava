Genre - @ManyToMany - Book
StatusBook - @OneToMany - Book

Role - @OneToMany - User

Book - @ManyToMany - User

Создание таблицы в базе данных не требуется, программа сама создает их
при проверке вписать правильные данные для applcation.properties 
