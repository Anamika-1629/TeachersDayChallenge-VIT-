class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        l = []
        for i in range(1, n + 1):
            if (i % 3 == 0) and (i % 5 == 0):
                l.append("FizzBuzz")
            elif i % 3 == 0:
                l.append("Fizz")
            elif i % 5 == 0:
                l.append("Buzz")
            else:
                l.append(str(i))
        return l

def main():
    sol = Solution()
    
    n = 15
    result = sol.fizzBuzz(n)
    print(f"FizzBuzz results for n = {n}:")
    print(result)

if __name__ == "__main__":
    main()
