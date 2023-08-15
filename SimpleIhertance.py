# class A:# simple Inhetance
#     num1=int(input("enter the  first number:"))
#     num2=int(input("enter the  second number:"))
#     def Add(self):
#         print("Addition",self.num1+self.num2)
#     def Sub(self):
#         print("subtraction",self.num1-self.num2)
# class B(A):
#     def Mul(self):
#         print("multiplication",self.num1*self.num2)
#     def Div(self):
#         print("division",self.num1*self.num2)
#     def Rem(self):
#         print("remainder",self.num1*self.num2)

# obj=B()
# obj.Add()
# obj.Sub()
# obj.Mul()
# obj.Div()
# obj.Rem()

#python Inheritance
# class Father:
#     def Lands(self):
#         print("Having 20 ekar lands")
# class sons(Father):
#     def money(self):
#         print("having 10 lakh money")


# obj=sons()
# obj.Lands()
# obj.money()



# Multi level Inheritance
# class Parent:
#     surname="Singh"

# class Son(Parent):
#     def son(self):
#         print("vibhesh",self.surname)
# class Gson(Son):
#     def gson(self):
#         print("Aryan",self.surname)
# obj=Son()
# obj.son()

# obj=Gson()
# obj.gson()
# obj.son()


# Multiple Inhetitance
# class Hari:
#     Implement="Run python code using tensorflow"
#     def implement(self):
#         print("Implementation of project",self.Implement)
# class Bishnu:
#     def Document(self):
#         print("Prepare report")
# class Vibhesh(Hari,Bishnu):
#     def show(self):
#         print("face mask detection project creation")


# obj=Vibhesh()
# obj.implement()
# obj.Document()
# obj.show()


#HIERARCHICAL INHERITANCE
class Father:
    surname="Singh"
    def show(self):
        print("My surname is",self.surname)
class Son1:
    def son1(self):
        print("My name is Vibhesh",self.surname)
class Son2:
    def son2(self):
        print("My name is Rohit ",self.surname)
obj1=Son2()
obj2=Son1()
obj1.son1()
obj2.son2()


