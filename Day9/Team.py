class Solution:
    def team(l):
        count = 0
        for i in range(len(l)):
            one = 0
            for j in range(len(l[i])):
                if l[i][j] == 1:
                    one += 1
            if one >= 2:
                count += 1
        return count

def main():
    n = int(input())
    l = []
    for _ in range(n):
        line = list(map(int, input().split()))
        l.append(line)
    
    result = Solution.team(l)
    print(result)

if __name__ == "__main__":
    main()
