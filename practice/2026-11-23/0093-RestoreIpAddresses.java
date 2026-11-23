import java.util.ArrayList;
import java.util.List;

/** LeetCode 93: Restore IP Addresses.
 * Enumerate four 1-3 digit octets; no leading zeros in multi-digit octets.
 * At most 3^4 choices; auxiliary search depth is fixed at four.
 */
class RestoreIpAddresses {
    static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) return result;
        search(s, 0, 0, new String[4], result);
        return result;
    }
    private static void search(String s, int index, int part, String[] octets,
                               List<String> result) {
        int remaining = s.length() - index, partsLeft = 4 - part;
        if (remaining < partsLeft || remaining > partsLeft * 3) return;
        if (part == 4) {
            if (index == s.length()) result.add(String.join(".", octets));
            return;
        }
        int value = 0;
        for (int length = 1; length <= 3 && index + length <= s.length(); length++) {
            if (length > 1 && s.charAt(index) == '0') break;
            value = value * 10 + s.charAt(index + length - 1) - '0';
            if (value > 255) break;
            octets[part] = s.substring(index, index + length);
            search(s, index + length, part + 1, octets, result);
        }
    }
    private static void check(boolean ok) {
        if (!ok) throw new AssertionError("IPv4 restoration regression");
    }
    public static void main(String[] args) {
        check(restoreIpAddresses("25525511135").equals(
                List.of("255.255.11.135", "255.255.111.35")));
        check(restoreIpAddresses("0000").equals(List.of("0.0.0.0")));
        check(restoreIpAddresses("101023").equals(List.of(
                "1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3")));
        check(restoreIpAddresses("123").isEmpty());
        check(restoreIpAddresses("999999999999").isEmpty());
        System.out.println("PASS");
    }
}
