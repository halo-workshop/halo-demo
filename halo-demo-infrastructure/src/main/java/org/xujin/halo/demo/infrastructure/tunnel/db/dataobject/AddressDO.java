package org.xujin.halo.demo.infrastructure.tunnel.db.dataobject;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigInteger;
import java.sql.Timestamp;
import lombok.Data;
import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

/**
 * @author halo codegen
 */
@TableName("t_address")
@Data
public class AddressDO {

    /**
     * id
     */
    @TableId(value = "id", type = AUTO)
    private BigInteger id;

    /**
     * 顾客的id
     */
    @TableField(value = "customer_id")
    private Long customerId;

    /**
     * street
     */
    @TableField(value = "street")
    private String street;

    /**
     * city
     */
    @TableField(value = "city")
    private String city;

    /**
     * state
     */
    @TableField(value = "state")
    private String state;

    /**
     * 创建时间
     */
    @TableField(value = "gmt_create")
    private Timestamp gmtCreate;

    /**
     * 更新时间
     */
    @TableField(value = "gmt_modified")
    private Timestamp gmtModified;

    /**
     * 是否删除 0 否 1 已经删除
     */
    @TableField(value = "is_deleted")
    private Byte isDeleted;

}