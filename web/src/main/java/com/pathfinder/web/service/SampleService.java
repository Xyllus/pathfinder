package com.pathfinder.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathfinder.web.common.dao.AbstractDAO;

@Service
public class SampleService {

		@Autowired
		private AbstractDAO abstractDAO;
		
		public String getData() {
			return (String)abstractDAO.selectOne("sample.selectBoardList");
		}
}
