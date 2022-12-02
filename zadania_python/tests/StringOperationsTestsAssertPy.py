from assertpy import *
import unittest

from classes.StringOperations import StringOperations
from tests.OnlyCapitalizedAssertPy import onlyCapital
from tests.OnlyLowercase import onlyLowercase

add_extension(onlyCapital)
add_extension(onlyLowercase)


class StringOperationsTestsAssertPy(unittest.TestCase):

    def setUp(self):
        self.temp = StringOperations()

    def test_custom_capital(self):
        assert_that(self.temp.contact("Test ", "duży")).onlyCapital()

    def test_custom_onlyLowercase(self):
        assert_that(self.temp.contact("test ", "duży")).onlyLowercase()

    def tearDown(self):
        self.temp = None  # add assertion here


if __name__ == '__main__':
    unittest.main()
