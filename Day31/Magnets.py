class Solution:
    @staticmethod
    def magnets(n, arr):
        groups = 1  
        for i in range(n - 1):
            if arr[i] != arr[i + 1]:
                groups += 1
        return groups

if __name__ == "__main__":
    n = int(input())
    arr = [input().strip() for _ in range(n)]
    print(Solution.magnets(n, arr))
