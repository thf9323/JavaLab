package heap;

public class heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void heapSort(int[] array) {
		     for (int i = (array.length - 2) / 2; i >= 0; i--)
		          heapify( array , i , array.length - 1 );

		     for (int i = array.length - 1; i > 0; i--) {
		          swapKeys( array , 0 , i );
		          heapify(array , 0 , i - 1 );
		     }
		}
		private void heapify(int[] array, int i, int m) {
		     int j;
		     while ( 2 * i + 1 <= m ) {
		          j = 2 * i + 1;
		          if ( j < m ) {
		               if ( array[ j ] < array[ j + 1 ] )
		                    j++;
		          }
		          if (array[ i ] < array[ j ]) {
		               swapKeys( array , i , j );
		               i = j;
		          } else
		               i = m;
		     }
		}

		public void swapKeys(int[] array, int i, int j) {
		     int temp;
		     temp = array[ i ];
		     array[ i ] = array[ j ];
		     array[ j ] = temp;
		} 

	}

}
