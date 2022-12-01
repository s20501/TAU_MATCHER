from assertpy import *
import unittest

from classes.Calculator import Calculator


class CalculatorTests(unittest.TestCase):

    def setUp(self):
        self.temp = Calculator(23.0, 14.4)

    def test_float(self):
        assert_that(self.temp.addition()).is_type_of(float)

    def test_negative(self):
        self.temp = Calculator(23.0, 300.4)
        assert_that(self.temp.subtraction()).is_negative().is_not_zero()

    def test_positive(self):
        assert_that(self.temp.multiply()).is_positive()

    def test_zero(self):
        self.temp = Calculator(23.0, 23.0)
        assert_that(self.temp.subtraction()).is_zero()

    def test_multiply(self):
        assert_that(self.temp.multiply()).is_greater_than_or_equal_to(331.2)

    def test_error_msg(self):
        self.temp = Calculator(23.0, 0)
        try:
            self.temp.division()
            fail('should have raised Exception')
        except Exception as e:
            assert_that(str(e)).is_equal_to('Invalid data!')

    def tearDown(self):
        self.temp = None  # add assertion here


if __name__ == '__main__':
    unittest.main()
