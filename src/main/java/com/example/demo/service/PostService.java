package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(new Post("Ура я в Майами!"), new Post("Грустно. в холодильнике кончились сырники"), new Post("Кран"));
    }
}
