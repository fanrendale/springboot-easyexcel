package entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 对应Excel的标题的实体，可以根据name或index进行对应字段
 *
 * @Author: xjf
 * @Date: 2019/9/22 10:44
 */
@Data
public class DemoData {

    @ExcelProperty("字符串标题")
    private String string;

    @ExcelProperty("日期标题")
    private Date date;

    @ExcelProperty(index = 2)
    private Double doubleData;
}
