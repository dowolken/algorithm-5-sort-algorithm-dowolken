public class sort {
	public static void mergesort(int[] ints) {
		int start=0;
		int end= ints.length-1;
		mergesortp(ints,start,end);
	}
	public static void mergesortp(int[] ints, int ls, int re) {
		if(ls==re) {
			return;
		}
		int le=(re-ls)/2+ls;
		mergesortp(ints,ls,le);
		mergesortp(ints, le+1,re);
		merge(ints,ls,le,re);
	}
	
	public static void merge(int[] ints, int ls, int le, int re) {
		int[] temp= new int[re-ls+1];
		int l=ls;
		int r=le+1;
		int index=0;
		while(l<=le&&r<=re) {
			if(ints[l]<ints[r]) {
				temp[index]=ints[l];
				index++;
				l++;
			}
			else if(ints[l]>=ints[r]) {
				temp[index]=ints[r];
				index++;
				r++;
			}
		}
		while(l<=le) {
			temp[index]=ints[l];
			index++;
			l++;}
        while(r<=re) {
        	temp[index]=ints[r];
			index++;
			r++;}
        for(int i=0;i<temp.length;i++) {
        	ints[ls+i]=temp[i];
        	
        }
