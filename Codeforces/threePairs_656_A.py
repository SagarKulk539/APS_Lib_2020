'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1385/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    x,y,z=map(int,input().split())
    if x==y and x==z and y==z:
        print("YES")
        print(x,y,z)
    else:
        if x==y:
            a=x
            b=z
            c=z
            if max(a,b)==x and max(a,c)==y and max(b,c)==z:
                print("YES")
                print(a,b,c)
            else:
                print("NO")
        elif x==z:
            a=y
            b=x
            c=y
            if max(a,b)==x and max(a,c)==y and max(b,c)==z:
                print("YES")
                print(a,b,c)
            else:
                print("NO")
        elif y==z:
            a=x
            b=x
            c=y
            if max(a,b)==x and max(a,c)==y and max(b,c)==z:
                print("YES")
                print(a,b,c)
            else:
                print("NO")
        else:
            print("NO")
