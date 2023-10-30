package com.ou.mxh.mangxahoireborn;

public abstract class Action {
    protected int actionPoint = 0;
    
    public abstract String message(int postId);

    public int getActionPoint() {
        return actionPoint;
    }

    public void setActionPoint(int actionPoint) {
        this.actionPoint = actionPoint;
    }
}
