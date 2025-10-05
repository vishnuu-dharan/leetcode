class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        a = 0
        for word in words:
            if all(word.count(c) <= chars.count(c) for c in word):
                a += len(word)
        return a

        