public class SortingContext {
    
    private SortingStrategy ref;

    
    public SortingContext(SortingStrategy ref) {
        this.ref = ref;
    }
    
    public void setRef(SortingStrategy ref) {
        this.ref = ref;
    }
    
    public void performSort(int[] arr) {

        ref.sort(arr);
    }
    
}
