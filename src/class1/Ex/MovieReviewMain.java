package class1.Ex;

public class MovieReviewMain {
    public static void main(String[] args) {
MovieReview review1 = new MovieReview();
MovieReview review2= new MovieReview();
        review1.title = "인셉션";
        review2.title = "어바웃 타임";

        review1.review = "인생은 무한 루프";
        review2.review = "인생 시간 영화";

        MovieReview[] reviews = {review1, review2};

        for (MovieReview m : reviews) {
            System.out.println("영화 제목 : " + m.title + ", 리뷰 : " + m.review);
        }
    }
}
