package com.nh.concurrent.net.bean;

public enum ChangeType {
	已报价(10),
    议价中(40),
    竞价结束(43),
    议价结束(45),
    取消报价(999);
    private ChangeType(int status) {
        this.status = status;
    }
    
    public static ChangeType valueOf(int status) {
        //some checkes
        for (ChangeType s : ChangeType.values())
        {
            if(s.getStatus() == status)
            {
                return s;
            }
        }
        return null;
    }

    public int getStatus()
    {
        return status;
    }
    private int status;
}
