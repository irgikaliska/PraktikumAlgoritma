package Jobsheet16;

public class Grade {
    Course course;
    double score;
    String letterGrade;

    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
        this.letterGrade = convertToLetter(score);
    }

    private String convertToLetter(double score) {
        if (score >= 85) return "A";
        else if (score >= 75) return "B";
        else if (score >= 65) return "C";
        else if (score >= 55) return "D";
        else return "E";
    }

    public Course getCourse() { return course; }
    public double getScore() { return score; }
    public String getLetterGrade() { return letterGrade; }

    @Override
    public String toString() {
        return String.format("%-30s | %5.1f | %s",
                course.getName(), score, letterGrade);
    }
}
