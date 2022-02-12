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
package com.lamp.electron.base.common.basedata;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EnvironmentalBase {
	
	
	public static final String  DEFAULT_ENVIROMENTAL_NAME = "default";

	private Long environmentalId = 0L;

	private String environmentalName = DEFAULT_ENVIROMENTAL_NAME;
	
	private String explain;
	
	private LocalDateTime createTime;
	
	private LocalDateTime updateTime;
	
	private Integer status;
}
