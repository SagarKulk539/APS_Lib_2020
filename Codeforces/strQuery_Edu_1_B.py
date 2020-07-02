'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/598/problem/B
Code by : Sagar Kulkarni
'''

s = input()
n = int(input())

for i in range(n):
    l, r, k = map(int, input().split())
    k = k % (r - l + 1)
    s = s[:l - 1] + s[r - k:r] + s[l - 1:r - k] + s[r:]

print(s)
