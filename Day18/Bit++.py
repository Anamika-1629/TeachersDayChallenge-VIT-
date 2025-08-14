class Solution:
    def bit(l):
        x = 0
        for i in range(len(l)):
            if (l[i] == "++X") or (l[i] == "X++"):
                x += 1
            else:
                x -= 1
        return x

def main():
    n = int(input().strip())

    ops = []
    for _ in range(n):
        ops.append(input().strip())

    print(Solution.bit(ops))


if __name__ == "__main__":
    main()
