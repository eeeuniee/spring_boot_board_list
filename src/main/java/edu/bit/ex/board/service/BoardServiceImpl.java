package edu.bit.ex.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.board.mapper.BoardMapper;
import edu.bit.ex.board.service.BoardServiceImpl;
import edu.bit.ex.board.vo.BoardVO;
import edu.bit.ex.page.Criteria;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		
		return mapper.getList();
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		
		return mapper.getTotalCount(cri);
	}



	@Override
	public void writeBoard(BoardVO boardVO) {
	
		mapper.insert(boardVO);
	}

	@Override
	public BoardVO getBoard(int bId) {
	
		return mapper.read(bId);
	}

	@Override
	public void modifyBoard(BoardVO boardVO) {
		
		mapper.modify(boardVO);

	}

	@Override
	public void remove(int bId) {
		
		mapper.delete(bId);
	}

	@Override
	public BoardVO getReplyBoard(int bId) {
		
		return mapper.readyToReply(bId);
	}

	@Override
	public void replyBoard(BoardVO boardVO) {
		
		mapper.updateShape(boardVO);
		mapper.insertReply(boardVO);

	}

	@Override
	public void upHit(BoardVO boardVO) {
	
		mapper.hitUpdate(boardVO);
	}


}
