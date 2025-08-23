class Solution:
    def div(w):
        if w > 2 and w % 2 == 0:
            return "YES"
        else:
            return "NO"

def main():
    w = int(input())
    print(Solution.div(w))

if __name__ == "__main__":
    main()
