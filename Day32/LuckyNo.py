class Solution:
    def luckyNo(n):
        temp = str(n)
        for i in range(len(temp)):
            if (temp[i] != '4' and temp[i] != '7'):
                return "NO"
        return "YES"

if __name__ == "__main__":
    n = int(input())
    print(Solution.luckyNo(n))