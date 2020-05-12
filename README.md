# Практическое задание.
## Информационная система учебного заведения.
[Ссылка на задание](https://docs.google.com/document/d/1COj5FSznQYb5yC-z6eeu6ggpT8VijWzjwsvZ0ugukN8/edit)
## Структура системы в виде диаграммы классов:
[alt-диаграмма](https://github.com/EnaiY/task/blob/master/images/%D0%94%D0%B8%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B0.png)
```
 @startuml
- class Student {
- -id:int
- -name:String
- -courses: List<Course>
- +Student(name:String)
- +getId():int
- +getName(): String
- +addCourse(course: Course)
- +getCourses(): List<Course>
- }
- class Institute {
- -students: List<Students>
- -lecturers: List<Lecturers>
- -course: List<Courses>
- +getStudents(): List<Student>
- +addStudent:(student: Students)
- +getLecturer(): List<Lecturer>
- +addLecturer:(lecturer: Lecturers)
- +getCourses(): List<Course>
- +addCourses:(course: Courses) 
- }
- class Course{
- -nameCourse:String
- -students: List<Student>
- -lecturers: List<Lecturers>
- +getStudents(): List<Student>
- +getLecturers(): List<Lecturers>
- +addLecturer:(Lecturer: Lecturers)
- +addStudents:(students: Student)
- +addNameCourse:(nameCourse:String)
- +getName(): String 
- }
- class Lecturer{
- -name:String
- -courses: List<Course>
- -id:int
- +Lecturer(name:String)
- +getId():int
- +getName():String
- +getCourses(): List<Course>
- +addCourses: (courses: Course)
- }
- Institute o--> Student
- Institute o--> Course
- Institute o--> Lecturer
- Student - Course
- Course - Lecturer
- @enduml
```
