//package com.usk.dmt.dao.impl;
//
//import com.usk.dmt.dao.BaseDao;
//import com.usk.dmt.repository.BaseRepository;
//import com.usk.dmt.service.impl.BaseServiceImpl;
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.Serializable;
//import java.util.List;
//
//@Component
//@Slf4j
//public class BaseDaoImpl<T,ID extends Serializable> implements BaseDao<T,ID> {
//    private Logger logger = LoggerFactory.getLogger(BaseDaoImpl.class);
//
//    @Autowired
//    BaseRepository<T,ID> baseRepository;
//
//    @Override
//    public List<T> findAll() {
//        return baseRepository.findAll();
//    }
//}
