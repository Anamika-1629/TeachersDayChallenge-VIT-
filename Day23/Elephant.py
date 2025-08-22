class Solution:
    @staticmethod
    def steps(x):
        step = x // 5
        if x % 5 != 0:
            step += 1
        return step

if __name__ == "__main__":
    x = int(input())
    print(Solution.steps(x))
