package com.kodilla.testing.forum.statistics;

class ForumStats {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();

        if (usersCount > 0 ) {
            postsPerUser = postsCount / (double) usersCount;
            commentsPerUser = commentsCount / (double) usersCount;
        } else {
            postsPerUser = 0;
            commentsPerUser = 0;
        }

        if (postsCount > 0) {
            commentsPerPost = commentsCount / (double) postsCount;
        } else {
            commentsPerPost = 0;
        }

    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }


}
