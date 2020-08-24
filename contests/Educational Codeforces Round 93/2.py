T = int(input()) 
for i in range(T):
    s = input()
    l = []
    count = 0
    for i in range(len(s)):
        if s[i] == '1':
            count += 1
        elif s[i] == '0':
            l.append(count)
            count = 0
        if (i == len(s) - 1):
            l.append(count)
    l.sort(reverse = True)
    Alice_Score = 0
    Bob_Score = 0
    for i in range(len(l)):
        if (i %2 == 0):
            Alice_Score += l[i]
        else:
            Bob_Score += l[i]
    if (Alice_Score > Bob_Score):
        print(Alice_Score)
    else:
        print(Bob_Score)

