package edu.bit.ex.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.board.service.BoardService;
import edu.bit.ex.board.vo.BoardVO;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.page.PageVO;
import lombok.AllArgsConstructor;


@Controller
@AllArgsConstructor
public class BoardController {

	private BoardService boardService;


	
	@GetMapping("/list")
	public void list2(Criteria cri, Model model) throws Exception {
		
		System.out.println(cri);

		model.addAttribute("list", boardService.getList(cri)); 

		int total = boardService.getTotal(cri);
		
		model.addAttribute("pageMaker", new PageVO(cri, total));
		
	}

	@GetMapping("/write_view")
	public String write_view(Model model) throws Exception {
		
		return "write_view";
	}

	@GetMapping("/write")
	public String write(BoardVO boardVO, Model model) throws Exception {
		
		boardService.writeBoard(boardVO);
		return "redirect:list";
	}

	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) throws Exception {
		
		boardService.upHit(boardVO);
		model.addAttribute("content_view", boardService.getBoard(boardVO.getbId()));
		return "content_view";
	}

	@PostMapping("/modify")
	public String modify(BoardVO boardVO, Model model) throws Exception {
		
		boardService.modifyBoard(boardVO);
		return "redirect:list";
	}

	@GetMapping("/delete")
	public String delete(BoardVO boardVO, Model model) throws Exception {
		
		boardService.remove(boardVO.getbId());
		return "redirect:list";
	}

	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) throws Exception {
		
		model.addAttribute("reply_view", boardService.getReplyBoard(boardVO.getbId()));
		return "reply_view";
	}

	@PostMapping("/reply")
	public String reply(BoardVO boardVO, Model model) throws Exception {
		
		boardService.replyBoard(boardVO);
		return "redirect:list";
	}
}