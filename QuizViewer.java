class QuizViewer {
    
    public static int count;
    
    public static void showQuiz(Quiz quiz) {
        // クラス名.メソッド名で呼び出しできる（QuizViewer.showQuiz();)
        count++;
        System.out.println("<第" + count + "問>");
        quiz.displayHeader();
        quiz.displayMain();
        System.out.println();
    }
}