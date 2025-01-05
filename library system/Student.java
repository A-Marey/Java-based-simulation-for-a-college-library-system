/**
 * This is a student class.
 *
 * @author (Adam Marey)
 * @version (1)
 *
 * this class represents college students
 */
public class Student {
    private String name;
    private Library library;
    private LibraryCard libraryCard;
    private TextBook currentTextBook;

    /**
     * creates a new student a name and library.
     *
     * @param (name)    the name of the student
     * @param (library) the library the student joins
     */
    public Student(String name, Library library) {
        this.name = name;
        this.library = library;
        this.libraryCard = library.issueCard();
        this.currentTextBook = null;
    }
    
    /**
     * checks if the student has finished his studies
     *
     * @return True if the student does not have a TextBook to read
     * and can't borrow one because the LibraryCard has expired; otherwise, false.
     */
    public boolean finishedStudies() {
        return currentTextBook == null && libraryCard.expired();
    }
    
     /**
     * causes the student to study.
     * if the student does not currently have a TextBook,
     * then the student tries to borrow one from the library
     * if the student does have a book and its finished,
     * then the student reads one chapter from his book
     * the student has a book that is finished
     * so he closes it and returns it
     * after all of this the student will not have any books
     */
    public void study() {
        if (currentTextBook == null) {
            currentTextBook = library.borrowBook(libraryCard);
        } else if (!currentTextBook.isFinished()) {
            currentTextBook.readNextChapter();
        } else {
            library.returnBook(currentTextBook);
            currentTextBook = null;
        }
    }
    
     /**
     * prints messages about the student's current state
     */
    public void describe() {
        System.out.println("Student " + name + " " + getDescription());
    }

    private String getDescription() {
        if (currentTextBook == null) {
            return "does not have a book and " + libraryCard.getCardRef() +
                   " has an allowance of " + (libraryCard.getlimit() - libraryCard.getBooksBorrowed()) + " books.";
        } else {
            return "has a book " + currentTextBook.getTitle() + " with " +
                   (currentTextBook.getChapters() - currentTextBook.getChaptersRead()) + " chapters left.\n" +
                   (currentTextBook.isFinished() ? "The book is finished." : "The student is reading.");
        }
    }
    
     /**
     * Gets the name of the student.
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }
}
