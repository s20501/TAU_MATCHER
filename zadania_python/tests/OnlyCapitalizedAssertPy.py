def onlyCapital(self):
    if self.val != self.val.capitalize():
        return self.error('Not capitalized')
    return self
