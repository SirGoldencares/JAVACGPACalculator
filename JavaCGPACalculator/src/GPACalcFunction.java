public class GPACalcFunction {
    public double averageFunction(CourseInformation[] data) {
        double totalGradePoint = 0;
        double totalGradeUnit = 0;

        for (CourseInformation course: data) {
            totalGradePoint += course.getGradeUnit() * course.getCourseUnit();
            totalGradeUnit += course.getCourseUnit();
        }
        return totalGradePoint / totalGradeUnit;
    }
}
