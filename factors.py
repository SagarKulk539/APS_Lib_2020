'''
APS-2020
Problem Description : Print all factors of a given number
Input : int (N)
Output : int[] (denoting all factors)
Code by : Sagar Kulkarni
'''

print("Enter a Number")
N=int(input())

print(f"The factors of {N} are")
for i in range(1,N+1):
    if N%i==0:
        print(i)
