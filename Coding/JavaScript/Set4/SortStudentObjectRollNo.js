class Student{
    rollno
    name
    constructor(rollno, name){
        this.rollno = rollno
        this.name = name
    }
}

let s1 = new Student(3, "hi")
let s2 = new Student(2, "bye")
let s3 = new Student(1, "hello")

let arr = [s1, s2, s3]
console.log(arr.sort((a,b) => a.rollno - b.rollno))