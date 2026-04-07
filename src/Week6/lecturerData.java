package Week6;

public class lecturerData {
    Lecturer[] lecturerData;
    int idx;

    public lecturerData(int size) {
        lecturerData = new Lecturer[size];
        idx = 0;
    }

    public void add(Lecturer dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Lecturer temp = lecturerData[i];
            int j = i;
            while (j > 0 && lecturerData[j - 1].age < temp.age) {
                lecturerData[j] = lecturerData[j - 1];
                j--;
            }
            lecturerData[j] = temp;
        }
    }
}

