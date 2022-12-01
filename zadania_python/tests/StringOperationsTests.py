from hamcrest import *
import unittest

from classes.StringOperations import StringOperations
from tests.OnlyDigits import onlyDigits
from tests.OnlyCapitalized import onlyCapital


class StringOperationsTests(unittest.TestCase):

    def setUp(self):
        self.temp = StringOperations()

    def test_only_digit_test_contact(self):
        assert_that(self.temp.contact("12", "34"), is_(onlyDigits()))

    def test_only_digit_test_reverse(self):
        assert_that(self.temp.reverse("1223213"), is_(onlyDigits()))

    def test_only_capitalized_test_contact(self):
        assert_that(self.temp.contact("Test ", "duży"), is_(onlyCapital()))

    def test_only_capitalized_test_reverse(self):
        assert_that(self.temp.reverse("yżud tseT"), is_(onlyCapital()))

    def tearDown(self):
        self.temp = None  # add assertion here


if __name__ == '__main__':
    unittest.main()
