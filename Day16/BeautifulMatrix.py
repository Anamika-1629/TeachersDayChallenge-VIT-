class Solution:
    def position(self, arr):
        for i in range(len(arr)):
            for j in range(len(arr[i])):
                if arr[i][j] == 1:
                    return abs(i - 2) + abs(j - 2)
        return -1 


def main():
    matrix = [list(map(int, input().split())) for _ in range(5)]
    sol = Solution()
    distance = sol.position(matrix)
    print(distance)


if __name__ == "__main__":
    main()
