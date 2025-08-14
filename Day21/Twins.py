class Solution:
    def min_coins(n, coins):
        coins.sort(reverse=True)
        total = sum(coins)
        my_sum = 0
        count = 0

        for coin in coins:
            my_sum += coin
            count += 1
            if my_sum > total - my_sum:
                break
        return count


def main():
    n = int(input())
    coins = list(map(int, input().split()))
    print(Solution.min_coins(n, coins))  


if __name__ == "__main__":
    main()
