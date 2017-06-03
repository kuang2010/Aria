/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.core.upload;

import com.arialyy.aria.core.inf.AbsTaskEntity;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lyy on 2017/2/9.
 * 上传任务实体
 */
public class UploadTaskEntity extends AbsTaskEntity {
  public UploadEntity uploadEntity;
  public String uploadUrl; //上传路径
  public String attachment;  //文件上传需要的key
  public String contentType = "multipart/form-data"; //上传的文件类型
  public String userAgent = "User-Agent";
  public String charset = "utf-8";

  /**
   * 文件上传表单
   */
  public Map<String, String> formFields = new HashMap<>();

  public UploadTaskEntity(UploadEntity downloadEntity) {
    this.uploadEntity = downloadEntity;
  }

  @Override public UploadEntity getEntity() {
    return uploadEntity;
  }
}
