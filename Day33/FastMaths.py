class Solution:
    def maths(a,b):
        res = ''
        for i in range(len(a)):
            if (a[i] != b[i]):
                res += '1'
            else:
                res += '0'
        
        return res

def main():
    a = input().strip()
    b = input().strip()
    result = Solution.maths(a, b)
    print(result)

if __name__ == "__main__":
    main()