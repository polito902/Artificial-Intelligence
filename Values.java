public class Values{
    public int ValueLeft;
    public int ValueRight;
    public int ValueUp;
    public int ValueDown;
    
    public GetValues(int X, int Y){
        ValueLeft=board(X-1, Y);
        ValueRight=board(X+1, Y);
        ValueUp=board(X, Y-1);
        ValueDown=board(X, Y+1);
        return new ValueLeft, ValueRight, ValueUp, ValueDown;
    }
}
    
    