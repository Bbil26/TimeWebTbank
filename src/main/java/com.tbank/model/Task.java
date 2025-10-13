package com.tbank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Task {
    String title;
    String description;
    String resolve;
    List<Slide> sldies;

    @Data
    @AllArgsConstructor
    public static class Slide {
       String title;
       String text;
       Link link;
       String imageUrl;
    }

    @Data
    @AllArgsConstructor
    public class Link {
        String preview;
        String url;
    }
}
