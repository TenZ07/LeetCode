class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
		for(int i : arr)
			map.put(i, map.getOrDefault(i, 0)+1);
		for(int i : map.keySet())
			if(map.get(i)*100/arr.length>25)
				return i;
        return 21506;
    }
}