package com.codeclan.example.Week13_day2_homework.components;

import com.codeclan.example.Week13_day2_homework.models.File;
import com.codeclan.example.Week13_day2_homework.models.Folder;
import com.codeclan.example.Week13_day2_homework.models.User;
import com.codeclan.example.Week13_day2_homework.repositories.FileRepository;
import com.codeclan.example.Week13_day2_homework.repositories.FolderRepository;
import com.codeclan.example.Week13_day2_homework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeds implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public void run(ApplicationArguments args) {

        User ruben = new User("Ruben");
        userRepository.save(ruben);

        Folder games = new Folder("Games", ruben);
        folderRepository.save(games);

        File dune = new File("Dune", "exe", games);
        fileRepository.save(dune);

//        ruben.addFolder(games);
//        userRepository.save(ruben);

        games.addFile(dune);
        folderRepository.save(games);

    }
}
