package com.hy.page;

import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.*;

import java.util.Date;

/**
 * Description: 后端文件界面
 * Author: yhong
 * Date: 2023/11/21
 */
public class webFilePage {
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
                    title = "项目"
            ),
            edit = @Edit(
                    title = "所属项目",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String project;

    @EruptField(
            views = @View(
                    title = "版本"
            ),
            edit = @Edit(
                    title = "版本",
                    type = EditType.INPUT, search = @Search,
                    inputType = @InputType
            )
    )
    private String jarVersion;


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

    @EruptField(
            edit = @Edit(title = "上传用户", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "洪岩", value = "hy"),
                                    @VL(label = "张晓波", value = "zxb"),
                                    @VL(label = "李星熠", value = "lxy"),
                            }
                    ))
    )
    private String uploadUser;

}
