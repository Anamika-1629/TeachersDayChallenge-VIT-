class Solution:
    def HQ9plus(p):
        for i in range(len(p)):
            if (p[i] == 'H' or p[i] == 'Q' or p[i] == '9'):
                return "YES"
        
        return "NO"

def main():
    p = input()
    print(Solution.HQ9plus(p))

if __name__ == "__main__":
    main()