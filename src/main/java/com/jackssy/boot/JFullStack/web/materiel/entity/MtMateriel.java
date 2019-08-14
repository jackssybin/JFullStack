package com.jackssy.boot.JFullStack.web.materiel.entity;

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
    * 物料表
    * </p>
*
* @author jackssy
* @since 2019-08-15
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @ApiModel(value="MtMateriel对象", description="物料表")
    public class MtMateriel implements Serializable {

    private static final long serialVersionUID = 1L;

            @ApiModelProperty(value = "主键")
            @TableId(value = "materiel_id", type = IdType.AUTO)
    private Long materielId;

            @ApiModelProperty(value = "物料分类id")
    private Long materielType;

            @ApiModelProperty(value = "物料名称")
    private String materielName;

            @ApiModelProperty(value = "物料费")
    private Double materielPrice;

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
