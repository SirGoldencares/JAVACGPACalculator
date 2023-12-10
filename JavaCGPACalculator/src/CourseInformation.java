public class CourseInformation {
    private String courseCode;
    private int courseUnit;
    private int courseScore;
    private String grade;
    private int gradeUnit;

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;

        if (this.courseScore >= 70) {
            this.grade = "A";
            this.gradeUnit = 5;
        }
        else if (this.courseScore >= 60) {
            this.grade = "B";
            this.gradeUnit = 4;
        }
        else if (this.courseScore >= 50) {
            this.grade = "C";
            this.gradeUnit = 3;
        }
        else if (this.courseScore >= 45) {
            this.grade = "D";
            this.gradeUnit = 2;
        }
        else if (this.courseScore >= 40) {
            this.grade = "E";
            this.gradeUnit = 1;
        }
        else {
            this.grade = "F";
            this.gradeUnit = 0;
        }
    }
    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }

    public int getCourseUnit() {
        return this.courseUnit;
    }
    public String getGrade() {
        return this.grade;
    }

    public int getGradeUnit() {
        return this.gradeUnit;
    }
}
