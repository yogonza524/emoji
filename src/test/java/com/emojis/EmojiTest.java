package com.emojis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmojiTest {

    @Test
    public void shouldContainsAnEmoji() {
        Emoji bowtie = Emoji.bowtie();
        assertNotNull(bowtie);
        assertEquals(":bowtie:", bowtie.getCode());
        assertEquals("https://github.githubassets.com/images/icons/emoji/bowtie.png", bowtie.getImageUrl());
    }

    @Test
    public void shouldFoundAnEmoji() {
        List<Emoji> emojiList = Emoji.find("heart");
        assertNotNull(emojiList);
        assertFalse(emojiList.isEmpty());
    }

    @Test
    public void shouldShowAll() {
        Emoji.all().stream().forEach(e -> System.out.println("public static Emoji " +
                e.getCode().replaceAll(":", "") + "()"
                + "{\n\treturn dictionary.get(\"" + e.getCode().replaceAll(":", "") +
                "\");\n}"
                ));
    }
}