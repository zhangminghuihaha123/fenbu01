package com.zmh.service_goods.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("goods")
public class Goods {

    @TableId(type = IdType.AUTO,value = "goodsid")
    private Integer goodsid;

    @TableField("goods")
    private String good;

    @TableField("user")
    private String user;

    @TableField("create_Time")
    private String createTime;
}
