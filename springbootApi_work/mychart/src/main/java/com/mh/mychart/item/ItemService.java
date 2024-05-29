package com.mh.mychart.item;

import com.mh.mychart.item.itemimg.ItemImg;
import com.mh.mychart.item.itemimg.ItemImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemImgRepository itemImgRepository;
    private final Path imageStorageLocation;

    public ItemService(ItemRepository itemRepository, ItemImgRepository itemImgRepository) {
        this.itemRepository = itemRepository;
        this.itemImgRepository = itemImgRepository;
        this.imageStorageLocation = Paths.get("images/item").toAbsolutePath().normalize();
        try {
            // Paths에 있는 경로대로 폴더를 만든다
            Files.createDirectories(this.imageStorageLocation);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(imageStorageLocation);
    }

    public boolean addItem(ItemDto itemDto, MultipartFile[] files) throws IOException {

        Optional<Item> findItemNm = itemRepository.findByItemNm(itemDto.getItemNm());

        if (findItemNm.isPresent()) {
            return false;
        }

        if (findItemNm.isEmpty()) {
            Item item = Item.builder()
                    .price(itemDto.getPrice())
                    .itemNm(itemDto.getItemNm())
                    .itemDesc(itemDto.getItemDesc())
                    .build();

            Item dbItem = itemRepository.save(item);

            // 이미지 파일 갯수만큼 넣어줘야 한다
            for (MultipartFile file : files) {
                // 파일이름과 경로 생성
                String fileNmae = file.getOriginalFilename();
                String filePath = imageStorageLocation + "/" + fileNmae;
                // 파일저장 images/item 밑에
                File dest = new File(filePath);
                file.transferTo(dest);

                //itemImg테이블에 저장
                ItemImg itemImg = ItemImg.builder()
                        .item(dbItem)
                        .imgPath(filePath)
                        .build();
                itemImgRepository.save(itemImg);
            }

        }
        return true;
    }

    public List<ItemResDto> listItem() {
        itemRepository.getItemList();
        return null;
    }
}
