Genre - @ManyToMany - Book
StatusBook - @OneToMany - Book

Role - @OneToMany - User

Book - @ManyToMany - User

в entity: book и user были добавлены аннотации @JsonIgnoreProperties, так как я выходил на бесконечный цикл, то есть он вытаскивал user затем вытаскивал его роль, где есть юзеры и так до бесконечности.

Остальное сделано по лекциям.
