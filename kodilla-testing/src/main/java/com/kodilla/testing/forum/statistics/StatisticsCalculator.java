package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private double usersNumber;
    private double postsNumber;
    private double commentsNumber;
    private double averageOfPosts;
    private double averageOfComments;
    private double commentsPerPost;


    public double getUsersNumber() {
        return usersNumber;
    }

    public double getPostsNumber() {
        return postsNumber;
    }

    public double getCommentsNumber() {
        return commentsNumber;
    }

    public double getAverageOfPosts() {
        return averageOfPosts;
    }

    public double getAverageOfComments() {
        return averageOfComments;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (!statistics.usersNames().isEmpty() && statistics.postsCount() != 0) {
            averageOfPosts = postsNumber / usersNumber;
        } else {
            averageOfPosts = 0.0;
        }
        if (!statistics.usersNames().isEmpty() && statistics.commentsCount() != 0) {
            averageOfComments = commentsNumber / usersNumber;
        } else {
            averageOfComments = 0.0;
        }
        if (statistics.commentsCount() != 0 && statistics.postsCount() != 0) {
            commentsPerPost = commentsNumber / postsNumber;
        } else {
            commentsPerPost = 0.0;
        }
    }

    public void showStatistic() {
        System.out.println("Users on forum: " + usersNumber);
        System.out.println("Total posts on forum: " + postsNumber);
        System.out.println("Total comments on forum: " + commentsNumber);
        System.out.println("Posts per User: " + averageOfPosts);
        System.out.println("Comments per User:" + averageOfComments);
        System.out.println("Comments per Post: " + commentsPerPost);
    }
}
