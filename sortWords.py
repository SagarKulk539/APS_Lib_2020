'''
APS-2020
Problem Description : Given a string of words this program prints them in alphabetical order
Input : string
Output : string[] (sorted words)
Code by : Sagar Kulkarni
'''

print("Enter a string with multiple words")
my_str=input()

words = my_str.split()
words.sort()

print("The sorted words are:")
for word in words:
   print(word)
