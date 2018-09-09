package dto;

import lombok.Data;

import java.util.Date;

@Data
public class DeptDto {

    private Long deptId;

    private String name;

    private Date operateTime;

    private Long parentId;

    private String remark;

    private Integer seq;
}
