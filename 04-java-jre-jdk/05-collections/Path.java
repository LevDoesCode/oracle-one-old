package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Path implements Comparable<Path> {
	private String name;
	private int length;
	// private List<Subject> subjectList = new ArrayList<>();
	private List<Subject> subjectList = new LinkedList<>();

	public Path(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}

	public Path(String name, int length, List<Subject> subjectList) {
		super();
		this.name = name;
		this.length = length;
		this.subjectList = subjectList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public List<Subject> getUnmodSubjectList() {
		return Collections.unmodifiableList(this.subjectList);
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override // optional
	public String toString() {
		return this.name;
	}

	public void addSubject(Subject subject) {
		this.subjectList.add(subject);
	}

	@Override
	public int compareTo(Path o) {
		return this.name.compareTo(o.getName());
	}

}
