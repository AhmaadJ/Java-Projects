import random;

def main():
   number = random.randint(0, 9)
   print(number + " ! " + end='')
   printfactorial(number)      

def factorial(n):
   if n == 1:
      return n
   else:
      return factorial(n-1)   