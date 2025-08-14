class Solution:
    def domino(m,n):
        if (m*n)%2 == 0:
            return (m*n)//2
        else:
            return ((m*n)-1)//2
    
def main():
    m, n = map(int, input().split())  
    print(Solution.domino(m, n))      

if __name__ == "__main__":
    main()