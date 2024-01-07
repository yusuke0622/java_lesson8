class BlankQuiz extends Quiz {
    public int blankCount;
    
    public BlankQuiz (String main, int blankCount) {
        //親コンストラクト呼び出し
        super(main);
        this.blankCount = blankCount;
    }
    
    //オーバーライド
    public void displayHeader() {
        System.out.println("「次の文の空欄を埋めなさい」");
    }
    
    public void displayMain() {
        super.displayMain();
        for(int i = 0; i < blankCount; i++) {
            System.out.println((i + 1) + ".________________");
        }
    }
}