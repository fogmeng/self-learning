package com.zz.learning.channel;

import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service
public class DeptFilterImpl implements Filter<Dept>{

  
    @Override
    public void filtrate(Dept target, FilterChain<Dept> chain) throws Exception {
        System.out.println(target.toString());
        System.out.println("filter1 处理dept");
        chain.go(target);
        
    }

}
