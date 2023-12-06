package com.example.corazondelator.controllers;


import com.example.corazondelator.mappers.AdminRequestUpdate;
import com.example.corazondelator.mappers.BorrowResponse;
import com.example.corazondelator.mappers.LoginRequest;
import com.example.corazondelator.mappers.books.*;
import com.example.corazondelator.models.User.AdminModel;
import com.example.corazondelator.models.books.*;
import com.example.corazondelator.models.borrow.Borrow;
import com.example.corazondelator.repositories.*;
import com.example.corazondelator.services.BooksServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController {
    @Autowired
    BooksServices booksServices;

    @Autowired
    private AdminRepository adminRepository;
    private BorrowRepository borrowRepository;
    private ComicRepository comicRepository;
    private DictionaryRepository dictionaryRepository;
    private ReadingBooksRepository readingBooksRepository;
    private EncyclopediaRepository encyclopediaRepository;
    private NewspaperRepository newspaperRepository;

    @GetMapping(value = "/admin")
    public List<AdminModel> getAdmin(){

        return adminRepository.findAll();
    }

    @PostMapping(value = "/saveadmin")
    public ResponseEntity saveAdmin(@RequestBody AdminModel admin){

        try {
            adminRepository.save(admin);
            return new ResponseEntity("saved admin", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = "/updateadmin/{id}")
    public ResponseEntity updateAdmin(@PathVariable long id, @RequestBody AdminRequestUpdate admin){

        try {
            AdminModel updateAdmin = adminRepository.findById(id).get();
            updateAdmin.setName(admin.getName());
            updateAdmin.setUser(admin.getUser());
            updateAdmin.setGenre(admin.getGenre());
            updateAdmin.setPosition(admin.getPosition());
            adminRepository.save(updateAdmin);
            return new ResponseEntity("updated admin", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping(value = "deleteadmin/{id}")
    public ResponseEntity deleteAdmin(@PathVariable long id){
        try {
            AdminModel deletedAdmin = adminRepository.findById(id).get();
            adminRepository.delete(deletedAdmin);
            return new ResponseEntity("deleted admin", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(value = "/updateborrow/{id}")
    public ResponseEntity updateBorrow(@PathVariable long id, @RequestBody BorrowResponse borrow){

        try {
            Borrow updateBorrow = borrowRepository.findById(id).get();
            updateBorrow.setCustomerToBorrow(borrow.getCustomerToBorrow());
            updateBorrow.setRutCustomerToBorrow(borrow.getRutCustomerToBorrow());
            updateBorrow.setState(borrow.getState());
            borrowRepository.save(updateBorrow);
            return new ResponseEntity("updated borrow", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping(value = "/borrow")
    public List<Borrow> getBorrow(){
        return borrowRepository.findAll();
    }
    @PostMapping(value = "/saveborrow")
    public ResponseEntity saveBorrow(@RequestBody Borrow borrow){
        try {
            borrowRepository.save(borrow);
            return new ResponseEntity("saved borrow", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = "/updatecomic/{id}")
    public ResponseEntity updateComic(@PathVariable long id, @RequestBody ComicResponse comic){

        try {Comic updateComic = comicRepository.findById(id).get();
            updateComic.setTitle(comic.getTitle());
            updateComic.setPublicationyear(comic.getPublicationyear());
            updateComic.setEdition(comic.getEdition());
            updateComic.setImageUrl(comic.getImageUrl());
            updateComic.setStock(comic.getStock());
            updateComic.setBorrowStock(comic.getBorrowStock());
            updateComic.setGenre(comic.getGenre());
            comicRepository.save(updateComic);
            return new ResponseEntity("updated Comic", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping(value = "deletecomic/{id}")
    public ResponseEntity deleteComic(@PathVariable long id){

        try {
            Comic deletedComic = comicRepository.findById(id).get();
            comicRepository.delete(deletedComic);
            return new ResponseEntity("deleted comic", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping(value = "/savecomic")
    public ResponseEntity saveComic(@RequestBody Comic comic){

        try {
            comicRepository.save(comic);
            return new ResponseEntity("saved comic", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = "/updatedictionary/{id}")
    public ResponseEntity updateDictionary(@PathVariable long id, @RequestBody DictionaryResponse dictionary){

        try {
            Dictionary updateDictionary = dictionaryRepository.findById(id).get();
            updateDictionary.setTitle(dictionary.getTitle());
            updateDictionary.setPublicationyear(dictionary.getPublicationyear());
            updateDictionary.setEdition(dictionary.getEdition());
            updateDictionary.setEditor(dictionary.getEditor());
            updateDictionary.setImageUrl(dictionary.getImageUrl());
            updateDictionary.setStock(dictionary.getStock());
            updateDictionary.setBorrowStock(dictionary.getBorrowStock());
            updateDictionary.setDictCategory(dictionary.getDictCategory());
            updateDictionary.setLanguage(dictionary.getLanguage());
            dictionaryRepository.save(updateDictionary);
            return new ResponseEntity("updated dictionary", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping(value = "deletedictionary/{id}")
    public ResponseEntity deleteDictionary(@PathVariable long id){
        try {
            Dictionary deletedDictionary = dictionaryRepository.findById(id).get();
            dictionaryRepository.delete(deletedDictionary);
            return new ResponseEntity("deleted dictionary", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping(value = "/savedictionary")
    public ResponseEntity saveDictionary(@RequestBody Dictionary dictionary){
        try {
            dictionaryRepository.save(dictionary);
            return new ResponseEntity("saved comic", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = "/updateencyclopedia/{id}")
    public ResponseEntity updateEncyclopedia(@PathVariable long id, @RequestBody EncyclopediaResponse encyclopedia){
        try {
            Encyclopedia updateEncyclopedia = encyclopediaRepository.findById(id).get();
            updateEncyclopedia.setTitle(encyclopedia.getTitle());
            updateEncyclopedia.setPublicationyear(encyclopedia.getPublicationyear());
            updateEncyclopedia.setEdition(encyclopedia.getEdition());
            updateEncyclopedia.setImageUrl(encyclopedia.getImageUrl());
            updateEncyclopedia.setStock(encyclopedia.getStock());
            updateEncyclopedia.setBorrowStock(encyclopedia.getBorrowStock());
            updateEncyclopedia.setEncyType(encyclopedia.getEncyType());
            updateEncyclopedia.setLanguage(encyclopedia.getLanguage());

            encyclopediaRepository.save(updateEncyclopedia);
            return new ResponseEntity("updated encyclopedia", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping(value = "deleteencyclopedia/{id}")
    public ResponseEntity deleteEncyclopedia(@PathVariable long id){
        try {
            Encyclopedia deletedEncyclopedia = encyclopediaRepository.findById(id).get();
            encyclopediaRepository.delete(deletedEncyclopedia);
            return new ResponseEntity("deleted encyclopedia", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping(value = "/saveencyclopedia")
    public ResponseEntity saveEncyclopedia(@RequestBody Encyclopedia encyclopedia){
        try {
            encyclopediaRepository.save(encyclopedia);
            return new ResponseEntity("save encyclopedia", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = "/updatenewspaper/{id}")
    public ResponseEntity updateNewspaper(@PathVariable long id, @RequestBody NewspaperResponse newspaper){

        try {
            Newspaper updateNewspaper = newspaperRepository.findById(id).get();
            updateNewspaper.setTitle(newspaper.getTitle());
            updateNewspaper.setBrand(newspaper.getBrand());
            updateNewspaper.setPublicationyear(newspaper.getPublicationyear());
            updateNewspaper.setEdition(newspaper.getEdition());
            updateNewspaper.setEditor(newspaper.getEditor());
            updateNewspaper.setImageUrl(newspaper.getImageUrl());
            updateNewspaper.setStock(newspaper.getStock());
            updateNewspaper.setBorrowStock(newspaper.getBorrowStock());
            updateNewspaper.setLanguage(newspaper.getLanguage());

            newspaperRepository.save(updateNewspaper);
            return new ResponseEntity("updated newspaper", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "deletenewspaper/{id}")
    public ResponseEntity deleteNewspaper(@PathVariable long id){
        try {
            Newspaper deleteNewspaper = newspaperRepository.findById(id).get();
            newspaperRepository.delete(deleteNewspaper);
            return new ResponseEntity("deleted newspaper", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping(value = "/savenewspaper")
    public ResponseEntity saveNewspaper(@RequestBody Newspaper newspaper){
        try {
            newspaperRepository.save(newspaper);
            return new ResponseEntity("saved newspaper", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = "/updatereadingbook/{id}")
    public ResponseEntity updateReadingBook(@PathVariable long id, @RequestBody ReadingBooksResponse readingBooks){
        try {
            ReadingBooks updateReadingBook = readingBooksRepository.findById(id).get();
            updateReadingBook.setTitle(readingBooks.getTitle());
            updateReadingBook.setPublicationyear(readingBooks.getPublicationyear());
            updateReadingBook.setEdition(readingBooks.getEdition());
            updateReadingBook.setImageUrl(readingBooks.getImageUrl());
            updateReadingBook.setStock(readingBooks.getStock());
            updateReadingBook.setBorrowStock(readingBooks.getBorrowStock());
            updateReadingBook.setGenre(readingBooks.getGenre());
            readingBooksRepository.save(updateReadingBook);
            return new ResponseEntity("updated reading Book", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
    @DeleteMapping(value = "deletereadingBooks/{id}")
    public ResponseEntity deleteReadingBooks(@PathVariable long id){
        try {
            ReadingBooks deleteReadingBooks = readingBooksRepository.findById(id).get();

            readingBooksRepository.delete(deleteReadingBooks);
            return new ResponseEntity("deleted reading Book", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping(value = "/savereadingBooks")
    public  ResponseEntity saveReadingBooks(@RequestBody ReadingBooks readingBooks) {
        try {
            readingBooksRepository.save(readingBooks);
            return new ResponseEntity("saved newspaper", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping(value = "/allbooks")
    public List<Object> getAllData() {

        return booksServices.getAllData();
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        try {
            return ResponseEntity.ok(loginRequest);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
