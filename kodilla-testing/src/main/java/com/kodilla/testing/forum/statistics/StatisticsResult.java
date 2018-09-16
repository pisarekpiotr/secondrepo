package com.kodilla.testing.forum.statistics;


public class StatisticsResult {
    private double usersQuantity;
    private double postQuantity;
    private double commentQuantity;
    private double averagePostQuantity;
    private double averageCommentsQuantity;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {

        this.usersQuantity = statistics.usersNames().size();
        this.postQuantity = statistics.postsCount();
        this.commentQuantity = statistics.commentsCount();

        if (usersQuantity > 0) {
            if (postQuantity > 0) {
                this.averagePostQuantity = postQuantity / usersQuantity;
            } else {
                averagePostQuantity = 0;
            }
        }

        if (usersQuantity > 0) {
            if (commentQuantity > 0) {
                this.averageCommentsQuantity = commentQuantity / usersQuantity;
            } else {
                averageCommentsQuantity = 0;
            }
        }

        if (postQuantity > 0) {
            if (commentQuantity > 0) {
                this.averageCommentsPerPost = commentQuantity / postQuantity;
            } else {
                averageCommentsPerPost = 0;
            }
        }

    }

    public void showStatistics() {
        System.out.println("Statistics: \n"
                + "Users quantity" + usersQuantity + "\n"
                + "Post Quantity" + postQuantity + "\n"
                + "Comments Quantity" + commentQuantity + "\n"
                + "Average post quantity:" + averagePostQuantity + "\n"
                + "Average Comment Quantity:" + averageCommentsQuantity + "\n"
                + "Average comments per post:" + averageCommentsPerPost + "\n");
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostQuantity() {
        return postQuantity;
    }

    public double getCommentQuantity() {
        return commentQuantity;
    }

    public double getAveragePostQuantity() {
        return averagePostQuantity;
    }

    public double getAverageCommentsQuantity() {
        return averageCommentsQuantity;
    }

    public double getAverageCommentsPerPostt() {
        return averageCommentsPerPost;
    }
}
