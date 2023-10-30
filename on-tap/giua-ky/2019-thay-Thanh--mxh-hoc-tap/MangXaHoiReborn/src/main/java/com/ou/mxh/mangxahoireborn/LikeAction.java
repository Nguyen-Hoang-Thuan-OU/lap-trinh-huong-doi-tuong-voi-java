package com.ou.mxh.mangxahoireborn;

public class LikeAction extends Action{
    
    {
        actionPoint = actionPoint + 2;
    }

    @Override
    public String message(int postId) {
        return String.format("Co nguoi vua thich bai viet \"%d\" cua ban.", postId);
    }
    
}
