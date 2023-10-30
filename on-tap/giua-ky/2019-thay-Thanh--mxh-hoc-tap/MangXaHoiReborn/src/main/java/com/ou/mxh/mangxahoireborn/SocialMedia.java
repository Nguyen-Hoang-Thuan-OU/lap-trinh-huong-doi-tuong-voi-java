package com.ou.mxh.mangxahoireborn;

public class SocialMedia {
    public static void main(String[] args) {
        
        Post post1 = new Post("Hello world");
        post1.addANewActionToAPostAndReturnAMessage(new DislikeAction());
        post1.addANewActionToAPostAndReturnAMessage(new DislikeAction());
        post1.addANewActionToAPostAndReturnAMessage(new DislikeAction());
        
        Post post2 = new Post("Java OOP");        
        post2.addANewActionToAPostAndReturnAMessage(new LikeAction());
        post2.addANewActionToAPostAndReturnAMessage(new LikeAction());
        post2.addANewActionToAPostAndReturnAMessage(new DislikeAction());
        
        Post post3 = new Post("How to get rich");        
        post3.addANewActionToAPostAndReturnAMessage(new LoveAction());
        post3.addANewActionToAPostAndReturnAMessage(new LoveAction());
        post3.addANewActionToAPostAndReturnAMessage(new LoveAction());
        post3.addANewActionToAPostAndReturnAMessage(new LoveAction());
        post3.addANewActionToAPostAndReturnAMessage(new LoveAction());
        
        
        PostManagement postManager = new PostManagement();
        postManager.addANewPostToPostList(post1);
        postManager.addANewPostToPostList(post2);
        postManager.addANewPostToPostList(post3);
        
        System.out.print("\n=== List of posts ===");
        postManager.showPostListStructure();
        postManager.showPostListInfo();
        
        System.out.print("\n=== Find and show the post have highest like point ===");
        postManager.showPostListStructure();
        System.out.println(postManager.findAPostHaveHighestLikeAction());
        
        System.out.printf("\nCount love action points of post \"%d\": ", post3.getPostId());
        System.out.println(postManager.countLoveActionPointWithGivenPostId(post3.getPostId()));
        
        System.out.print("\n=== Post list sorting descending by action point ===");
        postManager.sortPostListFollowingDescendingActionPoint();
        postManager.showPostListStructure();
        postManager.showPostListInfo();
    }
}
