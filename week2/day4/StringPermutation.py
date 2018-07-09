import unittest


def get_permutations(string):

    # Generate all permutations of the input string
    
    if len(string) <= 1:
        return set([string])
    a=string[:-1]
    rec=string[-1]
    x=get_permutations(a)
    permutations=set()
    for i in x:
        for j in range(len(a) + 1):
            permutation=(i[:j]+rec+i[j:])
            permutations.add(permutation)
    return permutations
    
    # return set()







# Tests

class Test(unittest.TestCase):

    def test_empty_string(self):
        actual = get_permutations('')
        expected = set([''])
        self.assertEqual(actual, expected)

    def test_one_character_string(self):
        actual = get_permutations('a')
        expected = set(['a'])
        self.assertEqual(actual, expected)

    def test_two_character_string(self):
        actual = get_permutations('ab')
        expected = set(['ab', 'ba'])
        self.assertEqual(actual, expected)

    def test_three_character_string(self):
        actual = get_permutations('abc')
        expected = set(['abc', 'acb', 'bac', 'bca', 'cab', 'cba'])
        self.assertEqual(actual, expected)


unittest.main(verbosity=2)
