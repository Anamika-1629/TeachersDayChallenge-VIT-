class Solution:
    def max_ws(n, heights):
        res = 0
        for i in range(n):
            cnt = 1  

            j = i - 1
            while j >= 0 and heights[j] <= heights[j + 1]:
                cnt += 1
                j -= 1

            j = i + 1
            while j < n and heights[j] <= heights[j - 1]:
                cnt += 1
                j += 1
            res = max(res, cnt)
        return res

if __name__ == "__main__":
    n = int(input())
    heights = list(map(int, input().split()))
    print(Solution.max_ws(n, heights))
