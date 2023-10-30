package com.ou.mxh.mangxahoireborn;

public class DislikeAction extends Action {
    
    {
        actionPoint = actionPoint - 1;
    }

    @Override
    public String message(int postId) {
        return String.format("Tiec that! Co nguoi vua khong thich bai viet \"%d\" cua ban.", postId);
    }
    
}
