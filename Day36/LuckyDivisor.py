class Solution:
    @staticmethod
    def luckyno(num):
        temp = str(num)
        for i in range(len(temp)):
            if temp[i] != '4' and temp[i] != '7':
                return False
        return True

    @staticmethod
    def luckyDivisor(n):
        for i in range(1, n + 1):
            if Solution.luckyno(i) and n % i == 0:
                return "YES"
        return "NO"


def main():
    n = int(input())
    print(Solution.luckyDivisor(n))


if __name__ == "__main__":
    main()
