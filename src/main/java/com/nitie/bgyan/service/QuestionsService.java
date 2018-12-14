package com.nitie.bgyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitie.bgyan.exception.MyFileNotFoundException;
import com.nitie.bgyan.generated.dto.QuestionDto;
import com.nitie.bgyan.generated.dto.QuestionDtoList;
import com.nitie.bgyan.model.FinQ;
import com.nitie.bgyan.model.GeneralQ;
import com.nitie.bgyan.model.HrQ;
import com.nitie.bgyan.model.MarQ;
import com.nitie.bgyan.model.OpQ;
import com.nitie.bgyan.repo.FinQRepo;
import com.nitie.bgyan.repo.GeneralQRepo;
import com.nitie.bgyan.repo.HrQRepo;
import com.nitie.bgyan.repo.MarQRepo;
import com.nitie.bgyan.repo.OpQRepo;

@Service
public class QuestionsService {
	@Autowired
	OpQRepo opQRepo;
	@Autowired
	GeneralQRepo genQRepo;
	@Autowired
	FinQRepo finQRepo;
	@Autowired
	MarQRepo marQRepo;
	@Autowired
	HrQRepo hrQRepo;

	public QuestionDto deleteQuestionWithId(String section, String id) {
		QuestionDto qDto = new QuestionDto();
		switch (section) {
		case "marketing":
			MarQ marQ = marQRepo.findById(Integer.valueOf(id))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + id));
			;
			qDto.setAnswer(marQ.getAnswer());
			qDto.setId(marQ.getId());
			qDto.setQuestion(marQ.getQuestion());
			qDto.setSection(section);
			marQRepo.deleteById(id.hashCode());
			return qDto;
		case "operations":
			OpQ opQ = opQRepo.findById(Integer.valueOf(id))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + id));
			;
			qDto.setAnswer(opQ.getAnswer());
			qDto.setId(opQ.getId());
			qDto.setQuestion(opQ.getQuestion());
			qDto.setSection(section);
			opQRepo.deleteById(id.hashCode());
		case "general":
			GeneralQ genQ = genQRepo.findById(Integer.valueOf(id))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + id));
			;
			qDto.setAnswer(genQ.getAnswer());
			qDto.setId(genQ.getId());
			qDto.setQuestion(genQ.getQuestion());
			qDto.setSection(section);
			genQRepo.deleteById(id.hashCode());
		case "finance":
			FinQ finQ = finQRepo.findById(Integer.valueOf(id))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + id));
			;
			qDto.setAnswer(finQ.getAnswer());
			qDto.setId(finQ.getId());
			qDto.setQuestion(finQ.getQuestion());
			qDto.setSection(section);
			finQRepo.deleteById(id.hashCode());
		case "hr":
			HrQ hrQ = hrQRepo.findById(Integer.valueOf(id))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + id));
			;
			qDto.setAnswer(hrQ.getAnswer());
			qDto.setId(hrQ.getId());
			qDto.setQuestion(hrQ.getQuestion());
			qDto.setSection(section);
			hrQRepo.deleteById(id.hashCode());
		default:
			break;
		}
		return qDto;
	}

	public QuestionDtoList getRandomQuestion(String section) {
		QuestionDtoList qDtoList = new QuestionDtoList();
		QuestionDto qDto = new QuestionDto();
		switch (section) {
		case "marketing":
			Iterable<MarQ> mar25q = marQRepo.find25RandomRecord();
			for (MarQ s : mar25q) {
				qDto.setAnswer(s.getAnswer());
				qDto.setId(s.getId());
				qDto.setQuestion(s.getQuestion());
				qDto.setSection(section);
				qDtoList.addQuestionListItem(qDto);
			}
			return qDtoList;
		case "operations":
			Iterable<OpQ> op25q = opQRepo.find25RandomRecord();
			for (OpQ s : op25q) {
				qDto.setAnswer(s.getAnswer());
				qDto.setId(s.getId());
				qDto.setQuestion(s.getQuestion());
				qDto.setSection(section);
				qDtoList.addQuestionListItem(qDto);
			}
			return qDtoList;
		case "general":
			Iterable<GeneralQ> gen25q = genQRepo.find25RandomRecord();
			for (GeneralQ s : gen25q) {
				qDto.setAnswer(s.getAnswer());
				qDto.setId(s.getId());
				qDto.setQuestion(s.getQuestion());
				qDto.setSection(section);
				qDtoList.addQuestionListItem(qDto);
			}
			return qDtoList;
		case "finance":
			Iterable<FinQ> fin25q = finQRepo.find25RandomRecord();
			for (FinQ s : fin25q) {
				qDto.setAnswer(s.getAnswer());
				qDto.setId(s.getId());
				qDto.setQuestion(s.getQuestion());
				qDto.setSection(section);
				qDtoList.addQuestionListItem(qDto);
			}
			return qDtoList;
		case "hr":
			Iterable<HrQ> hr25q = hrQRepo.find25RandomRecord();
			for (HrQ s : hr25q) {
				qDto.setAnswer(s.getAnswer());
				qDto.setId(s.getId());
				qDto.setQuestion(s.getQuestion());
				qDto.setSection(section);
				qDtoList.addQuestionListItem(qDto);
			}
			return qDtoList;
		default:
			break;
		}
		return qDtoList;
	}

	public QuestionDto updateQuestion(QuestionDto questionDto) {
		switch (questionDto.getSection()) {
		case "marketing":
			MarQ marQ = marQRepo.findById(questionDto.getQuestion().hashCode()).orElseThrow(
					() -> new MyFileNotFoundException("File not found with id " + questionDto.getQuestion()));
			;
			marQ.setAnswer(questionDto.getAnswer());
			marQ.setId(questionDto.getQuestion().hashCode());
			marQ.setQuestion(questionDto.getQuestion());
			marQRepo.save(marQ);
			return questionDto;
		case "operations":
			OpQ opQ = opQRepo.findById(questionDto.getQuestion().hashCode()).orElseThrow(
					() -> new MyFileNotFoundException("File not found with id " + questionDto.getQuestion()));
			;
			opQ.setAnswer(questionDto.getAnswer());
			opQ.setId(questionDto.getQuestion().hashCode());
			opQ.setQuestion(questionDto.getQuestion());
			opQRepo.save(opQ);
			return questionDto;
		case "general":
			GeneralQ genQ = genQRepo.findById(questionDto.getQuestion().hashCode()).orElseThrow(
					() -> new MyFileNotFoundException("File not found with id " + questionDto.getQuestion()));
			;
			genQ.setAnswer(questionDto.getAnswer());
			genQ.setId(questionDto.getQuestion().hashCode());
			genQ.setQuestion(questionDto.getQuestion());
			genQRepo.save(genQ);
			return questionDto;
		case "finance":
			FinQ finQ = finQRepo.findById(questionDto.getQuestion().hashCode()).orElseThrow(
					() -> new MyFileNotFoundException("File not found with id " + questionDto.getQuestion()));
			;
			finQ.setAnswer(questionDto.getAnswer());
			finQ.setId(questionDto.getQuestion().hashCode());
			finQ.setQuestion(questionDto.getQuestion());
			finQRepo.save(finQ);
			return questionDto;
		case "hr":
			HrQ hrQ = hrQRepo.findById(questionDto.getQuestion().hashCode()).orElseThrow(
					() -> new MyFileNotFoundException("File not found with id " + questionDto.getQuestion()));
			;
			hrQ.setAnswer(questionDto.getAnswer());
			hrQ.setId(questionDto.getQuestion().hashCode());
			hrQ.setQuestion(questionDto.getQuestion());
			hrQRepo.save(hrQ);
			return questionDto;
		default:
			break;
		}
		return questionDto;
	}

	public QuestionDto uploadQuestion(QuestionDto questionDto) {
		switch (questionDto.getSection()) {
		case "marketing":
			MarQ marQ = new MarQ();
			marQ.setAnswer(questionDto.getAnswer());
			marQ.setId(questionDto.getQuestion().hashCode());
			marQ.setQuestion(questionDto.getQuestion());
			marQRepo.save(marQ);
			questionDto.setId(questionDto.getQuestion().hashCode());
			return questionDto;
		case "operations":
			OpQ opQ = new OpQ();
			opQ.setAnswer(questionDto.getAnswer());
			opQ.setId(questionDto.getQuestion().hashCode());
			opQ.setQuestion(questionDto.getQuestion());
			opQRepo.save(opQ);
			questionDto.setId(questionDto.getQuestion().hashCode());
			return questionDto;
		case "general":
			GeneralQ genQ = new GeneralQ();
			genQ.setAnswer(questionDto.getAnswer());
			genQ.setId(questionDto.getQuestion().hashCode());
			genQ.setQuestion(questionDto.getQuestion());
			genQRepo.save(genQ);
			questionDto.setId(questionDto.getQuestion().hashCode());
			return questionDto;
		case "finance":
			FinQ finQ = new FinQ();
			finQ.setAnswer(questionDto.getAnswer());
			finQ.setId(questionDto.getQuestion().hashCode());
			finQ.setQuestion(questionDto.getQuestion());
			finQRepo.save(finQ);
			questionDto.setId(questionDto.getQuestion().hashCode());
			return questionDto;
		case "hr":
			HrQ hrQ = new HrQ();
			hrQ.setAnswer(questionDto.getAnswer());
			hrQ.setId(questionDto.getQuestion().hashCode());
			hrQ.setQuestion(questionDto.getQuestion());
			hrQRepo.save(hrQ);
			questionDto.setId(questionDto.getQuestion().hashCode());
			return questionDto;
		default:
			break;
		}
		return questionDto;
	}
}
