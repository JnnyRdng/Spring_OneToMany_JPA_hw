package com.codeclan.example.filesAndFolders.components;

import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import com.codeclan.example.filesAndFolders.repositories.FileRepository;
import com.codeclan.example.filesAndFolders.repositories.FolderRepository;
import com.codeclan.example.filesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;
    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User alice = new User("Alice");
        userRepository.save(alice);
        User bob = new User("Bob");
        userRepository.save(bob);
        User charlie = new User("Charlie");
        userRepository.save(charlie);

        Folder documents = new Folder("Documents", alice);
        folderRepository.save(documents);
        Folder pictures = new Folder("Screenshots", bob);
        folderRepository.save(pictures);
        Folder movies = new Folder("Films", charlie);
        folderRepository.save(movies);
        Folder music = new Folder("Music", alice);
        folderRepository.save(music);
        Folder downloads = new Folder("Downloads", alice);
        folderRepository.save(downloads);
        Folder code = new Folder("Code", bob);
        folderRepository.save(code);
        Folder apps = new Folder("Applications", alice);
        folderRepository.save(apps);

        File trackTrace = new File("track_and_trace_data", "xls", 16384, documents);
        fileRepository.save(trackTrace);
        File trackTrace2 = new File("urgent_track_trace_update_v2_final_final_USE_THIS_ONE", "xls", 16384, documents);
        fileRepository.save(trackTrace2);
        File worldBeating = new File("WORLD_BEATING", "csv", 8829381, documents);
        fileRepository.save(worldBeating);
        File screenshot1 = new File("image_00001", "png", 512, pictures);
        fileRepository.save(screenshot1);
        File screenshot2 = new File("image_00002", "png", 142, pictures);
        fileRepository.save(screenshot2);
        File godfather = new File("The Godfather", "mkv", 7781994, movies);
        fileRepository.save(godfather);
        File lionKing = new File("The Lion King", "mp4", 9187914, movies);
        fileRepository.save(lionKing);
        File fightClub = new File("Fight Club", "mov", 8927831, movies);
        fileRepository.save(fightClub);
        File wetransfer = new File("wetransfer-c5ad8e", "zip", 8163, downloads);
        fileRepository.save(wetransfer);
        File virus = new File("definitely_not_a_virus", "exe", 91874, downloads);
        fileRepository.save(virus);
        File thisFile = new File("DataLoader", "java", 124, code);
        fileRepository.save(thisFile);
        File pom = new File("pom", "xml", 70, code);
        fileRepository.save(pom);
        File foo = new File("foo", "py", 882, code);
        fileRepository.save(foo);
        File bar = new File("bar", "js", 14, code);
        fileRepository.save(bar);
        File intelliJ = new File("IntelliJ IDEA CE", "app", 1237059647, apps);
        fileRepository.save(intelliJ);
        File photoshop = new File("Adobe Photoshop 2020", "app", 1195719512, apps);
        fileRepository.save(photoshop);
    }

}
