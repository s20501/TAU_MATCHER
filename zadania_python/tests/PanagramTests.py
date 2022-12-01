from hamcrest import *
import unittest

from classes.Panagram import Panagram


class PanagramTest(unittest.TestCase):

    def setUp(self):
        self.temp = Panagram("abcdefghijklmnopqrstuvwxyz")

    def test_single_pangram(self):
        self.assertEqual([True], self.temp.check(["The quick brown fox jumps over the lazy dog"]))

    def test_single_not_pangram(self):
        self.assertEqual([False], self.temp.check(["Tsddmps over thedxog"]))

    def test_few_pangrams(self):
        self.assertEqual([True, True, True], self.temp.check(
            ["The quick brown fox jumps over the lazy dog", "Pack my box with five dozen liquor jugs",
             "The five boxing wizards jump quickly"]))

    def test_few_not_pangrams(self):
        self.assertEqual([False, False, False], self.temp.check(
            ["Thexxxx", "Packxxxor jugs",
             "The fixxp quickly"]))

    def test_panagrams_and_not_panagrams_mixed(self):
        self.assertEqual([True, False, True], self.temp.check(
            ["The quick brown fox jumps over the lazy dog", "Pack mysdfsdfsd", "The five boxing wizards jump quickly"]))

    def test_no_data(self):
        self.assertEqual([], self.temp.check([]))

    def test_wrong_data(self):
        self.assertRaises(Exception, self.temp.check, [123213123])

    def tearDown(self):
        self.temp = None# add assertion here


if __name__ == '__main__':
    unittest.main()
