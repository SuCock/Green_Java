package com.mh.mychart.item;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("api/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping(value = "/new", produces = MediaType.APPLICATION_JSON_VALUE,
                                 consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> newItem(
        @RequestPart ItemDto itemDto,
        @RequestPart("files") MultipartFile[] files
        ) throws IOException {

        if(files[0] == null){
            return ResponseEntity
                    .status( HttpStatus.NOT_ACCEPTABLE )
                    .body("상품이미지는 최소 하나는 등록해야합니다.");
        }

        boolean result = itemService.addItem(itemDto, files);

        if(result){
            return ResponseEntity
                    .status( HttpStatus.OK )
                    .body("저장하였습니다.");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("중복입니다...");
        }
    }

    @GetMapping("download/{fileName}")
    public ResponseEntity<Resource> getImage(@PathVariable String fileName){
        Path imagesStorageLocation = Paths.get("images/item").toAbsolutePath().normalize();
        try {
            Path filePath = imagesStorageLocation.resolve(fileName);
            Resource resource = new UrlResource(filePath.toUri());
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                    .body(resource);
        }catch (IOException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
    }

    @GetMapping("")
    public ResponseEntity<List<ItemResDto>> getItemList(){

        List<ItemResDto> list = itemService.listItem();
        return ResponseEntity.ok(list);
    }
}
