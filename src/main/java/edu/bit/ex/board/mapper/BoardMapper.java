package edu.bit.ex.board.mapper;

import java.util.List;

import edu.bit.ex.board.vo.BoardVO;
import edu.bit.ex.page.Criteria;


public interface BoardMapper {

	public List<BoardVO> getList();
	//public List<BoardVO> getTables();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	public void insert(BoardVO boardVO);
	public BoardVO read(int bId);
	public void modify(BoardVO boardVO);
	public void delete(int bId);
	public BoardVO readyToReply(int bId);
	public void updateShape(BoardVO boardVO);
	public void insertReply(BoardVO boardVO);
	public void hitUpdate(BoardVO boardVO);

	

	
}
