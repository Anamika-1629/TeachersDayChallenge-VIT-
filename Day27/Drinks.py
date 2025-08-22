class Solution:
    def drinks(n, percentages):
        return sum(percentages) / n

if __name__ == "__main__":
    n = int(input())
    percentages = list(map(int, input().split()))
    print(Solution.drinks(n, percentages))
