package laba1.task13;
import laba1.task12.Book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj){
        if (obj instanceof ProgrammerBook book){
            if (!super.equals(obj)) return false;
            return book.language.equals(this.language) && book.level == this.level;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + language.hashCode() + level * 123;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLanguage: " + language + "\nLevel: " + level;
    }
}
