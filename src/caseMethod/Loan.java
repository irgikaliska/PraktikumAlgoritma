package caseMethod;

public class Loan {
    Student std;
    Book book;
    int loanDuration;
    int loanLimit = 5;
    int fine;
    int late;

    Loan(Student std, Book book, int loanDuration){
        this.std = std;
        this.book = book;
        this.loanDuration = loanDuration;
    }

    public void calculateFine(){
        late = loanDuration - loanLimit;
        if (late > 0){
            fine = late * 2000;
        }
        else {
            fine = 0;
            late = 0;
        }
    }

    public void showLoan(){
        System.out.println(std.name + " | " + book.title + " | " + loanDuration + " days | Late: " + late + " | Fine: " + fine);
    }
}
