package oop.ex5.filterpackage;

import java.io.File;

import oop.ex5.filescript.MyUtilities;


/**
 * Filters according to the string contained in the file name (excluding path)
 * @author orib
 */
public class ContainsFilter implements Filter {
	private String nameCriteria;
	private boolean warning;
	/**
	 * Constructor.
	 * @param nameCriteria - the name of the file to filter with.
	 */
	public ContainsFilter(String nameCriteria){
		this.warning = false;
		this.nameCriteria = nameCriteria;
	}
	
	/**
	 * @return true if the file matches the filter's criteria,
	 *         false otherwise.
	 * @param file - the file to filter.
	 */
	public boolean isPass(File file){
		// Get the name of the file.
		String fileName = MyUtilities.getFileName(file);
		if (fileName.contains(this.nameCriteria)){
			return true;
		}
		return false;
	}
	
	/**
	 * @return True if there was a warning while creating the filter,
	 * 			false otherwise.
	 */
	public boolean getWarning(){
		return this.warning;
	}
	
	/**
	 * Set the filter warning to be true.
	 */
	public void setWarning(){
		this.warning = true;
	}
}
