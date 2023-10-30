package com.ou.mxh.mangxahoireborn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Post {
    private static int autoIncreaseNumberForPostId = 0;
    private int postId = ++autoIncreaseNumberForPostId;
    private String postName;
    private List<Action> actionList;

    public Post() {
    }

    public Post(String postName) {
        this.postName = postName;
        actionList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("| %8d | %-15s | %8d | %8d | %8d | %12d |",
                postId, postName,
                calculateLikePoint(), calculateLovePoint(), calculateDislikePoint(),
                calculateTotalActionPointOfAPost());
    }
    
    public void addANewActionToAPostAndReturnAMessage(Action aNewAction) {
        actionList.add(aNewAction);
        System.out.println(aNewAction.message(postId));
    }
    
    public int calculateLikePoint() {
        return (int) actionList.stream().filter(x -> x instanceof LikeAction).count();
    }
    
    public int calculateLovePoint() {
        return (int) actionList.stream().filter(x -> x instanceof LoveAction).count();
    }
    
    public int calculateDislikePoint() {
        return (int) actionList.stream().filter(x -> x instanceof DislikeAction).count();
    }
    
    public int calculateTotalActionPointOfAPost() {
//        int sum = 0;
//        
//        for (Action x : actionList) {
//            sum = sum + x.getActionPoint();
//        }
//        
//        return sum;
        
        return actionList.stream().flatMapToInt(x -> IntStream.of(x.getActionPoint())).sum();
    }
    
//    public int tinhTongDiemThaiDoCuaBV() {
//        int tongDiemThaiDoCuaBV = 0;
//        
//        for (ThaiDo x : danhSachThaiDo) {
//            tongDiemThaiDoCuaBV = tongDiemThaiDoCuaBV + x.getDiemBV();
//        }
//        
//        return tongDiemThaiDoCuaBV;
//    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public List<Action> getActionList() {
        return actionList;
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
    }
}
