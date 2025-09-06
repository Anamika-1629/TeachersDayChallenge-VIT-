class Presents:
    def __init__(self, n, p):
        self.n = n
        self.p = p
 
    def find_givers(self):
        result = [0] * self.n
        for i in range(1, self.n + 1):
            for j in range(1, self.n + 1):
                if self.p[j - 1] == i:
                    result[i - 1] = j
                    break
        return result
 
if __name__ == "__main__":
    n = int(input())
    p = list(map(int, input().split()))
    presents = Presents(n, p)
    result = presents.find_givers()
    print(' '.join(map(str, result)))