package binarysearch;

// Simulating LeetCode's VersionControl class
class VersionControl {
    int badVersion;

    VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

// Your solution extending VersionControl
public class bad extends VersionControl {

    bad(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;  // mid could be the first bad
            } else {
                left = mid + 1;  // mid is good
            }
        }

        return left; // first bad version
    }

    public static void main(String[] args) {
        // Suppose version 4 is the first bad version, and total versions = 5
        bad obj = new bad(4);

        int n = 5;
        System.out.println("First bad version: " + obj.firstBadVersion(n));
    }
}