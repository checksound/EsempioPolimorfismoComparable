package it.esempiosorter.custom;

public class SorterComparator {
	
	public static void sort(Object[] a, 
            boolean up, Comparator comparator) {
		sort(a, 0, a.length -1, up, comparator);
	}
	
	private static void sort(Object[] a, 
            int from, int to, 
            boolean up, Comparator comparator) {
		
		// If there is nothing to sort, return
	    if ((a == null) || (a.length < 2)) return;
	    
	    // This is the basic quicksort algorithm, stripped of frills that can make
	    // it faster but even more confusing than it already is.  You should
	    // understand what the code does, but don't have to understand just 
	    // why it is guaranteed to sort the array...
	    // Note the use of the compare() method of the Comparer object.
	    int i = from, j = to;
	    Object center = a[(from + to) / 2];
	    do {
	      if (up) {  // an ascending sort
	        while((i < to) && comparator.compare(center, a[i]) > 0) i++;
	        while((j > from) && comparator.compare(center, a[j]) < 0) j--;
	      } else {   // a descending sort
	        while((i < to) && comparator.compare(center, a[i]) < 0) i++;
	        while((j > from) && comparator.compare(center, a[j]) > 0) j--;
	      }
	      if (i < j) { 
	    	  Object tmp = a[i];  a[i] = a[j];  a[j] = tmp;          // swap elements
	       
	      }
	      if (i <= j) { i++; j--; }
	    } while(i <= j);
	    if (from < j) sort(a, from, j, up, comparator); // recursively sort the rest
	    if (i < to) sort(a, i, to, up, comparator);
		
	}
}
