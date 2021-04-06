package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Twitter {
    public static void main(String[] args) {

        Twitter obj = new Twitter();
        obj.postTweet(1, 5);
        List<Integer> param_2 = obj.getNewsFeed(1);
        obj.follow(1, 2);
        obj.postTweet(2, 6);
        List<Integer> param_3 = obj.getNewsFeed(1);
        for (Integer item: param_3) {
            System.out.println(item);
        }
        obj.unfollow(1, 2);
        List<Integer> param_4 = obj.getNewsFeed(1);

    }

    HashMap<Integer, List<Integer>> followerMap = new HashMap();
    HashMap<Integer, List<Integer>> postMap = new HashMap();

    /**
     * Initialize your data structure here.
     */
    public Twitter() {

    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        if (postMap.containsKey(userId)) {
            List<Integer> postList = postMap.get(userId);
            postList.add(tweetId);
            postMap.put(userId, postList);
        } else {
            List<Integer> postList = new ArrayList<>();
            postList.add(tweetId);
            postMap.put(userId, postList);
        }
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        if (postMap.containsKey(userId)) return postMap.get(userId);
        return null;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (followerMap.containsKey(followerId)) {
            List<Integer> list = followerMap.get(followerId);
            list.add(followeeId);
        } else {
            List<Integer> list = new ArrayList();
            list.add(followeeId);
            followerMap.put(followerId, list);
        }
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (followerMap.containsKey(followerId)) {
            List<Integer> list = followerMap.get(followerId);
            list.remove((Integer) followeeId);
        }

    }
}