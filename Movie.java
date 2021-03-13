public class Movie {
    private String title;
    private int rating;

    private void setTitle(String title) {
        if(title.matches("^[a-zA-Z\\s]+"))
            this.title = title;
    }
    private void setRating(int rating) {
        if(rating >= 0 && rating <= 10)
            this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }

    public Movie(String title, int rating){
        setTitle(title);
        setRating(rating);
    }
}
