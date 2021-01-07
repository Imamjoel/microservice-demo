package com.chemco.purchaserequestservice.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long itemId;
    private String name;
    private String code;

}
