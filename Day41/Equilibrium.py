class Solution:
    @staticmethod
    def equi(n, arr):
        sumX, sumY, sumZ = 0, 0, 0
        for x in range(n):
            sumX += arr[x][0]
            sumY += arr[x][1]
            sumZ += arr[x][2]

        if sumX == 0 and sumY == 0 and sumZ == 0:
            return "YES"
        else:
            return "NO"


def main():
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    print(Solution.equi(n, arr))


if __name__ == "__main__":
    main()
