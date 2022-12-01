from hamcrest import *
import unittest

from classes.Panagram import Panagram


class PanagramTest(unittest.TestCase):

    def setUp(self):
        self.temp = Panagram("abcdefghijklmnopqrstuvwxyz")

    def test_single_pangram(self):
        assert_that(self.temp.check(["The quick brown fox jumps over the lazy dog"]), equal_to([True]))

    def test_single_length(self):
        assert_that(self.temp.check(["The quick brown fox jumps over the lazy dog"]), has_length(1))

    def test_few_pangrams(self):
        assert_that(self.temp.check(
            ["The quick brown fox jumps over the lazy dog", "Pack my box with five dozen liquor jugs",
             "The five boxing wizards jump quickly"]), contains_exactly(True, True, True))

    def test_few_not_pangrams(self):
        assert_that(self.temp.check(
            ["Thexxxx", "Packxxxor jugs",
             "The fixxp quickly"]), contains_inanyorder(False, False, False))

    def test_panagrams_and_not_panagrams_mixed(self):
        assert_that(self.temp.check(
            ["The quick brown fox jumps over the lazy dog", "Pack mysdfsdfsd", "The five boxing wizards jump quickly"]),
            has_item(False))

    def test_no_data(self):
        assert_that(self.temp.check([]), empty())

    def test_wrong_data(self):
        assert_that(calling(self.temp.check).with_args([123213123]), raises(Exception))

    def tearDown(self):
        self.temp = None  # add assertion here


if __name__ == '__main__':
    unittest.main()
