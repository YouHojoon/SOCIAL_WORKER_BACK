package ac.kr.smu.lookie.socialworker.controller;

import ac.kr.smu.lookie.socialworker.domain.File;
import ac.kr.smu.lookie.socialworker.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/files")
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<?> getFile(){
        return ResponseEntity.ok("{}");
    }
    @PostMapping
    public ResponseEntity<?> postFile(List<MultipartFile> uploadFileList){
        List<File> uploadFile = fileService.upload(uploadFileList);
        return new ResponseEntity<>(uploadFile, HttpStatus.OK);
    }
}
