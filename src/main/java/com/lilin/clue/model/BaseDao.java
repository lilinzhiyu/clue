package com.lilin.clue.model;

import java.util.Date;

public class BaseDao {
    /**
     * 实体创建时间
     */
    private Date create;

    /**
     * 实体修改时间
     */
    private Date modified;

    /**
     * 实体最终关闭时间
     */
    private Date closed;

    /**
     * 实体软删除标记，默认标记为false
     */
    private boolean deleted = false;
}

