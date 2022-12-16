package com.mylog.controller;

import com.mylog.domain.Post;
import com.mylog.request.PostCreate;
import com.mylog.response.PostResponse;
import com.mylog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate request) {
        postService.write(request);
    }

    @GetMapping("posts/{postId}")
    public PostResponse get(@PathVariable(name = "postId") Long id) {
        PostResponse postResponse = postService.get(id);
        return postResponse;
    }
}
