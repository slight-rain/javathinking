package enumTest;
//使用enum实现多路分发
public enum RoShamBo {
    PAPER(Outcome.DRAW,Outcome.LOSE,Outcome.WIN),
    SCISSOR(Outcome.WIN,Outcome.DRAW,Outcome.LOSE),
    ROCK(Outcome.LOSE,Outcome.WIN,Outcome.DRAW);
    private Outcome vPaper,vScissor,vRock;
    RoShamBo(Outcome paper,Outcome scissor,Outcome rock){
        this.vPaper=paper;
        this.vScissor=scissor;
        this.vRock=rock;
    }
    public Outcome compete(RoShamBo item){
        switch(item){
            default:
            case ROCK :return vRock;
            case PAPER :return vPaper;
            case SCISSOR :return vScissor;
        }
    }
}
enum Outcome{WIN,LOSE,DRAW}
