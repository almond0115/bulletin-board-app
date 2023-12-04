package com.nero.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nero.server.dto.Board;
import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 목록
    public List<Board> list() throws Exception;

    // 게시글 조회
    public Board select(int no) throws Exception;

    // 게시글 등록
    public int insert(Board board) throws Exception;

    // 게시를 수정
    public int update(Board board) throws Exception;

    // 게시글 삭제
    public int delete(int no) throws Exception;

    // 조회수 업데이트
    public int updateViews(@Param("count") int count, @Param("no") int no) throws Exception;
}