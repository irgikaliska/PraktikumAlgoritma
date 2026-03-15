package Week5;

public class Assignment {
    String name;
    int id;
    int year;
    int midScore;
    int finalScore;

    public Assignment(){

    }

    public Assignment(String name, int id, int year, int midScore, int finalScore){
        this.name = name;
        this.id = id;
        this.year = year;
        this.midScore = midScore;
        this.finalScore = finalScore;
    }

    int findHighestDC(Assignment[] arr, int l, int r){
        if(l == r){
            return arr[l].midScore;
        }
        int mid = (l + r) / 2;
        int lMax = findHighestDC(arr, l, mid);
        int rMax = findHighestDC(arr, mid + 1, r);

        return Math.max(lMax, rMax);
//        if(lMax < rMax){
//            return rMax;
//        } else {
//            return lMax;
//        }
    }

    int findLowestDC(Assignment[] arr, int l, int r){
        if(l == r){
            return arr[l].midScore;
        }
        int mid = (l + r) / 2;
        int lMin = findLowestDC(arr, l, mid);
        int rMin = findLowestDC(arr, mid + 1, r);


        return Math.min(lMin, rMin);
//        if(lMin > rMin){
//            return rMin;
//        } else {
//            return lMin;
//        }
    }

    double averageFinalScore(Assignment[] arr){
        double total = 0;
        for (Assignment array : arr) {
            total += array.finalScore;
        }
        return total / arr.length;
    }


}
