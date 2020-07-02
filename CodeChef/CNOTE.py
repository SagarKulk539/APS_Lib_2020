'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/CNOTE
Code by : Sagar Kulkarni
'''

n = int(input())
for _ in range(0, n):
    X, Y, K, N = map(int, input().split())
    flag=0
    for _ in range(0, N):
        p, c = map(int, input().split())
        if X-Y<=p and flag!=1 and c<=K:
            print('LuckyChef')
            flag=1
    if flag!=1:
        print('UnluckyChef')
