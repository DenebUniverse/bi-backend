package com.deneb.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deneb.springbootinit.service.ChartService;
import com.deneb.springbootinit.model.entity.Chart;
import com.deneb.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 91633
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-08-29 23:30:01
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService {

}




