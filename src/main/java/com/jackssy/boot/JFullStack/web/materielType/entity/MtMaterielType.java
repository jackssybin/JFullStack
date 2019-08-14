package com.jackssy.boot.JFullStack.web.materielType.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 物料分类
    * </p>
*
* @author jackssy
* @since 2019-08-15
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @ApiModel(value="MtMaterielType对象", description="物料分类")
    public class MtMaterielType implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "主键")
            @TableId(value = "materiel_type", type = IdType.AUTO)
    private Long materielType;

            @ApiModelProperty(value = "物料分类名称")
    private String materielTypeName;

            @ApiModelProperty(value = "状态0启用1禁用")
    private Boolean status;

            @ApiModelProperty(value = "租户id")
    private String organId;

            @ApiModelProperty(value = "删除标识 0=>未删除 1=>删除")
    private Boolean isDel;

            @ApiModelProperty(value = "创建人id")
    private String createUserId;

            @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


}
