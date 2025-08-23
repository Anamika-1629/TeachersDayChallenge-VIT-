class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        l = len(s)
        stack = []
        
        for i in range(l):
            if s[i] in "({[":
                stack.append(s[i])
            else:
                if not stack:
                    return False
                if s[i] == ")" and stack[-1] != "(":
                    return False
                if s[i] == "}" and stack[-1] != "{":
                    return False
                if s[i] == "]" and stack[-1] != "[":
                    return False
                stack.pop()

        return len(stack) == 0

def main():
    solution = Solution()
    test_cases = [
        "()[]{}",    
        "(]",        
        "([)]",      
        "{[]}",      
        "",          
        "[({})]"     
    ]

    for s in test_cases:
        result = solution.isValid(s)
        print(f"Input: {s} -> Is valid? {result}")

if __name__ == "__main__":
    main()
