class Solution:
    @staticmethod
    def per(n, points):
        count = 0
        min_val = points[0]
        max_val = points[0]
        for i in range(1, n):  
            if points[i] > max_val:
                count += 1
                max_val = points[i]
            elif points[i] < min_val:
                count += 1
                min_val = points[i]
        return count

def main():
    n = int(input())
    points = list(map(int, input().split()))
    print(Solution.per(n, points))

if __name__ == "__main__":
    main()
