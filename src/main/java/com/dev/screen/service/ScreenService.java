package com.dev.screen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.screen.model.Output;
import com.dev.screen.util.StateConstants;

@Service
public class ScreenService {

	public List<Output> processAState(String input) {

		List<Output> list = null;

		String prevState = input.substring(0, 3);
		char state = input.charAt(3);

		switch (state) {

		case 'A':
			list = getList(prevState, state, input, StateConstants.stateA);
			break;
		case 'B':
			list = getList(prevState, state, input, StateConstants.stateB);
			break;
		case 'C':
			list = getList(prevState, state, input, StateConstants.stateC);
			break;
		case 'D':
			list = getList(prevState, state, input, StateConstants.stateD);
			break;
		case 'E':
			list = getList(prevState, state, input, StateConstants.stateE);
			break;
		case 'F':
			list = getList(prevState, state, input, StateConstants.stateF);
			break;
		case 'G':
			list = getList(prevState, state, input, StateConstants.stateG);
			break;
		case 'H':
			list = getList(prevState, state, input, StateConstants.stateH);
			break;
		case 'I':
			list = getList(prevState, state, input, StateConstants.stateI);
			break;
		case 'J':
			list = getList(prevState, state, input, StateConstants.stateJ);
			break;

		default:
			list = null;
			break;
		}

		return list;
	}

	private List<Output> getList(String prevState, char state, String input, String[] stateArr) {
		List<Output> list = new ArrayList<Output>();

		Output op1 = new Output();
		op1.setId(1);
		op1.setContent("Previous State");
		op1.setDesc(prevState);
		list.add(op1);

		Output op2 = new Output();
		op2.setId(2);
		op2.setContent("State Name");
		op2.setDesc(state + "");
		list.add(op2);

		int begin = 4;

		for (int i = 3; i <= stateArr.length; i++) {
			Output op = new Output();

			op.setId(i);
			op.setContent(stateArr[i - 1]);
			op.setDesc(input.substring(begin, begin + 3));

			list.add(op);
			begin += 3;
		}

		return list;

	}

}
