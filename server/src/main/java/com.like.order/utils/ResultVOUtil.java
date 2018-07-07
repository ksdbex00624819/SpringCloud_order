package com.like.order.utils;

import com.like.order.VO.ResultVO;

/**
 * Created by like
 * 2018/5/27
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
