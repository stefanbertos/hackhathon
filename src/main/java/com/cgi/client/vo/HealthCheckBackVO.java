package com.cgi.client.vo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HealthCheckBackVO {
    private Long id;

    private String shoulderBlades;

    private String shoulderBladesComment;

    private String armpit;

    private String armpitComment;

    private String knee;

    private String kneeComment;

    private String feet;

    private String haluxValgusLeftFoot;

    private String haluxValgusRightFoot;

    private String skoliosaLeftRight;

    private String skoliosaRightLeft;

    private String calf;

    private String calfComment;

    private String achilles;

    private String achillesComment;

    private String leftHeel;

    private String leftHeelComment;

    private String rightHeel;

    private String rightHeelComment;

    @JsonBackReference
    private ClientVO client;
}


