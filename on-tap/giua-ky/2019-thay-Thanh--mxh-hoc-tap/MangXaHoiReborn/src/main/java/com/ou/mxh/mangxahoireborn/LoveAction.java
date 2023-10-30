package com.ou.mxh.mangxahoireborn;

public class LoveAction extends Action {
    
    {
        actionPoint = actionPoint + 3;
    }

    @Override
    public String message(int postId) {
        return String.format("Chuc mung! Co nguoi vua tha tim bai viet \"%d\" cua ban.", postId);
    }
    
}
