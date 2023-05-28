package edu.uoc.abarrena.users.infrastructure.repository.mybatis.mapper;

import edu.uoc.abarrena.users.infrastructure.repository.mybatis.entity.ImageEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ImageMapper {

    @Insert("INSERT INTO IMAGE (CONTENT, CONTENT_TYPE, NAME) VALUES (#{content}, #{contentType}, #{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void save(ImageEntity imageEntity);

    @Select("SELECT * FROM IMAGE WHERE ID = #{id}")
    ImageEntity findById(Long id);

    @Delete("DELETE FROM IMAGE WHERE ID = #{id}")
    void delete(Long id);
}
