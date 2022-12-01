class Panagram:
    def __init__(self, __alphabet):
        self.__alphabet = __alphabet

    def __check_one(self, text: str):

        if not isinstance(text, str):
            raise Exception("Invalid data!")

        for char in self.__alphabet:
            if char not in text.lower():
                return False

        return True

    def check(self, texts: list):
        return list(map(lambda x: self.__check_one(x), texts))