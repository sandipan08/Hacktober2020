def Com(n):
    if n<=45:
        Com(Com(Com(n*5+1)))
    return n*2
res=Com(22)
print(res)    