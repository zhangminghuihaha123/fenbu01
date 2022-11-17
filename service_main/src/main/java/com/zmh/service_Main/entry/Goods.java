package com.zmh.service_Main.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Goods {

    private Integer goodsid;

    private String good;

    private String user;

    private String createTime;
}
