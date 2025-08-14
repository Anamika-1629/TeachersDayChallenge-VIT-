class Solution:
    def translate(s, t):
        temp = t[::-1]
        if s == temp:
            return "YES"
        else:
            return "NO"

def main():
    s = input().strip()
    t = input().strip()
    print(Solution.translate(s, t))

if __name__ == "__main__":
    main()
