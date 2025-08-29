class Solution:
    @staticmethod
    def bear(a, b):
        i = 0
        while a <= b:
            a *= 3
            b *= 2
            i += 1
        return i

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(Solution.bear(a, b))
