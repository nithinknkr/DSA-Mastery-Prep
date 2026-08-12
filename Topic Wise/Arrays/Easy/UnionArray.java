import java.util.ArrayList;

public class UnionArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && nums2[j] == nums2[j - 1]) {
                j++;
                continue;
            }

            if (nums1[i] == nums2[j]) {
                lst.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                lst.add(nums1[i]);
                i++;
            } else {
                lst.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }
            if (lst.isEmpty() || lst.get(lst.size() - 1) != nums1[i]) {
                lst.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (j > 0 && nums2[j] == nums2[j - 1]) {
                j++;
                continue;
            }
            if (lst.isEmpty() || lst.get(lst.size() - 1) != nums2[j]) {
                lst.add(nums2[j]);
            }
            j++;
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
    
}
