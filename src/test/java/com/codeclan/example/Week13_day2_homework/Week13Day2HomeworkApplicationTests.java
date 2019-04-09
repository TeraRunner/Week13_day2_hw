package com.codeclan.example.Week13_day2_homework;

import com.codeclan.example.Week13_day2_homework.models.File;
import com.codeclan.example.Week13_day2_homework.models.Folder;
import com.codeclan.example.Week13_day2_homework.models.User;
import com.codeclan.example.Week13_day2_homework.repositories.FileRepository;
import com.codeclan.example.Week13_day2_homework.repositories.FolderRepository;
import com.codeclan.example.Week13_day2_homework.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Week13Day2HomeworkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void createUserAndFolderAndFileThenSave(){
		User ruben = new User("Ruben");
		userRepository.save(ruben);
		Folder games = new Folder("Games", ruben);
		folderRepository.save(games);
		File dune = new File("Dune", "exe", games);
		fileRepository.save(dune);
	}

	@Test
	public void createUserAndFolderAndFileThenSave2(){

		User ruben = new User("Ruben");
		userRepository.save(ruben);
		Folder games = new Folder("Games", ruben);
		folderRepository.save(games);
		File dune = new File("Dune", "exe", games);
		fileRepository.save(dune);

//		ruben.addFolder(games);
//		userRepository.save(ruben);

		games.addFile(dune);
		folderRepository.save(games);

	}

}
