package com.sson.s1;

import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sson.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {

	@RequestMapping(value="qnaList")
	public ModelAndView list(ModelAndView view,@RequestParam(defaultValue="0",required=false) int curPage){
		
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("sson");
		qnaDTO.setAge(26);
		view.addObject("dto", qnaDTO);
		view.setViewName("qna/qnaList");
		System.out.println(curPage);
		
		return view;
	}
	
	
	@RequestMapping(value="qnaView")
	public String view(Model model){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("sson");
		qnaDTO.setAge(26);
		
		model.addAttribute("dto", qnaDTO);
		
		return "qna/qnaView";
	}
	
	@RequestMapping(value="qnaWrite", method = RequestMethod.GET)
	public void write(){
	}
	
	@RequestMapping(value="qnaWrite", method = RequestMethod.POST)
	public String write(QnaDTO qnaDTO){
		
		System.out.println(qnaDTO.getTitle());
		System.out.println(qnaDTO.getWriter());
		System.out.println(qnaDTO.getAge());
	
		for (String string : qnaDTO.getName()) {
			System.out.println(string);
		}
		return "qna/qnaList";
	}
}
