def find_pairs(arr, sum):
    pairs = []
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            if arr[i] + arr[j] == sum:
                pairs.append((arr[i], arr[j]))
    return pairs

sum = int(input())
n = int(input())
arr = list(map(int, input().split()))

pairs = find_pairs(arr, sum)

if not pairs:
    print("No pairs found.")
else:
    print("Number of pairs found: ", len(pairs))
    for pair in pairs:
        print(pair[0], "+", pair[1], "=", sum)