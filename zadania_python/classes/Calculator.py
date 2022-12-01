class Calculator:
    def __init__(self, a, b):
        self.a = a
        self.b = b
        pass

    def addition(self) -> float:
        return self.a + self.b

    def multiply(self) -> float:
        return self.a * self.b

    def subtraction(self) -> float:
        return self.a - self.b

    def division(self) -> float:
        if self.b == 0:
            raise Exception("Invalid data!")

        return self.a / self.b
