'''
APS-2020
Problem Description : This program displays the current time
Input : null
Output : string (current time)
Code by : Sagar Kulkarni
'''

from datetime import datetime

now = datetime.now()
current_time = now.strftime("%Hh:%Mm:%Ss")
print("Current Time : ", current_time)
