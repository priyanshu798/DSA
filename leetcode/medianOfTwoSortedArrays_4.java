package com.priyanshu;

public class medianOfTwoSortedArrays_4 {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
if ( nums1.length > nums2.length) {
    return findMedianSortedArrays(nums2, nums1);
}
        int start = 0;
        int end = nums1.length;
        while (start <= end) {
            int positionX = start + (end - start) / 2;
            int positionY = (nums1.length + nums2.length + 1) / 2 - positionX;
            int XLMax;
            if (positionX == 0) {
                XLMax = Integer.MIN_VALUE;
            } else {
                XLMax = nums1[positionX - 1];
            }

            int XRMin;
            if (positionX == nums1.length) {
                XRMin = Integer.MAX_VALUE;
            } else {
                XRMin = nums1[positionX];
            }
            int YLMax;
            if (positionY == 0) {
                YLMax = Integer.MIN_VALUE;
            } else {
                YLMax = nums2[positionY - 1];
            }
            int YRMin;
            if (positionY == nums2.length) {
                YRMin = Integer.MAX_VALUE;
            } else {
                YRMin = nums2[positionY];
            }


            if (XLMax <= YRMin && YLMax <= XRMin) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return ((double)(Integer.max(XLMax, YLMax) + Integer.min(XRMin, YRMin)) / 2);
                } else {
                    return Integer.max(XLMax, YLMax);
                }
            } else if (XLMax > YRMin) {
                end = positionX - 1;
            } else if (YLMax > XRMin) {
                start = positionX + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums1 = {23,26,31,35};
        int [] nums2 = {3,5,7,9,11,16};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}
