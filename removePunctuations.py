'''
APS-2020
Problem Description : Remove punctuations from a string
Input : string
Output : string (without punctuations)
Code by : Sagar Kulkarni
'''

punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''

print("Enter a String")
my_str=input()

no_punct=""
for char in my_str:
   if char not in punctuations:
       no_punct=no_punct + char

print(no_punct)
