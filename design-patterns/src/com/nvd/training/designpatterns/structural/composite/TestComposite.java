package com.nvd.training.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.List;

public class TestComposite {
	public static void main(String[] args) {
		FileComponent file1 = new FileLeaf("file 1", 10);
        FileComponent file2 = new FileLeaf("file 2", 5);
        FileComponent file3 = new FileLeaf("file 3", 12);
        FileComponent file4 = new FileLeaf("file 4", 66);
        FileComponent file5 = new FileLeaf("file 5", 1);
 
        List<FileComponent> files1 = Arrays.asList(file1, file2);
        FileComponent folder1 = new FolderComposite("Folder 1", files1);
        
        List<FileComponent> files2 = Arrays.asList(file3, folder1);
        FileComponent folder2 = new FolderComposite("Folder 2", files2);
        
        List<FileComponent> files3 = Arrays.asList(file4, file5, folder2);
        FileComponent folder3 = new FolderComposite("Folder 3", files3);
        
        folder3.showProperty();
        System.out.println("Total Size: " + folder3.totalSize());
        System.out.println("--------------------");
	}
}
