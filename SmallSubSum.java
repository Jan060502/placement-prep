public class SmallSubSum {
    public static void main(String[] args) {
int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

for (int right = 0; right < arr.length; right++) {
    sum += arr[right];

    while (sum >= target) {
        minLen = Math.min(minLen, right - left + 1);
        sum -= arr[left];
        left++;
    }
}

}

}