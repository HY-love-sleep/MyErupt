package com.hy.page;/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import javax.persistence.*;
import xyz.erupt.annotation.*;
import xyz.erupt.annotation.sub_erupt.*;
import xyz.erupt.annotation.sub_field.*;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.upms.model.base.HyperModel;
import xyz.erupt.jpa.model.BaseModel;
import java.util.Set;
import java.util.Date;

@Erupt(name = "文件共享")
@Table(name = "share_file")
@Entity
public class FilePage extends BaseModel {

        @EruptField(
                views = @View(
                        title = "文件"
                ),
                edit = @Edit(
                        title = "文件",
                        type = EditType.ATTACHMENT, notNull = true,
                        attachmentType = @AttachmentType
                )
        )
        private String file;

        @EruptField(
                views = @View(
                        title = "文件描述"
                ),
                edit = @Edit(
                        title = "文件描述",
                        type = EditType.INPUT, search = @Search,
                        inputType = @InputType
                )
        )
        private String description;

        @EruptField(
                views = @View(
                        title = "日期", sortable = true
                ),
                edit = @Edit(
                        title = "日期",
                        type = EditType.DATE, search = @Search, notNull = true,
                        dateType = @DateType(type = DateType.Type.DATE_TIME)
                )
        )
        private Date date;

}