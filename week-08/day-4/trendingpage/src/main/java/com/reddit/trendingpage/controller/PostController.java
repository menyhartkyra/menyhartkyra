package com.reddit.trendingpage.controller;

import com.reddit.trendingpage.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PostController {
  private final PostService postService;
}
