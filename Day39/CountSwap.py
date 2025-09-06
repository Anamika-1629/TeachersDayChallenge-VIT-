class Solution:
    def countSec(n,h):
        min_v, max_v = h[0]
        min_i, max_i = 0
        for i in range(1,n):
            if h[i] > max_v:
                max_v = h[i]
                max_i = i
        for j in range(n-1,-1,-1):
            if h[j] < min_v:
                min_v = h[j]
                min_i = j
        
        count = max_i + (n-1-min_i)
        if (min_i < max_i):
            count -= 1
        
        return count

def main():
    n = int(input())
    h = list(map(int, input().split()))
    print(Solution.countSec(n, h))


if __name__ == "__main__":
    main()