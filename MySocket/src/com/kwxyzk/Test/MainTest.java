/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package com.kwxyzk.Test 
 * FileName: MainTest.java
 * Author:   Administrator
 * Date:     2017年2月9日 上午10:52:50
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   Administrator           2017年2月9日上午10:52:50                     1.0                  
 *===============================================================================================
 */
package com.kwxyzk.Test;

import com.kwxyzk.server.Server;

/**
 * 名称：〈一句话功能简述〉<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年2月9日 <br>
 * 作者：Administrator <br>
 * 说明：<br>
 */
public class MainTest {
    public static void main(String[] arg) {
        Server server = new Server();
        server.service();
    }
}
