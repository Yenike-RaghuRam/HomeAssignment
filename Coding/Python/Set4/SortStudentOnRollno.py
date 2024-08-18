from functools import total_ordering


class Student:
    def __init__(self, rollno, name):
        self.rollno = rollno
        self.name = name

    def __repr__(self):
        return str((self.rollno, self.name))


@total_ordering
class Student2:
    def __init__(self, rollno, name):
        self.rollno = rollno
        self.name = name

    def __lt__(self, other):
        return self.rollno < other.rollno

    def __repr__(self):
        return str((self.rollno, self.name))


s1 = Student(2, " one")
s2 = Student(1, "hi")
s = [s1, s2]
print(s)

print(sorted(s, key=lambda x: x.rollno))
print(sorted(s, key=lambda x: x.rollno, reverse=True))

print("#################################################")

s1 = Student2(2, " one")
s2 = Student2(1, "hi")
sp = [s1, s2]
print(sp)
print(sorted(sp))

