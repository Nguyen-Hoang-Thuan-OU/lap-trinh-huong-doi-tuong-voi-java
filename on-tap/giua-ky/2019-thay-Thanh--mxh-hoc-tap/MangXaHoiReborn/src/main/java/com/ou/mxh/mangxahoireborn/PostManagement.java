package com.ou.mxh.mangxahoireborn;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PostManagement {
    private List<Post> postList = new ArrayList<>();
    
    public void showPostListStructure() {        
        System.out.printf("\n| %-8s | %-15s | %-8s | %-8s | %-8s | %-12s |\n",
                "Post Id", "Post Name", "Like", "Love", "Dislike", "Total Point");
    }
    
    public void showPostListInfo() {
        postList.forEach(x -> System.out.println(x));
    }
    
    public void addANewPostToPostList(Post aNewPost) {
        postList.add(aNewPost);
    }
    
    public Post findAPostHaveHighestLikeAction() {
        if(!postList.isEmpty()) {
            return postList.stream().max((p1, p2) -> p1.calculateLikePoint() - p2.calculateLikePoint()).get();
//            Post max = postList.get(0);
//
//            for (Post x : postList) {
//                if(x.calculateLikePoint() > max.calculateLikePoint())
//                    max = x;
//            }
//
//            return max;
        }
        
        return null;
    }
    
    public int countLoveActionPointWithGivenPostId(int postId) {
        if(!postList.isEmpty()) {
            try {
                Post post = postList.stream().filter(x -> x.getPostId() == postId).findFirst().get();
                return post.calculateLovePoint();
            } catch (NoSuchElementException nsee) {
                return 0;
            }
            
//            for (Post x : postList) {
//                if(x.getPostId() == postId)
//                    return x.calculateLovePoint();
//            }
        }
        
        return 0;
    }
    
    public void sortPostListFollowingDescendingActionPoint() {
        postList.sort((p1, p2) -> -(p1.calculateTotalActionPointOfAPost() - p2.calculateTotalActionPointOfAPost()));
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
