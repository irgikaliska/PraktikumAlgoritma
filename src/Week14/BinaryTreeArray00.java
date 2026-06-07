package Week14;

public class BinaryTreeArray00 {
    Student00[] data;
    int idxLast;
    public BinaryTreeArray00(){
        data = new Student00[10];
        idxLast = -1;
    }
    void populateData(Student00[] data, int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(data[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void add(Student00 data) {
        int idx = 0;
        while (true) {
            if (this.data[idx] == null) {
                this.data[idx] = data;
                if (idx > idxLast) idxLast = idx;
                break;
            }
            if (data.ipk < this.data[idx].ipk) {
                idx = 2 * idx + 1;
            } else if (data.ipk > this.data[idx].ipk) {
                idx = 2 * idx + 2;
            } else {
                break; // duplicate, ignore
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}

