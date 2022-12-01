from hamcrest.core.base_matcher import BaseMatcher


class OnlyDigits(BaseMatcher):

    def _matches(self, txt):
        return txt.isdigit()

    def describe_to(self, description):
        description.append_text("Checks if digit")


def onlyDigits():
    return OnlyDigits()
