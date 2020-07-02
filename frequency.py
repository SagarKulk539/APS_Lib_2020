'''
APS-2020
Problem Description : Display the frequency of each element in the given array
Input : int[]
Output : dict {key:value -> element:frequency}
Code by : Sagar Kulkarni
'''

print("Enter elements for the array (space seperated)")
list1=[int(x) for x in input().split()]
list2=[]

for i in range(len(list1)):
    if list1[i] not in list2:
        list2.append(list1[i])
        print(f'{list1[i]} : {list1.count(list1[i])}')
