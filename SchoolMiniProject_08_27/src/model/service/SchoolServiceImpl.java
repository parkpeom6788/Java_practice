package model.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.exception.DuplicateTelException;
import model.exception.MemberNotFoundException;
import model.path.Path;
import model.vo.Member;

public class SchoolServiceImpl implements SchoolService {
	
	private ArrayList<Member> list = new ArrayList<Member>();

	File file = new File(Path.PATH);
	
	public SchoolServiceImpl() {
		
	}
	@Override
	public int findIndexByTel(String tel) {
		int index = -1;
		for(int i=0; i<list.size(); i++) {
			if(tel.equals(list.get(i).getTel()))
				index = i;
		}
		return index;
	}
	@Override
	public void addMember(Member member) throws DuplicateTelException {
		if(findIndexByTel(member.getTel()) != -1) 
			// 있음
			throw new DuplicateTelException();
		else 
			list.add(member);
	}

	@Override
	public void printAll() {
		for(int i=0; i<list.size();i++) 
			System.out.println(list.get(i).toString());	
	}
	@Override
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		Member member = null;
		if(findIndexByTel(tel) != -1) // 있음
			member = list.get(findIndexByTel(tel));
		else 
			throw new MemberNotFoundException();
		return member;
	}
	@Override
	public void deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(findIndexByTel(tel)!=-1) {
			list.remove(findIndexByTel(tel));
			System.out.println(tel +"삭제가 완료되었습니다.");
		}
		else 
			throw new MemberNotFoundException();
	}

	@Override
	public void updateMember(Member member) throws MemberNotFoundException {
		if(findIndexByTel(member.getTel())!=-1) {
			list.set(findIndexByTel(member.getTel()),member);
			System.out.println(member.getTel() +"이 수정되었습니다.");
		}
		else 
			throw new MemberNotFoundException();
	}
	
	// 직렬화
	@SuppressWarnings("resource")
	public void serializable() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
		} finally {
			if(oos != null)
				oos.close();
		}
	}
	// 역직렬화
	@SuppressWarnings("unchecked")
	public void deserializable() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if(file.exists()) {
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			this.list = (ArrayList<Member>)ois.readObject();
		} finally {
			if(ois != null)
				ois.close();
			}
		}
	}
}
