class LongConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length == 1)
        {
            return 1;
        }

        HashSet <Integer> hs = new HashSet<>();

        int max = 1;
        int count = 1;

        for(int x : nums)
        {
            hs.add(x);
        }

        for(int x : hs)
        {
            if(!(hs.contains(x-1)))
            {
                int i = 1;
                while(hs.contains(x+i))
                {
                    count++;
                    i++;
                }

                max = Math.max(max,count);
                count = 1;
            }
        }

        return max;
    }
}
