class Solution:
    def round(l, k):
        count = 0
        for i in range(len(l)):
            if l[i] >= k:
                count += 1
        return count

def main():
    n, k = map(int, input().split())
    l = list(map(int, input().split()))
    
    result = Solution.round(l, k)
    print(result)

if __name__ == "__main__":
    main()
