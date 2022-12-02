def onlyLowercase(self):
    if self.val != self.val.casefold():
        return self.error('Not lowercase')
    return self
