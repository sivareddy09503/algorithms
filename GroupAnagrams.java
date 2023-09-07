class GroupAnagrams {
    //Group Anagrams
    //Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    //TC:O(n^2logn), SC:O(n^2)
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word: strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!map.containsKey(str))
                map.put(str, new ArrayList<>());
            map.get(str).add(word);
        }
        return new ArrayList(map.values());
    }
}