class Solution:
    @staticmethod
    def nextPrime(n, m):
        if not Solution.isPrime(m):
            return "NO"
        for i in range(n + 1, m):
            if Solution.isPrime(i):
                return "NO"
        return "YES"

    @staticmethod
    def isPrime(num):
        if num <= 1:
            return False
        elif num == 2 or num == 3:
            return True
        else:
            if num % 2 == 0 or num % 3 == 0:
                return False
            i = 5
            while i * i <= num:
                if num % i == 0 or num % (i + 2) == 0:
                    return False
                i += 6
            return True


def main():
    n, m = map(int, input().split())
    print(Solution.nextPrime(n, m))


if __name__ == "__main__":
    main()
