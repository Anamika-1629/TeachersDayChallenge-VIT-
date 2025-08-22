class Solution:
    def schoolqueue(s,t):
        q = list(s)
        l = len(q)

        for a in range(0,t):
            i = 0
            while (i < l-1):
                if (q[i] == "B" and q[i+1] == "G"):
                    q[i] = "G"
                    q[i+1] = "B"
                    i += 2
                else:
                    i += 1
        
        return "".join(q)

if __name__ == "__main__":
    n, t = map(int, input().split())
    s = input().strip()
    print(Solution.schoolqueue(s, t))

