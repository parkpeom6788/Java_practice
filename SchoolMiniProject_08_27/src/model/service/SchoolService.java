package model.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.exception.DuplicateTelException;
import model.exception.MemberNotFoundException;
import model.vo.Member;

public interface SchoolService {
	public int findIndexByTel(String tel) ;
	public void addMember(Member member) throws DuplicateTelException;
	public void printAll();
	public Member findMemberByTel(String tel) throws MemberNotFoundException;
	public void deleteMemberByTel(String tel) throws MemberNotFoundException;
	public void updateMember(Member member) throws MemberNotFoundException;
	public void serializable() throws FileNotFoundException, IOException;
	public void deserializable() throws FileNotFoundException, IOException, ClassNotFoundException;
}
