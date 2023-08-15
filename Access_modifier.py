class A:
    a=10  # Public
    _b=20  # Protected
    __c=None # private
    print(a," ",_b," ",__c)
    def add(self):
        self.__c=self.a+self._b
        print("addition",self.__c)
# obj=A()
# obj.add()
# print(obj.a)
# print(obj._b)
# print(obj.__c) # protected so it does not access
# class B(A):
#     def Show(self):
#         print(self.a)
#         print(self._b)
#         print(self.__c)
# obj=B()
# pass # child class
# obj.Show()
# print(obj.a)
# print(obj._b)
# print(obj.__c)
class B:
    def Show(self):
        print(A.a)
        print(A._b)
        print(A.__c)
obj=B()
obj.Show()
