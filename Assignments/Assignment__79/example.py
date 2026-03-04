"""We add the following 3 (Key.Value) pairs to our map so it looks like this:
phone Book = {(sam, 99912222), (tom, 11122222), (harry, 12299933)}
We then process each query and print key value if the queried key is found in the map; otherwise, we print Not found.
Query 0: sam
Sam is one of the keys in our dictionary, so we print sam-99912222.
Query 1: edward
Edward is not one of the keys in our dictionary, so we print Not found.
Query 2: harry
Harry is one of the keys in our dictionary, so we print harry=12299933."""

n = int(input())

phoneBook = {}

for i in range(n):
    name = input()
    kv = name.split()

    key = kv[0]
    value = int(kv[1])

    phoneBook[key] = value

search = list()

for i in range(n):
    name = input()
    search.append(name)

for name in search:
    if name in phoneBook:
        print(name,"=",phoneBook[name])
    else:
        print(name,"= Not Found", )