package com.tbank.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Task {
    String title;
    String description;
    String resolve;
    List<Slide> slides;

    @Data
    @AllArgsConstructor
    public static class Slide {
       String title;
       String text;
       String textPosition;
       Link link;
       String imageUrl;
    }

    @Data
    @AllArgsConstructor
    public static class Link {
        String preview;
        String url;
    }
}
