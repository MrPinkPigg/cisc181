package cisc181.cp_2;

public class PlayerPiece extends GamePiece {
    private boolean special;
    private int row;
    private int col;

    public PlayerPiece(char symbol, boolean special, int row, int col) {
        super(symbol);
        this.special = special;
        this.row = row;
        this.col = col;
    }

    public char getPlayerSymbol() {
        return this.getSymbol();
    }

    public boolean getSpecial() {
        return this.special;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public void setRow(int row){ this.row = row; }
    public void setCol(int col){ this.col = col; }

    public void movePiece(int movement) {
        if(this.row == 1 && this.col == 4 || this.row == 1 && this.col == 5){
            if(movement == 1){
                this.setRow(0);
                this.setCol(5);
            }
            else if(movement == 2){
                this.setRow(0);
                this.setCol(6);
            }
            else{
                return;
            }
        }
        else{
            while(movement > 0){
                if ( this.getRow() < 7 && this.getCol() == 0 )
                    this.setCol(this.row++);
                else if ( this.getRow() == 7 && this.getCol() < 7 )
                    this.setCol(this.col++);
                else if ( this.getRow() > 0 && this.getCol() == 7 )
                    this.setCol(this.row--);
                else if ( this.getRow() == 0 && this.getCol() > 0 )
                    this.setCol(this.row--);

                movement--;
            }
        }
    }
}
