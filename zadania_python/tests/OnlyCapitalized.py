from hamcrest.core.base_matcher import BaseMatcher


class OnlyCapitalized(BaseMatcher):

    def _matches(self, txt):
        return txt == txt.capitalize()

    def describe_to(self, description):
        description.append_text("Checks if capitalized")


def onlyCapital():
    return OnlyCapitalized()
