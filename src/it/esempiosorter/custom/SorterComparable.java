package it.esempiosorter.custom;

public class SorterComparable {
	
	public static void sort(Comparable[] a, 
            boolean up) {
		sort(a, 0, a.length -1, up);
	}

	private static void sort(Comparable[] a, 
            int from, int to, 
            boolean up) {
		
		// If there is nothing to sort, return
	    if ((a == null) || (a.length < 2)) return;
	    
	    // This is the basic quicksort algorithm, stripped of frills that can make
	    // it faster but even more confusing than it already is.  You should
	    // understand what the code does, but don't have to understand just 
	    // why it is guaranteed to sort the array...
	    // Note the use of the compare() method of the Comparer object.
	    int i = from, j = to;
	    Comparable center = a[(from + to) / 2];
	    do {
	      if (up) {  // an ascending sort
	        while((i < to) && center.compareTo(a[i]) > 0) i++;
	        while((j > from) && center.compareTo(a[j]) < 0) j--;
	      } else {   // a descending sort
	        while((i < to) && center.compareTo(a[i]) < 0) i++;
	        while((j > from) && center.compareTo(a[j]) > 0) j--;
	      }
	      if (i < j) { 
	    	  Comparable tmp = a[i];  a[i] = a[j];  a[j] = tmp;          // swap elements
	       
	      }
	      if (i <= j) { i++; j--; }
	    } while(i <= j);
	    if (from < j) sort(a, from, j, up); // recursively sort the rest
	    if (i < to) sort(a, i, to, up);
		
	}
}
