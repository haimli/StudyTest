package org.example.doc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lihaiming
 * @version 1.0.0
 * @since 2021/1/9 18:17
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    /** 主键 */
    private Long id;

    /** 名称 */
    private String name;


    private boolean success;
}
