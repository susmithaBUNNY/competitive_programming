import unittest
def sort_scores(unsorted_scores, highest_possible_score):
    x={}
    for i in unsorted_scores:
        y=x.get(i,0)
        x[i]=y+1
    
    sort_s=[]
    for i in range(highest_possible_score+1):
        if i in x:
            z=[i]*x[i]
            sort_s.extend(z)
    
    sort_s.reverse()
    return sort_s





# Tests

class Test(unittest.TestCase):

    def test_no_scores(self):
        actual = sort_scores([], 100)
        expected = []
        self.assertEqual(actual, expected)

    def test_one_score(self):
        actual = sort_scores([55], 100)
        expected = [55]
        self.assertEqual(actual, expected)

    def test_two_scores(self):
        actual = sort_scores([30, 60], 100)
        expected = [60, 30]
        self.assertEqual(actual, expected)

    def test_many_scores(self):
        actual = sort_scores([37, 89, 41, 65, 91, 53], 100)
        expected = [91, 89, 65, 53, 41, 37]
        self.assertEqual(actual, expected)


unittest.main(verbosity=2)
