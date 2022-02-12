/*
 *Copyright (c) [Year] [name of copyright holder]
 *[Software Name] is licensed under Mulan PubL v2.
 *You can use this software according to the terms and conditions of the Mulan PubL v2.
 *You may obtain a copy of Mulan PubL v2 at:
 *         http://license.coscl.org.cn/MulanPubL-2.0
 *THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 *EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 *MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 *See the Mulan PubL v2 for more details.
 */
package com.lamp.electron.console.entity.user;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserLoginRecord {


	private Long ulId;
	
	private Long uiId;
	
	private LocalDateTime ulLoginTime;
	
	private LocalDateTime ulQuitTime;
	
	private String ulIp;
	
	private String ulLoginLocal;
	
	private String ulLoginWay;
	
	private String ulLoginSystem;
	
	private String ulLoginTerminal;
	
	private String ulLoginVersion;
	
	private String ulThirdpartyIp;
	
	private String ulQuitWay;
			
}
