public class TextBook {
    private String title;
    private int nChapters;
    private int chaptersRead;

    public TextBook(String t, int n) {
        title = t;
        nChapters = n;
        chaptersRead = 0;
    }

    /**
     * Gets the title of the textbook.
     *
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Reads the next chapter of the textbook.
     */
    public void readNextChapter() {
        if (isFinished()) {
            System.out.println("No more chapters to read! The book is finished!");
        } else {
            chaptersRead++;
        }
    }

    /**
     * Checks if the textbook is finished.
     *
     * @return True if all chapters have been read, false otherwise.
     */
    public boolean isFinished() {
        return chaptersRead >= nChapters;
    }

    /**
     * Resets the number of chapters read, simulating closing the book.
     */
    public void closeBook() {
        chaptersRead = 0;
    }

    /**
     * Describes the current state of the textbook.
     */
    public void describe() {
        System.out.println(title + " with " + (nChapters - chaptersRead) + " chapters left.");
    }
    
    public int getChapters (){
        return nChapters;
    }
    
    public int getChaptersRead() {
        return chaptersRead;
    }
}
