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

def largest_product_palindrome(start, end):
    result = 0
    for i in range(end, start, -1):
        for j in range(end, i, -1):
            product = i * j
            if product > result and str(product) == str(product)[::-1]:
                result = product
    return result

if __name__ == '__main__':
    start = time.clock()
    print(find_max_palindrome(100, 999))
    print(largest_product_palindrome(100, 999))
    print('Runtime is', time.clock() - start)