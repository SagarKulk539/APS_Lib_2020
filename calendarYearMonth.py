'''
APS-2020
Problem Description : Print calendar given year and month
Input : 2 int (year and month)
Output : string (calendar)
Code by : Sagar Kulkarni
'''

import calendar

print("Enter Year")
year=int(input())
print("Enter Month")
month=int(input())
print(calendar.month(year,month))
