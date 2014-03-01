'''
The hyperexponentiation of a number
Problem 188
The hyperexponentiation or tetration of a number a by a positive integer b,
denoted by a↑↑b or ba, is recursively defined by:

a↑↑1 = a,
a↑↑(k+1) = a(a↑↑k).

Thus we have e.g. 3↑↑2 = 33 = 27, hence 3↑↑3 = 327 = 7625597484987 and 3↑↑4 is
roughly 103.6383346400240996*10^12.

Find the last 8 digits of 1777↑↑1855.
'''

__date__ = '14-3-1'
__author__ = 'SUN'

def exp_mod(a, x, mod):
    if x == 0 or x == 1:
        return a ** x % mod
    elif x % 2 == 0:
        return exp_mod(a, x // 2, mod) ** 2 % mod
    else:
        return a * exp_mod(a, x // 2, mod) ** 2 % mod

if __name__ == '__main__':
    res = 1
    for i in range(1855):
        res = exp_mod(1777, res, 10 ** 8)
    print(res)