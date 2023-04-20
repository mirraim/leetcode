package org.mirraim;

import java.util.List;

public class FirstBadVersion278 {
    private List<Boolean> versions;

    public void setVersions(List<Boolean> versions) {
        this.versions = versions;
    }

    public int firstBadVersion(int n) {
        return recursion(1, n);
    }

    private int recursion(int begin, int end) {
        int med = begin + (end - begin) / 2;
        boolean isBad = isBadVersion(med);
        if (isBad) {
            if (med == 1 || !isBadVersion(med - 1)) {return med;}
            return recursion(begin, med - 1);
        }
        return recursion(med + 1, end);
    }

    private boolean isBadVersion(int n) {
        return versions.get(n - 1);
    }
}
