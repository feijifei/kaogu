package com.kaogu.Mapper;

import com.kaogu.Bean.Polygon;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PolygonMapper {

    @Select("select * from ply where polygon_id=#{id}")
    public Polygon getPLYById(Integer id);

    @Delete("delete from ply where polygon_id=#{id}")
    public int delPLYById(Integer id);


    @Insert("insert into ply(polygon_name, polygon_path) values (#{name}, #{path})")
    public int insertPLY(String name, String path);
}
