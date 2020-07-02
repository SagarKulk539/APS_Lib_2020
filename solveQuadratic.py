'''
APS-2020
Problem Description : Solve quadratic equation of the form ax2+bx+c
Input : 3 int (a,b,c)
Output : 2 complex (x1,x2 -> roots)
Code by : Sagar Kulkarni
'''

import cmath

print("Equation : ax2+bx+c")
print("Enter a")
a=int(input())
print("Enter b")
b=int(input())
print("Enter c")
c=int(input())

d=(b**2)-(4*a*c)
sol1=(-b-cmath.sqrt(d))/(2*a)
sol2=(-b+cmath.sqrt(d))/(2*a)

print(f'The solutions for the equation are {sol1} and {sol2}')
