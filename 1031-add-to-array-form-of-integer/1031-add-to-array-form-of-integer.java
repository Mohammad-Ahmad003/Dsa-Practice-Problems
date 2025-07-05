class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + (k % 10) + carry;
            k /= 10;
            al.add(sum % 10);
            carry = sum / 10;
        }

        while (k > 0 || carry > 0) {
            int sum = (k % 10) + carry;
            al.add(sum % 10);
            carry = sum / 10;
            k /= 10;
        }

        Collections.reverse(al);
        return al;
    }
}
