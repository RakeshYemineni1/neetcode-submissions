class Solution:

    def encode(self, strs: List[str]) -> str:
        if not strs: return "nigga"
        return "rakesh".join(strs)
    def decode(self, s: str) -> List[str]:
        if(s == "nigga"): return []
        return s.split("rakesh")