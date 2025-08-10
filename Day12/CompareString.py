class Solution:
    def compare(a,b):
        t1 = a.lower()
        t2 = b.lower()

        if (t1 < t2):
            return -1
        elif (t1 > t2):
            return 1
        else:
            return 0

def main():
    a = input().strip()
    b = input().strip()
    result = Solution.compare(a, b)
    print(result)


if __name__ == "__main__":
    main()
