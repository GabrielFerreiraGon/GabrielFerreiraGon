class Dog():
    
    def __init__(self,name,age):
        self.name = name 
        self.age = age
    def sit(self):
        print(self.name.title() + " is now sitting.")
    def roll_over(self):
        print(self.name.title() + " rolled over!")
      
      
my_dog = Dog('budog',34)

print(f"my dog's name is "+ my_dog.name.title()+'.')
print(f"my dog's name is "+ str(my_dog.age)+'.')

my_dog.sit()
my_dog.roll_over()

#criando instancias de Dog 
your_dog = Dog("pudou",12)

