package edu.bit.ex.board.service;

import java.util.List;

import edu.bit.ex.board.vo.BoardVO;
import edu.bit.ex.page.Criteria;

public interface BoardService {

	public List<BoardVO> getList();
	//public List<BoardVO> getTables();
	
	public List<BoardVO> getList(Criteria cri);// �� ��� ��ȸ
	public int getTotal(Criteria cri); //�� ����
	
	public void writeBoard(BoardVO boardVO); // �� ���
	public BoardVO getBoard(int getbId); 	// �� �ۼ� ������
	public void modifyBoard(BoardVO boardVO);	//�� ����
	public void remove(int getbId);	// �� ����
	public BoardVO getReplyBoard(int getbId);	// ��� ������
	public void replyBoard(BoardVO boardVO);	// ���
	public void upHit(BoardVO boardVO);	// ��ȸ��

	
}
