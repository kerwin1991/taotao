package com.taotao.manager.service.impl;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/5/7.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryDate() {
        return testMapper.findDate();
    }
}
