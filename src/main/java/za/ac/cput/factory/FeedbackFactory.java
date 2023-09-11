package za.ac.cput.factory;
import za.ac.cput.domain.Feedback;
import za.ac.cput.util.Helper;

public class FeedbackFactory {
    public static Feedback createFeedback(String name, String comment) {
        if (Helper.isNullorEmpty(name) || Helper.isNullorEmpty(comment)) {
            return null;
        }

        int id = Integer.parseInt(Helper.generateID());

        return new Feedback.FeedbackBuilder()
                .setName(name)
                .setComment(comment)

                .build();

    }

}
