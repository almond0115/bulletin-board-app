package com.nero.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nero.server.mapper.BoardMapper;

import com.nero.server.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardMapper BoardMapper;

    @Override
    public List<Board> list() throws Exception {
        List<Board> boardList = BoardMapper.list();
        return boardList;
    }

    @Override
    public Board select(int no) throws Exception {
        Board board = BoardMapper.select(no);
        return board;
    }

    @Override
    public int insert(Board board) throws Exception {
        int result = BoardMapper.insert(board);
        return result;
    }

    @Override
    public int update(Board board) throws Exception {
        int result = BoardMapper.update(board);
        return result;
    }

    @Override
    public int delete(int no) throws Exception {
        int result = BoardMapper.delete(no);
        return result;
    }

    @Override
    public int updateViews(int count, int no) throws Exception {
        int result = BoardMapper.updateViews(count, no);
        return result;
    }
    
}
