package com.tom.d028ImplementStr;

public class SuperiorSolution {
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        int[] next = new int[needle.length()];
        // �õ�next����
        getNextArr(next, needle);
        // i��ƥ�䴮haystack��ָ�룬j��ģʽ��needle��ָ��
        int i = 0, j = 0;
        // ˫ָ�뿪ʼƥ��
        while(i < haystack.length() && j < needle.length()){
            // ���j=-1��ζ�Ÿո�ʧ������±�+1����һ�־Ϳ��Կ�ʼƥ����Եĵ�һ����
            // ���ָ�����ĸ��ͬ������һ��ƥ����Ե���һ��
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            // ���ʧ�䣬�򽫸���jΪnext[j]
            } else {
                j = next[j];
            }
        }
        return j == needle.length() ? i - j : -1;
    }
    
    private static void getNextArr(int[] next, String needle){
        // k��ǰ׺����ͬ���ֵ�ĩβ��ͬʱҲ����ͬ���ֵĳ��ȣ���Ϊ���ȵ���k-0��
        // j�Ǻ�׺��ĩβ������׺��ͬ���ֵ�ĩβ 
        int k = -1, j = 0;
        next[0] = -1;
        while(j < needle.length() - 1){
            // ���k=-1��˵���ո�ʧ���ˣ������¿�ʼ����ǰ׺�ͺ�׺��ͬ�ĳ���
            // ��������ַ���ȣ������ϴ�ǰ׺�ͺ�׺��ͬ�ĳ��ȼ�1������
            if (k == -1 || needle.charAt(j) == needle.charAt(k)){
                k++;
                j++;
                next[j] = k;
            } else {
            // ����ǰ׺��������Ϊnext[k]
                k = next[k];
            }
        }
    }
}

