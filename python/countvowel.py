str=input("enter the string:")
str=str.lower()
vowels="aeiou"

count={}.fromkeys(vowels,0)
for char in str:
    if char in count:
        count[char]=count[char]+1
print(count)