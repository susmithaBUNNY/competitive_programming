def my_function(arg):

    a=arg
    count=0
    c=14
    b=0
    while(b<a):
            x=b
            b=b+c
            c=c-1
            count=count+1
    if(a==b):
        return count
    count=count+(a-x)
    return count

for i in range(1,100):
    print(my_function(i))
