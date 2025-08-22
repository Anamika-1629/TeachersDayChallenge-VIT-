class Solution:
    @staticmethod
    def borrow(k, n, w):
        cost = k * (w * (w + 1) // 2)  
        b = cost - n
        if b < 0:
            b = 0
        return b

if __name__ == "__main__":
    k, n, w = map(int, input().split())
    print(Solution.borrow(k, n, w))