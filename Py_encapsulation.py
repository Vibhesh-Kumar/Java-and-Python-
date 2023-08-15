# class Father:# hierarcal Inheritance
#     surname="Singh"
#     def show(self):
#         print("My surname is",self.surname)
# class Son1(Father):
#     def disp(self):
#         print("My name is Vibhesh",self.surname)
# class Son2(Father):
#     def fun(self):
#         print("My name is Rohit ",self.surname)
# obj1=Son1()
# obj2=Son2()
# obj1.disp()
# obj2.fun()
# ENCAPSULATION
# class A:
#     _a=10  #protected
#     __b=29  #public
#     def show(self):
#         print("a=",self._a)
#         print("b=",self.__b)
# obj=A()
# obj.show()
# print("outside of class",A._a)
# print("outside of class",A.__b)# public so it will not run


#Abstract class
from abc import ABC,abstractmethod
class Car(ABC):
    def show(self):
        print("every car has four wheels")
    @abstractmethod
    def Speed(self):
        pass
class Maruti(Car):
    def Speed(self):
        print("speed is 100 km/h")
class Suzuki(Car):
    def Speed(self):
        print("speed is 70 km/h")
obj=Maruti()
obj.show()
obj.Speed()
obj=Suzuki()
obj.show()
obj.Speed()


