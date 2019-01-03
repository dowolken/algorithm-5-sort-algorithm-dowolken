public class SortAlgorithm{
  
    public void bubblesort(int[] a){
         {int large=0;
          int b=a.length;
          while(b!==0)
          {for(int i=0;i<a.length-1;i++)
              {if(a[i]>a[i+1])
                 {large=a[i];
                  a[i]=a[i+1];
                  a[i+1]=top;}
              }
           b--;} 
}
       public void bubblesort(int[] a){
         {int large=0;
          int b=a.length;
          while(b!==0)
          {for(int i=0;i<a.length-1;i++)
              {if(a[i]>a[i+1])
                 {large=a[i];
                  a[i]=a[i+1];
                  a[i+1]=top;}
              }
           b--;} 
          
          package cs;
public class sort {
	public static void mergesort(int[] ints, int ls, int re) {
		if(ls==re) {
			return;
		}
		int le=(re-ls)/2+ls;
		mergesort(ints,ls,le);
		mergesort(ints, le+1,re);
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
	}
	
	public static void print(int[] a){
	for(int e:a)
	    System.out.println(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l= {-2,3,1,5};
		merge(l,0,1,3);
		print(l);

	}

}

}

