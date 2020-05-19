# Практическое задание.
## Информационная система учебного заведения.
[Ссылка на задание](https://docs.google.com/document/d/1COj5FSznQYb5yC-z6eeu6ggpT8VijWzjwsvZ0ugukN8/edit)
## Структура системы в виде диаграммы классов:
![alt-диаграмма](https://github.com/EnaiY/task/blob/master/images/%D0%94%D0%B8%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B01.png)
```
 @startuml
class Student {
-count:int
-id:int
-name:String
-courses: List<Course>
+Student(name:String)
+getId():int
+getName(): String
+addCourse(course: Course)
+getCourses(): List<Course>
}
class Institute {
-address:String
-name:String
-students: List<Students>
-lecturers: List<Lecturers>
-course: List<Courses>
+Institute(name:String, address:String)
+getName:()String
+getAddress():String
+getStudents():List<Student>
+getAllStudents():List<Student>
+addStudent:(student: Students)
+getLecturers():List<Lecturer>
+getAllLecturers():List<Lecturer>
+addLecturer:(lecturer: Lecturers)
+getCourses():List<Course>
+addCourses:(course: Courses) 
}
class Course{
-nameCourse:String
-students: List<Student>
-lecturers: List<Lecturers>
-count:int
+getStudent(): List<Student>
+getLecturer(): List<Lecturers>
+addLecturer:(Lecturer: Lecturers)
+addStudent:(students: Student)
+addNameCourse:(nameCourse:String)
+getName(): String 
}
class Lecturer{
-name:String
-courses: List<Course>
-id:int
-count:int
+Lecturer(name:String)
+getId():int
+getName():S    tring
+getCourses(): List<Course>
+addCourses:(courses: Course)
}
class StudentForCourseAssigner {
-student:Student
-course:Course
+StudentForCourseAssigner():void
+assign():void
}
class LecturerForCourseAssigner {
-lecturer:Lecturer
-course:Course
+LecturerForCourseAssigner():void
+assign():void
}
class Main {
+main():String[] args
}
Institute o--> Student
Institute o--> Course
Institute o--> Lecturer
Student - Course
Course - Lecturer
StudentForCourseAssigner *-up-> Student
StudentForCourseAssigner *-up-> Course
LecturerForCourseAssigner *-up-> Course
LecturerForCourseAssigner *-up-> Lecturer
Main -down-> Institute
@enduml
```
