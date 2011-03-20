package com.rokon.dao;

import java.util.List;

import com.rokon.domain.Register;

public interface RegisterDao {
	public Register getRegister(int id);

	public void saveRegister(Register register);

	public List<Register> listRegisters();
}
