import sys
input = sys.stdin.readline

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(x, y):
    x_root = find(x)
    y_root = find(y)

    if x_root != y_root:
        parent[y_root] = x_root
        size[x_root] += size[y_root]

    return size[x_root]

T = int(input())

for _ in range(T):
    F = int(input())
    name_to_id = dict()
    parent = []
    size = []
    next_id = 0

    for _ in range(F):
        a, b = input().strip().split()

        for person in [a, b]:
            if person not in name_to_id:
                name_to_id[person] = next_id
                parent.append(next_id)
                size.append(1)
                next_id += 1

        result = union(name_to_id[a], name_to_id[b])
        print(result)
