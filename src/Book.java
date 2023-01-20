public  class Book {
    private final String name;
    private final Author authorName;
    private int publicationYear;
    public Book (String name, int publicationYear, Author authorName) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
        }
    public String getName(){

        return name;
        }
    public int getpublicationYear() {

        return publicationYear;
        }
    public Author getAuthorName() {

        return authorName;
        }

}