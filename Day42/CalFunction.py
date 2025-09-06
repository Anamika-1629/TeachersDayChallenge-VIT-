class Solution:
    @staticmethod
    def cal(n: int) -> int:
        if n % 2 == 0:
            return n // 2
        else:
            return -((n + 1) // 2)


def main():
    n = int(input())
    print(Solution.cal(n))


if __name__ == "__main__":
    main()
