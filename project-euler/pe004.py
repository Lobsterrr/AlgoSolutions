import time

__author__ = 'SUN'

'''
A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
'''

def find_max_palindrome(min, max):
    max_palindrome = 0
    i = 999
    while i > 99:
        j = 999
        while j >= i:
            product = i * j
            if product > max_palindrome and str(product) == str(product)[::-1]:
                max_palindrome = product
            j -= 1
        i -= 1
    return max_palindrome

if __name__ == '__main__':
    start = time.clock()
    print(find_max_palindrome(100, 999))
    print('Runtime is', time.clock() - start)