package springmvc.dao;

import springmvc.model.Filesinfo;

public interface FilesinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Filesinfo record);

    int insertSelective(Filesinfo record);

    Filesinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Filesinfo record);

    int updateByPrimaryKey(Filesinfo record);
}