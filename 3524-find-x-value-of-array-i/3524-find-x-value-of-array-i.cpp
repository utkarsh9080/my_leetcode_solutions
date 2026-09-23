class Solution {
public:
    vector<long long> resultArray(vector<int>& nums, int k) {
        int n = nums.size();
        //i HATE this
        vector<long long> result(k, 0);
        vector<long long> prevcount(k, 0);
        for (int i = 0; i < n; i++) {
            // index i par end hone waale saare subarrays
            vector<long long> currcount(k, 0);

            int currElementRemainder = nums[i] % k;
            currcount[currElementRemainder]++;

            for (int oldRem = 0; oldRem <= k - 1; oldRem++) {
                // naya rem nikalna by taking the previous remainders value
                int newRem = ((long long)oldRem * nums[i] % k) % k;

                currcount[newRem] += prevcount[oldRem];
            }

            prevcount = move(currcount);
            // std::move to not copy the thing in stack continuesly
            for (int x = 0; x <= k - 1; x++) {
                result[x] += prevcount[x];
            }
        }
        return result;
    }
};