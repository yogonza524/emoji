package com.emojis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * From: https://gist.github.com/rxaviers/7360908
 * Unicode: https://apps.timwhitlock.info/emoji/tables/unicode
 */
public class Emoji {

    private final String code;
    private final String imageUrl;

    private Emoji(String code, String imageUrl) {
        this.code = code;
        this.imageUrl = imageUrl;
    }

    public String getCode() {
        return code;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Emoji{" +
                "code='" + code + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emoji emoji = (Emoji) o;
        return Objects.equals(code, emoji.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    private static final Map<String, Emoji> dictionary = new HashMap<>();

    static {
        dictionary.put("bowtie", builder().code(":bowtie:").imageUrl("https://github.githubassets.com/images/icons/emoji/bowtie.png").build());
        dictionary.put("smile", builder().code(":smile:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f604.png").build());
        dictionary.put("laughing", builder().code(":laughing:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f606.png").build());
        dictionary.put("blush", builder().code(":blush:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f60a.png").build());
        dictionary.put("smiley", builder().code(":smiley:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f603.png").build());
        dictionary.put("relaxed", builder().code(":relaxed:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/263a.png").build());
        dictionary.put("smirk", builder().code(":smirk:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f60f.png").build());
        dictionary.put("heart_eyes", builder().code(":heart_eyes:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f60d.png").build());
        dictionary.put("kissing_closed_eyes", builder().code(":kissing_closed_eyes:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f61a.png").build());
        dictionary.put("flushed", builder().code(":flushed:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f633.png").build());
        dictionary.put("relieved", builder().code(":relieved:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f60c.png").build());
        dictionary.put("satisfied", builder().code(":satisfied:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f606.png").build());
        dictionary.put("grin", builder().code(":grin:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f601.png").build());
        dictionary.put("wink", builder().code(":wink:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f609.png").build());
        dictionary.put("stuck_out_tongue_winking_eye", builder().code(":stuck_out_tongue_winking_eye:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f61c.png").build());
        dictionary.put("stuck_out_tongue_closed_eyes", builder().code(":stuck_out_tongue_closed_eyes:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f61d.png").build());
        dictionary.put("grinning", builder().code(":grinning:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f600.png").build());
        dictionary.put("kissing", builder().code(":kissing:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f617.png").build());
        dictionary.put("kissing_smiling_eyes", builder().code(":kissing_smiling_eyes:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f619.png").build());
        dictionary.put("stuck_out_tongue", builder().code(":stuck_out_tongue:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f61b.png").build());
        dictionary.put("sleeping", builder().code(":sleeping:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f634.png").build());
        dictionary.put("worried", builder().code(":worried:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f61f.png").build());
        dictionary.put("frowning", builder().code(":frowning:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f626.png").build());
        dictionary.put("anguished", builder().code(":anguished:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f627.png").build());
        dictionary.put("open_mouth", builder().code(":open_mouth:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f62e.png").build());
        dictionary.put("grimacing", builder().code(":grimacing:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f62c.png").build());
        dictionary.put("confused", builder().code(":confused:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f615.png").build());
        dictionary.put("hushed", builder().code(":hushed:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f62f.png").build());
        dictionary.put("expressionless", builder().code(":expressionless:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f611.png").build());
        dictionary.put("unamused", builder().code(":unamused:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f612.png").build());
        dictionary.put("sweat_smile", builder().code(":sweat_smile:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f605.png").build());
        dictionary.put("sweat", builder().code(":sweat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f613.png").build());
        dictionary.put("disappointed_relieved", builder().code(":disappointed_relieved:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f625.png").build());
        dictionary.put("weary", builder().code(":weary:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f629.png").build());
        dictionary.put("pensive", builder().code(":pensive:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f614.png").build());
        dictionary.put("disappointed", builder().code(":disappointed:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f61e.png").build());
        dictionary.put("confounded", builder().code(":confounded:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f616.png").build());
        dictionary.put("fearful", builder().code(":fearful:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f628.png").build());
        dictionary.put("cold_sweat", builder().code(":cold_sweat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f630.png").build());
        dictionary.put("persevere", builder().code(":persevere:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f623.png").build());
        dictionary.put("cry", builder().code(":cry:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f622.png").build());
        dictionary.put("sob", builder().code(":sob:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f62d.png").build());
        dictionary.put("joy", builder().code(":joy:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f602.png").build());
        dictionary.put("astonished", builder().code(":astonished:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f632.png").build());
        dictionary.put("scream", builder().code(":scream:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f631.png").build());
        dictionary.put("neckbeard", builder().code(":neckbeard:").imageUrl("https://github.githubassets.com/images/icons/emoji/neckbeard.png").build());
        dictionary.put("tired_face", builder().code(":tired_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f62b.png").build());
        dictionary.put("angry", builder().code(":angry:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f620.png").build());
        dictionary.put("rage", builder().code(":rage:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f621.png").build());
        dictionary.put("triumph", builder().code(":triumph:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f624.png").build());
        dictionary.put("sleepy", builder().code(":sleepy:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f62a.png").build());
        dictionary.put("yum", builder().code(":yum:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f60b.png").build());
        dictionary.put("mask", builder().code(":mask:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f637.png").build());
        dictionary.put("sunglasses", builder().code(":sunglasses:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f60e.png").build());
        dictionary.put("dizzy_face", builder().code(":dizzy_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f635.png").build());
        dictionary.put("imp", builder().code(":imp:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f47f.png").build());
        dictionary.put("smiling_imp", builder().code(":smiling_imp:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f608.png").build());
        dictionary.put("neutral_face", builder().code(":neutral_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f610.png").build());
        dictionary.put("no_mouth", builder().code(":no_mouth:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f636.png").build());
        dictionary.put("innocent", builder().code(":innocent:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f607.png").build());
        dictionary.put("alien", builder().code(":alien:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f47d.png").build());
        dictionary.put("yellow_heart", builder().code(":yellow_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f49b.png").build());
        dictionary.put("blue_heart", builder().code(":blue_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f499.png").build());
        dictionary.put("purple_heart", builder().code(":purple_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f49c.png").build());
        dictionary.put("heart", builder().code(":heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2764.png").build());
        dictionary.put("green_heart", builder().code(":green_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f49a.png").build());
        dictionary.put("broken_heart", builder().code(":broken_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f494.png").build());
        dictionary.put("heartbeat", builder().code(":heartbeat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f493.png").build());
        dictionary.put("heartpulse", builder().code(":heartpulse:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f497.png").build());
        dictionary.put("two_hearts", builder().code(":two_hearts:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f495.png").build());
        dictionary.put("revolving_hearts", builder().code(":revolving_hearts:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f49e.png").build());
        dictionary.put("cupid", builder().code(":cupid:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f498.png").build());
        dictionary.put("sparkling_heart", builder().code(":sparkling_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f496.png").build());
        dictionary.put("sparkles", builder().code(":sparkles:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2728.png").build());
        dictionary.put("star", builder().code(":star:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2b50.png").build());
        dictionary.put("star2", builder().code(":star2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f31f.png").build());
        dictionary.put("dizzy", builder().code(":dizzy:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4ab.png").build());
        dictionary.put("boom", builder().code(":boom:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a5.png").build());
        dictionary.put("collision", builder().code(":collision:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a5.png").build());
        dictionary.put("anger", builder().code(":anger:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a2.png").build());
        dictionary.put("exclamation", builder().code(":exclamation:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2757.png").build());
        dictionary.put("question", builder().code(":question:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2753.png").build());
        dictionary.put("grey_exclamation", builder().code(":grey_exclamation:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2755.png").build());
        dictionary.put("grey_question", builder().code(":grey_question:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2754.png").build());
        dictionary.put("zzz", builder().code(":zzz:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a4.png").build());
        dictionary.put("dash", builder().code(":dash:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a8.png").build());
        dictionary.put("sweat_drops", builder().code(":sweat_drops:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a6.png").build());
        dictionary.put("notes", builder().code(":notes:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f3b6.png").build());
        dictionary.put("musical_note", builder().code(":musical_note:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f3b5.png").build());
        dictionary.put("fire", builder().code(":fire:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f525.png").build());
        dictionary.put("hankey", builder().code(":hankey:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a9.png").build());
        dictionary.put("poop", builder().code(":poop:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a9.png").build());
        dictionary.put("shit", builder().code(":shit:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a9.png").build());
        dictionary.put("+1", builder().code(":+1:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44d.png").build());
        dictionary.put("thumbsup", builder().code(":thumbsup:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44d.png").build());
        dictionary.put("-1", builder().code(":-1:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44e.png").build());
        dictionary.put("thumbsdown", builder().code(":thumbsdown:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44e.png").build());
        dictionary.put("ok_hand", builder().code(":ok_hand:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44c.png").build());
        dictionary.put("punch", builder().code(":punch:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44a.png").build());
        dictionary.put("facepunch", builder().code(":facepunch:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44a.png").build());
        dictionary.put("fist", builder().code(":fist:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/270a.png").build());
        dictionary.put("v", builder().code(":v:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/270c.png").build());
        dictionary.put("wave", builder().code(":wave:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44b.png").build());
        dictionary.put("hand", builder().code(":hand:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/270b.png").build());
        dictionary.put("raised_hand", builder().code(":raised_hand:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/270b.png").build());
        dictionary.put("open_hands", builder().code(":open_hands:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f450.png").build());
        dictionary.put("point_up", builder().code(":point_up:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/261d.png").build());
        dictionary.put("point_down", builder().code(":point_down:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f447.png").build());
        dictionary.put("point_left", builder().code(":point_left:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f448.png").build());
        dictionary.put("point_right", builder().code(":point_right:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f449.png").build());
        dictionary.put("raised_hands", builder().code(":raised_hands:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f64c.png").build());
        dictionary.put("pray", builder().code(":pray:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f64f.png").build());
        dictionary.put("point_up_2", builder().code(":point_up_2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f446.png").build());
        dictionary.put("clap", builder().code(":clap:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f44f.png").build());
        dictionary.put("muscle", builder().code(":muscle:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4aa.png").build());
        dictionary.put("metal", builder().code(":metal:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f918.png").build());
        dictionary.put("fu", builder().code(":fu:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f595.png").build());
        dictionary.put("walking", builder().code(":walking:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f6b6.png").build());
        dictionary.put("runner", builder().code(":runner:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f3c3.png").build());
        dictionary.put("running", builder().code(":running:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f3c3.png").build());
        dictionary.put("couple", builder().code(":couple:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f46b.png").build());
        dictionary.put("family", builder().code(":family:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f46a.png").build());
        dictionary.put("two_men_holding_hands", builder().code(":two_men_holding_hands:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f46c.png").build());
        dictionary.put("two_women_holding_hands", builder().code(":two_women_holding_hands:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f46d.png").build());
        dictionary.put("dancer", builder().code(":dancer:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f483.png").build());
        dictionary.put("dancers", builder().code(":dancers:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f46f.png").build());
        dictionary.put("ok_woman", builder().code(":ok_woman:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f646-2640.png").build());
        dictionary.put("no_good", builder().code(":no_good:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f645.png").build());
        dictionary.put("information_desk_person", builder().code(":information_desk_person:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f481.png").build());
        dictionary.put("raising_hand", builder().code(":raising_hand:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f64b.png").build());
        dictionary.put("bride_with_veil", builder().code(":bride_with_veil:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f470.png").build());
        dictionary.put("bow", builder().code(":bow:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f647.png").build());
        dictionary.put("couplekiss", builder().code(":couplekiss:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f48f.png").build());
        dictionary.put("couple_with_heart", builder().code(":couple_with_heart:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f491.png").build());
        dictionary.put("massage", builder().code(":massage:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f486.png").build());
        dictionary.put("haircut", builder().code(":haircut:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f487.png").build());
        dictionary.put("nail_care", builder().code(":nail_care:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f485.png").build());
        dictionary.put("boy", builder().code(":boy:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f466.png").build());
        dictionary.put("girl", builder().code(":girl:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f467.png").build());
        dictionary.put("woman", builder().code(":woman:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f469.png").build());
        dictionary.put("man", builder().code(":man:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f468.png").build());
        dictionary.put("baby", builder().code(":baby:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f476.png").build());
        dictionary.put("older_woman", builder().code(":older_woman:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f475.png").build());
        dictionary.put("older_man", builder().code(":older_man:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f474.png").build());
        dictionary.put("man_with_gua_pi_mao", builder().code(":man_with_gua_pi_mao:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f472.png").build());
        dictionary.put("man_with_turban", builder().code(":man_with_turban:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f473-2642.png").build());
        dictionary.put("construction_worker", builder().code(":construction_worker:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f477.png").build());
        dictionary.put("cop", builder().code(":cop:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f46e.png").build());
        dictionary.put("angel", builder().code(":angel:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f47c.png").build());
        dictionary.put("princess", builder().code(":princess:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f478.png").build());
        dictionary.put("smiley_cat", builder().code(":smiley_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f63a.png").build());
        dictionary.put("smile_cat", builder().code(":smile_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f638.png").build());
        dictionary.put("heart_eyes_cat", builder().code(":heart_eyes_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f63b.png").build());
        dictionary.put("kissing_cat", builder().code(":kissing_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f63d.png").build());
        dictionary.put("smirk_cat", builder().code(":smirk_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f63c.png").build());
        dictionary.put("scream_cat", builder().code(":scream_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f640.png").build());
        dictionary.put("crying_cat_face", builder().code(":crying_cat_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f63f.png").build());
        dictionary.put("joy_cat", builder().code(":joy_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f639.png").build());
        dictionary.put("pouting_cat", builder().code(":pouting_cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f63e.png").build());
        dictionary.put("japanese_ogre", builder().code(":japanese_ogre:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f479.png").build());
        dictionary.put("japanese_goblin", builder().code(":japanese_goblin:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f47a.png").build());
        dictionary.put("see_no_evil", builder().code(":see_no_evil:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f648.png").build());
        dictionary.put("hear_no_evil", builder().code(":hear_no_evil:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f649.png").build());
        dictionary.put("speak_no_evil", builder().code(":speak_no_evil:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f64a.png").build());
        dictionary.put("guardsman", builder().code(":guardsman:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f482-2642.png").build());
        dictionary.put("skull", builder().code(":skull:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f480.png").build());
        dictionary.put("feet", builder().code(":feet:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f43e.png").build());
        dictionary.put("lips", builder().code(":lips:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f444.png").build());
        dictionary.put("kiss", builder().code(":kiss:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f48b.png").build());
        dictionary.put("droplet", builder().code(":droplet:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4a7.png").build());
        dictionary.put("ear", builder().code(":ear:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f442.png").build());
        dictionary.put("eyes", builder().code(":eyes:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f440.png").build());
        dictionary.put("nose", builder().code(":nose:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f443.png").build());
        dictionary.put("tongue", builder().code(":tongue:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f445.png").build());
        dictionary.put("love_letter", builder().code(":love_letter:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f48c.png").build());
        dictionary.put("bust_in_silhouette", builder().code(":bust_in_silhouette:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f464.png").build());
        dictionary.put("busts_in_silhouette", builder().code(":busts_in_silhouette:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f465.png").build());
        dictionary.put("speech_balloon", builder().code(":speech_balloon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4ac.png").build());
        dictionary.put("thought_balloon", builder().code(":thought_balloon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f4ad.png").build());
        dictionary.put("feelsgood", builder().code(":feelsgood:").imageUrl("https://github.githubassets.com/images/icons/emoji/feelsgood.png").build());
        dictionary.put("finnadie", builder().code(":finnadie:").imageUrl("https://github.githubassets.com/images/icons/emoji/finnadie.png").build());
        dictionary.put("goberserk", builder().code(":goberserk:").imageUrl("https://github.githubassets.com/images/icons/emoji/goberserk.png").build());
        dictionary.put("godmode", builder().code(":godmode:").imageUrl("https://github.githubassets.com/images/icons/emoji/godmode.png").build());
        dictionary.put("hurtrealbad", builder().code(":hurtrealbad:").imageUrl("https://github.githubassets.com/images/icons/emoji/hurtrealbad.png").build());
        dictionary.put("rage1", builder().code(":rage1:").imageUrl("https://github.githubassets.com/images/icons/emoji/rage1.png").build());
        dictionary.put("rage2", builder().code(":rage2:").imageUrl("https://github.githubassets.com/images/icons/emoji/rage2.png").build());
        dictionary.put("rage3", builder().code(":rage3:").imageUrl("https://github.githubassets.com/images/icons/emoji/rage3.png").build());
        dictionary.put("rage4", builder().code(":rage4:").imageUrl("https://github.githubassets.com/images/icons/emoji/rage4.png").build());
        dictionary.put("suspect", builder().code(":suspect:").imageUrl("https://github.githubassets.com/images/icons/emoji/suspect.png").build());
        dictionary.put("trollface", builder().code(":trollface:").imageUrl("https://github.githubassets.com/images/icons/emoji/trollface.png").build());
        dictionary.put("snowflake", builder().code(":snowflake:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/2744.png").build());
        dictionary.put("snowman", builder().code(":snowman:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/26c4.png").build());
        dictionary.put("zap", builder().code(":zap:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/26a1.png").build());
        dictionary.put("cyclone", builder().code(":cyclone:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f300.png").build());
        dictionary.put("foggy", builder().code(":foggy:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f301.png").build());
        dictionary.put("ocean", builder().code(":ocean:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f30a.png").build());
        dictionary.put("cat", builder().code(":cat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f431.png").build());
        dictionary.put("dog", builder().code(":dog:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f436.png").build());
        dictionary.put("mouse", builder().code(":mouse:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f42d.png").build());
        dictionary.put("hamster", builder().code(":hamster:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f439.png").build());
        dictionary.put("rabbit", builder().code(":rabbit:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f430.png").build());
        dictionary.put("wolf", builder().code(":wolf:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f43a.png").build());
        dictionary.put("frog", builder().code(":frog:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f438.png").build());
        dictionary.put("tiger", builder().code(":tiger:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f42f.png").build());
        dictionary.put("koala", builder().code(":koala:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f428.png").build());
        dictionary.put("bear", builder().code(":bear:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f43b.png").build());
        dictionary.put("pig", builder().code(":pig:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f437.png").build());
        dictionary.put("pig_nose", builder().code(":pig_nose:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f43d.png").build());
        dictionary.put("cow", builder().code(":cow:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f42e.png").build());
        dictionary.put("boar", builder().code(":boar:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f417.png").build());
        dictionary.put("monkey_face", builder().code(":monkey_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f435.png").build());
        dictionary.put("monkey", builder().code(":monkey:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f412.png").build());
        dictionary.put("horse", builder().code(":horse:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f434.png").build());
        dictionary.put("racehorse", builder().code(":racehorse:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f40e.png").build());
        dictionary.put("camel", builder().code(":camel:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f42b.png").build());
        dictionary.put("sheep", builder().code(":sheep:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f411.png").build());
        dictionary.put("elephant", builder().code(":elephant:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f418.png").build());
        dictionary.put("panda_face", builder().code(":panda_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f43c.png").build());
        dictionary.put("snake", builder().code(":snake:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f40d.png").build());
        dictionary.put("bird", builder().code(":bird:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f426.png").build());
        dictionary.put("baby_chick", builder().code(":baby_chick:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f424.png").build());
        dictionary.put("hatched_chick", builder().code(":hatched_chick:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f425.png").build());
        dictionary.put("hatching_chick", builder().code(":hatching_chick:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f423.png").build());
        dictionary.put("chicken", builder().code(":chicken:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f414.png").build());
        dictionary.put("penguin", builder().code(":penguin:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f427.png").build());
        dictionary.put("turtle", builder().code(":turtle:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f422.png").build());
        dictionary.put("bug", builder().code(":bug:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f41b.png").build());
        dictionary.put("honeybee", builder().code(":honeybee:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f41d.png").build());
        dictionary.put("ant", builder().code(":ant:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f41c.png").build());
        dictionary.put("beetle", builder().code(":beetle:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f41e.png").build());
        dictionary.put("snail", builder().code(":snail:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f40c.png").build());
        dictionary.put("octopus", builder().code(":octopus:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f419.png").build());
        dictionary.put("tropical_fish", builder().code(":tropical_fish:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f420.png").build());
        dictionary.put("fish", builder().code(":fish:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f41f.png").build());
        dictionary.put("whale", builder().code(":whale:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f433.png").build());
        dictionary.put("whale2", builder().code(":whale2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f40b.png").build());
        dictionary.put("dolphin", builder().code(":dolphin:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f42c.png").build());
        dictionary.put("cow2", builder().code(":cow2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f404.png").build());
        dictionary.put("ram", builder().code(":ram:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f40f.png").build());
        dictionary.put("rat", builder().code(":rat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f400.png").build());
        dictionary.put("water_buffalo", builder().code(":water_buffalo:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f403.png").build());
        dictionary.put("tiger2", builder().code(":tiger2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f405.png").build());
        dictionary.put("rabbit2", builder().code(":rabbit2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f407.png").build());
        dictionary.put("dragon", builder().code(":dragon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f409.png").build());
        dictionary.put("goat", builder().code(":goat:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f410.png").build());
        dictionary.put("rooster", builder().code(":rooster:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f413.png").build());
        dictionary.put("dog2", builder().code(":dog2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f415.png").build());
        dictionary.put("pig2", builder().code(":pig2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f416.png").build());
        dictionary.put("mouse2", builder().code(":mouse2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f401.png").build());
        dictionary.put("ox", builder().code(":ox:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f402.png").build());
        dictionary.put("dragon_face", builder().code(":dragon_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f432.png").build());
        dictionary.put("blowfish", builder().code(":blowfish:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f421.png").build());
        dictionary.put("crocodile", builder().code(":crocodile:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f40a.png").build());
        dictionary.put("dromedary_camel", builder().code(":dromedary_camel:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f42a.png").build());
        dictionary.put("leopard", builder().code(":leopard:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f406.png").build());
        dictionary.put("cat2", builder().code(":cat2:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f408.png").build());
        dictionary.put("poodle", builder().code(":poodle:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f429.png").build());
        dictionary.put("paw_prints", builder().code(":paw_prints:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f43e.png").build());
        dictionary.put("bouquet", builder().code(":bouquet:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f490.png").build());
        dictionary.put("cherry_blossom", builder().code(":cherry_blossom:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f338.png").build());
        dictionary.put("tulip", builder().code(":tulip:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f337.png").build());
        dictionary.put("four_leaf_clover", builder().code(":four_leaf_clover:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f340.png").build());
        dictionary.put("rose", builder().code(":rose:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f339.png").build());
        dictionary.put("sunflower", builder().code(":sunflower:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f33b.png").build());
        dictionary.put("hibiscus", builder().code(":hibiscus:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f33a.png").build());
        dictionary.put("maple_leaf", builder().code(":maple_leaf:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f341.png").build());
        dictionary.put("leaves", builder().code(":leaves:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f343.png").build());
        dictionary.put("fallen_leaf", builder().code(":fallen_leaf:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f342.png").build());
        dictionary.put("herb", builder().code(":herb:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f33f.png").build());
        dictionary.put("mushroom", builder().code(":mushroom:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f344.png").build());
        dictionary.put("cactus", builder().code(":cactus:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f335.png").build());
        dictionary.put("palm_tree", builder().code(":palm_tree:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f334.png").build());
        dictionary.put("evergreen_tree", builder().code(":evergreen_tree:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f332.png").build());
        dictionary.put("deciduous_tree", builder().code(":deciduous_tree:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f333.png").build());
        dictionary.put("chestnut", builder().code(":chestnut:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f330.png").build());
        dictionary.put("seedling", builder().code(":seedling:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f331.png").build());
        dictionary.put("blossom", builder().code(":blossom:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f33c.png").build());
        dictionary.put("ear_of_rice", builder().code(":ear_of_rice:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f33e.png").build());
        dictionary.put("shell", builder().code(":shell:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f41a.png").build());
        dictionary.put("globe_with_meridians", builder().code(":globe_with_meridians:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f310.png").build());
        dictionary.put("sun_with_face", builder().code(":sun_with_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f31e.png").build());
        dictionary.put("full_moon_with_face", builder().code(":full_moon_with_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f31d.png").build());
        dictionary.put("new_moon_with_face", builder().code(":new_moon_with_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f31a.png").build());
        dictionary.put("new_moon", builder().code(":new_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f311.png").build());
        dictionary.put("waxing_crescent_moon", builder().code(":waxing_crescent_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f312.png").build());
        dictionary.put("first_quarter_moon", builder().code(":first_quarter_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f313.png").build());
        dictionary.put("waxing_gibbous_moon", builder().code(":waxing_gibbous_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f314.png").build());
        dictionary.put("full_moon", builder().code(":full_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f315.png").build());
        dictionary.put("waning_gibbous_moon", builder().code(":waning_gibbous_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f316.png").build());
        dictionary.put("last_quarter_moon", builder().code(":last_quarter_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f317.png").build());
        dictionary.put("waning_crescent_moon", builder().code(":waning_crescent_moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f318.png").build());
        dictionary.put("last_quarter_moon_with_face", builder().code(":last_quarter_moon_with_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f31c.png").build());
        dictionary.put("first_quarter_moon_with_face", builder().code(":first_quarter_moon_with_face:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f31b.png").build());
        dictionary.put("moon", builder().code(":moon:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f314.png").build());
        dictionary.put("earth_africa", builder().code(":earth_africa:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f30d.png").build());
        dictionary.put("earth_americas", builder().code(":earth_americas:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f30e.png").build());
        dictionary.put("earth_asia", builder().code(":earth_asia:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f30f.png").build());
        dictionary.put("volcano", builder().code(":volcano:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/1f30b.png").build());
        dictionary.put("milky_way", builder().code(":milky_way:").imageUrl("").build());
        dictionary.put("partly_sunny", builder().code(":partly_sunny:").imageUrl("https://github.githubassets.com/images/icons/emoji/unicode/26c5.png").build());
        dictionary.put("octocat", builder().code(":octocat:").imageUrl("https://github.githubassets.com/images/icons/emoji/octocat.png").build());
    }

    public static List<Emoji> find(String name) {
        Objects.requireNonNull(name, "Name is mandatory");
        return dictionary.entrySet().stream()
                .filter(e -> e.getKey().contains(name.toLowerCase()))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
    }

    public static List<Emoji> all() {
        return dictionary.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
    }

    public static Emoji frowning(){
        return dictionary.get("frowning");
    }
    public static Emoji yellow_heart(){
        return dictionary.get("yellow_heart");
    }
    public static Emoji droplet(){
        return dictionary.get("droplet");
    }
    public static Emoji speech_balloon(){
        return dictionary.get("speech_balloon");
    }
    public static Emoji octopus(){
        return dictionary.get("octopus");
    }
    public static Emoji innocent(){
        return dictionary.get("innocent");
    }
    public static Emoji scream(){
        return dictionary.get("scream");
    }
    public static Emoji smile_cat(){
        return dictionary.get("smile_cat");
    }
    public static Emoji kiss(){
        return dictionary.get("kiss");
    }
    public static Emoji flushed(){
        return dictionary.get("flushed");
    }
    public static Emoji goberserk(){
        return dictionary.get("goberserk");
    }
    public static Emoji panda_face(){
        return dictionary.get("panda_face");
    }
    public static Emoji last_quarter_moon(){
        return dictionary.get("last_quarter_moon");
    }
    public static Emoji last_quarter_moon_with_face(){
        return dictionary.get("last_quarter_moon_with_face");
    }
    public static Emoji poop(){
        return dictionary.get("poop");
    }
    public static Emoji rabbit(){
        return dictionary.get("rabbit");
    }
    public static Emoji fire(){
        return dictionary.get("fire");
    }
    public static Emoji runner(){
        return dictionary.get("runner");
    }
    public static Emoji mushroom(){
        return dictionary.get("mushroom");
    }
    public static Emoji two_hearts(){
        return dictionary.get("two_hearts");
    }
    public static Emoji smiley(){
        return dictionary.get("smiley");
    }
    public static Emoji ram(){
        return dictionary.get("ram");
    }
    public static Emoji sunglasses(){
        return dictionary.get("sunglasses");
    }
    public static Emoji point_left(){
        return dictionary.get("point_left");
    }
    public static Emoji rat(){
        return dictionary.get("rat");
    }
    public static Emoji hamster(){
        return dictionary.get("hamster");
    }
    public static Emoji zap(){
        return dictionary.get("zap");
    }
    public static Emoji couple_with_heart(){
        return dictionary.get("couple_with_heart");
    }
    public static Emoji cow2(){
        return dictionary.get("cow2");
    }
    public static Emoji bust_in_silhouette(){
        return dictionary.get("bust_in_silhouette");
    }
    public static Emoji angry(){
        return dictionary.get("angry");
    }
    public static Emoji haircut(){
        return dictionary.get("haircut");
    }
    public static Emoji no_mouth(){
        return dictionary.get("no_mouth");
    }
    public static Emoji tiger(){
        return dictionary.get("tiger");
    }
    public static Emoji horse(){
        return dictionary.get("horse");
    }
    public static Emoji ear_of_rice(){
        return dictionary.get("ear_of_rice");
    }
    public static Emoji first_quarter_moon_with_face(){
        return dictionary.get("first_quarter_moon_with_face");
    }
    public static Emoji wink(){
        return dictionary.get("wink");
    }
    public static Emoji sparkling_heart(){
        return dictionary.get("sparkling_heart");
    }
    public static Emoji neckbeard(){
        return dictionary.get("neckbeard");
    }
    public static Emoji tired_face(){
        return dictionary.get("tired_face");
    }
    public static Emoji nail_care(){
        return dictionary.get("nail_care");
    }
    public static Emoji broken_heart(){
        return dictionary.get("broken_heart");
    }
    public static Emoji hatched_chick(){
        return dictionary.get("hatched_chick");
    }
    public static Emoji fist(){
        return dictionary.get("fist");
    }
    public static Emoji eyes(){
        return dictionary.get("eyes");
    }
    public static Emoji open_mouth(){
        return dictionary.get("open_mouth");
    }
    public static Emoji pig2(){
        return dictionary.get("pig2");
    }
    public static Emoji sweat_smile(){
        return dictionary.get("sweat_smile");
    }
    public static Emoji new_moon(){
        return dictionary.get("new_moon");
    }
    public static Emoji anguished(){
        return dictionary.get("anguished");
    }
    public static Emoji partly_sunny(){
        return dictionary.get("partly_sunny");
    }
    public static Emoji cactus(){
        return dictionary.get("cactus");
    }
    public static Emoji dog2(){
        return dictionary.get("dog2");
    }
    public static Emoji worried(){
        return dictionary.get("worried");
    }
    public static Emoji volcano(){
        return dictionary.get("volcano");
    }
    public static Emoji hushed(){
        return dictionary.get("hushed");
    }
    public static Emoji hand(){
        return dictionary.get("hand");
    }
    public static Emoji palm_tree(){
        return dictionary.get("palm_tree");
    }
    public static Emoji see_no_evil(){
        return dictionary.get("see_no_evil");
    }
    public static Emoji triumph(){
        return dictionary.get("triumph");
    }
    public static Emoji point_up(){
        return dictionary.get("point_up");
    }
    public static Emoji star(){
        return dictionary.get("star");
    }
    public static Emoji wolf(){
        return dictionary.get("wolf");
    }
    public static Emoji weary(){
        return dictionary.get("weary");
    }
    public static Emoji stuck_out_tongue(){
        return dictionary.get("stuck_out_tongue");
    }
    public static Emoji pouting_cat(){
        return dictionary.get("pouting_cat");
    }
    public static Emoji speak_no_evil(){
        return dictionary.get("speak_no_evil");
    }
    public static Emoji chestnut(){
        return dictionary.get("chestnut");
    }
    public static Emoji dromedary_camel(){
        return dictionary.get("dromedary_camel");
    }
    public static Emoji sunflower(){
        return dictionary.get("sunflower");
    }
    public static Emoji cupid(){
        return dictionary.get("cupid");
    }
    public static Emoji heart_eyes_cat(){
        return dictionary.get("heart_eyes_cat");
    }
    public static Emoji blowfish(){
        return dictionary.get("blowfish");
    }
    public static Emoji lips(){
        return dictionary.get("lips");
    }
    public static Emoji full_moon_with_face(){
        return dictionary.get("full_moon_with_face");
    }
    public static Emoji shit(){
        return dictionary.get("shit");
    }
    public static Emoji bug(){
        return dictionary.get("bug");
    }
    public static Emoji v(){
        return dictionary.get("v");
    }
    public static Emoji clap(){
        return dictionary.get("clap");
    }
    public static Emoji fish(){
        return dictionary.get("fish");
    }
    public static Emoji smirk_cat(){
        return dictionary.get("smirk_cat");
    }
    public static Emoji astonished(){
        return dictionary.get("astonished");
    }
    public static Emoji penguin(){
        return dictionary.get("penguin");
    }
    public static Emoji mouse2(){
        return dictionary.get("mouse2");
    }
    public static Emoji laughing(){
        return dictionary.get("laughing");
    }
    public static Emoji musical_note(){
        return dictionary.get("musical_note");
    }
    public static Emoji couple(){
        return dictionary.get("couple");
    }
    public static Emoji notes(){
        return dictionary.get("notes");
    }
    public static Emoji point_down(){
        return dictionary.get("point_down");
    }
    public static Emoji dancers(){
        return dictionary.get("dancers");
    }
    public static Emoji dizzy_face(){
        return dictionary.get("dizzy_face");
    }
    public static Emoji exclamation(){
        return dictionary.get("exclamation");
    }
    public static Emoji green_heart(){
        return dictionary.get("green_heart");
    }
    public static Emoji older_woman(){
        return dictionary.get("older_woman");
    }
    public static Emoji kissing_closed_eyes(){
        return dictionary.get("kissing_closed_eyes");
    }
    public static Emoji busts_in_silhouette(){
        return dictionary.get("busts_in_silhouette");
    }
    public static Emoji revolving_hearts(){
        return dictionary.get("revolving_hearts");
    }
    public static Emoji mouse(){
        return dictionary.get("mouse");
    }
    public static Emoji disappointed(){
        return dictionary.get("disappointed");
    }
    public static Emoji leaves(){
        return dictionary.get("leaves");
    }
    public static Emoji hatching_chick(){
        return dictionary.get("hatching_chick");
    }
    public static Emoji blush(){
        return dictionary.get("blush");
    }
    public static Emoji bird(){
        return dictionary.get("bird");
    }
    public static Emoji raised_hand(){
        return dictionary.get("raised_hand");
    }
    public static Emoji dolphin(){
        return dictionary.get("dolphin");
    }
    public static Emoji four_leaf_clover(){
        return dictionary.get("four_leaf_clover");
    }
    public static Emoji love_letter(){
        return dictionary.get("love_letter");
    }
    public static Emoji hankey(){
        return dictionary.get("hankey");
    }
    public static Emoji star2(){
        return dictionary.get("star2");
    }
    public static Emoji grey_exclamation(){
        return dictionary.get("grey_exclamation");
    }
    public static Emoji girl(){
        return dictionary.get("girl");
    }
    public static Emoji waxing_gibbous_moon(){
        return dictionary.get("waxing_gibbous_moon");
    }
    public static Emoji ocean(){
        return dictionary.get("ocean");
    }
    public static Emoji shell(){
        return dictionary.get("shell");
    }
    public static Emoji raised_hands(){
        return dictionary.get("raised_hands");
    }
    public static Emoji tiger2(){
        return dictionary.get("tiger2");
    }
    public static Emoji full_moon(){
        return dictionary.get("full_moon");
    }
    public static Emoji elephant(){
        return dictionary.get("elephant");
    }
    public static Emoji purple_heart(){
        return dictionary.get("purple_heart");
    }
    public static Emoji construction_worker(){
        return dictionary.get("construction_worker");
    }
    public static Emoji crocodile(){
        return dictionary.get("crocodile");
    }
    public static Emoji sparkles(){
        return dictionary.get("sparkles");
    }
    public static Emoji guardsman(){
        return dictionary.get("guardsman");
    }
    public static Emoji smiley_cat(){
        return dictionary.get("smiley_cat");
    }
    public static Emoji boom(){
        return dictionary.get("boom");
    }
    public static Emoji rabbit2(){
        return dictionary.get("rabbit2");
    }
    public static Emoji older_man(){
        return dictionary.get("older_man");
    }
    public static Emoji sleeping(){
        return dictionary.get("sleeping");
    }
    public static Emoji wave(){
        return dictionary.get("wave");
    }
    public static Emoji fu(){
        return dictionary.get("fu");
    }
    public static Emoji yum(){
        return dictionary.get("yum");
    }
    public static Emoji finnadie(){
        return dictionary.get("finnadie");
    }
    public static Emoji hibiscus(){
        return dictionary.get("hibiscus");
    }
    public static Emoji sleepy(){
        return dictionary.get("sleepy");
    }
    public static Emoji whale2(){
        return dictionary.get("whale2");
    }
    public static Emoji mask(){
        return dictionary.get("mask");
    }
    public static Emoji ok_woman(){
        return dictionary.get("ok_woman");
    }
    public static Emoji tulip(){
        return dictionary.get("tulip");
    }
    public static Emoji seedling(){
        return dictionary.get("seedling");
    }
    public static Emoji cold_sweat(){
        return dictionary.get("cold_sweat");
    }
    public static Emoji rage1(){
        return dictionary.get("rage1");
    }
    public static Emoji rage2(){
        return dictionary.get("rage2");
    }
    public static Emoji sun_with_face(){
        return dictionary.get("sun_with_face");
    }
    public static Emoji rage3(){
        return dictionary.get("rage3");
    }
    public static Emoji japanese_goblin(){
        return dictionary.get("japanese_goblin");
    }
    public static Emoji rage4(){
        return dictionary.get("rage4");
    }
    public static Emoji stuck_out_tongue_winking_eye(){
        return dictionary.get("stuck_out_tongue_winking_eye");
    }
    public static Emoji sweat(){
        return dictionary.get("sweat");
    }
    public static Emoji baby(){
        return dictionary.get("baby");
    }
    public static Emoji family(){
        return dictionary.get("family");
    }
    public static Emoji heartbeat(){
        return dictionary.get("heartbeat");
    }
    public static Emoji hear_no_evil(){
        return dictionary.get("hear_no_evil");
    }
    public static Emoji waxing_crescent_moon(){
        return dictionary.get("waxing_crescent_moon");
    }
    public static Emoji feelsgood(){
        return dictionary.get("feelsgood");
    }
    public static Emoji dragon(){
        return dictionary.get("dragon");
    }
    public static Emoji point_right(){
        return dictionary.get("point_right");
    }
    public static Emoji boar(){
        return dictionary.get("boar");
    }
    public static Emoji heartpulse(){
        return dictionary.get("heartpulse");
    }
    public static Emoji kissing(){
        return dictionary.get("kissing");
    }
    public static Emoji camel(){
        return dictionary.get("camel");
    }
    public static Emoji maple_leaf(){
        return dictionary.get("maple_leaf");
    }
    public static Emoji information_desk_person(){
        return dictionary.get("information_desk_person");
    }
    public static Emoji princess(){
        return dictionary.get("princess");
    }
    public static Emoji satisfied(){
        return dictionary.get("satisfied");
    }
    public static Emoji dizzy(){
        return dictionary.get("dizzy");
    }
    public static Emoji ok_hand(){
        return dictionary.get("ok_hand");
    }
    public static Emoji metal(){
        return dictionary.get("metal");
    }
    public static Emoji goat(){
        return dictionary.get("goat");
    }
    public static Emoji man_with_gua_pi_mao(){
        return dictionary.get("man_with_gua_pi_mao");
    }
    public static Emoji dancer(){
        return dictionary.get("dancer");
    }
    public static Emoji man_with_turban(){
        return dictionary.get("man_with_turban");
    }
    public static Emoji leopard(){
        return dictionary.get("leopard");
    }
    public static Emoji cat2(){
        return dictionary.get("cat2");
    }
    public static Emoji moon(){
        return dictionary.get("moon");
    }
    public static Emoji earth_americas(){
        return dictionary.get("earth_americas");
    }
    public static Emoji globe_with_meridians(){
        return dictionary.get("globe_with_meridians");
    }
    public static Emoji cherry_blossom(){
        return dictionary.get("cherry_blossom");
    }
    public static Emoji zzz(){
        return dictionary.get("zzz");
    }
    public static Emoji water_buffalo(){
        return dictionary.get("water_buffalo");
    }
    public static Emoji japanese_ogre(){
        return dictionary.get("japanese_ogre");
    }
    public static Emoji couplekiss(){
        return dictionary.get("couplekiss");
    }
    public static Emoji dog(){
        return dictionary.get("dog");
    }
    public static Emoji monkey_face(){
        return dictionary.get("monkey_face");
    }
    public static Emoji open_hands(){
        return dictionary.get("open_hands");
    }
    public static Emoji expressionless(){
        return dictionary.get("expressionless");
    }
    public static Emoji confounded(){
        return dictionary.get("confounded");
    }
    public static Emoji woman(){
        return dictionary.get("woman");
    }
    public static Emoji tongue(){
        return dictionary.get("tongue");
    }
    public static Emoji trollface(){
        return dictionary.get("trollface");
    }
    public static Emoji pensive(){
        return dictionary.get("pensive");
    }
    public static Emoji alien(){
        return dictionary.get("alien");
    }
    public static Emoji tropical_fish(){
        return dictionary.get("tropical_fish");
    }
    public static Emoji smirk(){
        return dictionary.get("smirk");
    }
    public static Emoji punch(){
        return dictionary.get("punch");
    }
    public static Emoji unamused(){
        return dictionary.get("unamused");
    }
    public static Emoji grimacing(){
        return dictionary.get("grimacing");
    }
    public static Emoji evergreen_tree(){
        return dictionary.get("evergreen_tree");
    }
    public static Emoji ear(){
        return dictionary.get("ear");
    }
    public static Emoji man(){
        return dictionary.get("man");
    }
    public static Emoji raising_hand(){
        return dictionary.get("raising_hand");
    }
    public static Emoji relieved(){
        return dictionary.get("relieved");
    }
    public static Emoji smiling_imp(){
        return dictionary.get("smiling_imp");
    }
    public static Emoji grin(){
        return dictionary.get("grin");
    }
    public static Emoji snowflake(){
        return dictionary.get("snowflake");
    }
    public static Emoji first_quarter_moon(){
        return dictionary.get("first_quarter_moon");
    }
    public static Emoji question(){
        return dictionary.get("question");
    }
    public static Emoji two_men_holding_hands(){
        return dictionary.get("two_men_holding_hands");
    }
    public static Emoji plus1(){
        return dictionary.get("+1");
    }
    public static Emoji suspect(){
        return dictionary.get("suspect");
    }
    public static Emoji kissing_cat(){
        return dictionary.get("kissing_cat");
    }
    public static Emoji rage(){
        return dictionary.get("rage");
    }
    public static Emoji waning_crescent_moon(){
        return dictionary.get("waning_crescent_moon");
    }
    public static Emoji rose(){
        return dictionary.get("rose");
    }
    public static Emoji octocat(){
        return dictionary.get("octocat");
    }
    public static Emoji joy_cat(){
        return dictionary.get("joy_cat");
    }
    public static Emoji persevere(){
        return dictionary.get("persevere");
    }
    public static Emoji bride_with_veil(){
        return dictionary.get("bride_with_veil");
    }
    public static Emoji crying_cat_face(){
        return dictionary.get("crying_cat_face");
    }
    public static Emoji feet(){
        return dictionary.get("feet");
    }
    public static Emoji snail(){
        return dictionary.get("snail");
    }
    public static Emoji snowman(){
        return dictionary.get("snowman");
    }
    public static Emoji monkey(){
        return dictionary.get("monkey");
    }
    public static Emoji cop(){
        return dictionary.get("cop");
    }
    public static Emoji sob(){
        return dictionary.get("sob");
    }
    public static Emoji grinning(){
        return dictionary.get("grinning");
    }
    public static Emoji cow(){
        return dictionary.get("cow");
    }
    public static Emoji angel(){
        return dictionary.get("angel");
    }
    public static Emoji anger(){
        return dictionary.get("anger");
    }
    public static Emoji dragon_face(){
        return dictionary.get("dragon_face");
    }
    public static Emoji sweat_drops(){
        return dictionary.get("sweat_drops");
    }
    public static Emoji pray(){
        return dictionary.get("pray");
    }
    public static Emoji cyclone(){
        return dictionary.get("cyclone");
    }
    public static Emoji smile(){
        return dictionary.get("smile");
    }
    public static Emoji neutral_face(){
        return dictionary.get("neutral_face");
    }
    public static Emoji pig(){
        return dictionary.get("pig");
    }
    public static Emoji confused(){
        return dictionary.get("confused");
    }
    public static Emoji fallen_leaf(){
        return dictionary.get("fallen_leaf");
    }
    public static Emoji frog(){
        return dictionary.get("frog");
    }
    public static Emoji whale(){
        return dictionary.get("whale");
    }
    public static Emoji bear(){
        return dictionary.get("bear");
    }
    public static Emoji massage(){
        return dictionary.get("massage");
    }
    public static Emoji deciduous_tree(){
        return dictionary.get("deciduous_tree");
    }
    public static Emoji minus1(){
        return dictionary.get("-1");
    }
    public static Emoji turtle(){
        return dictionary.get("turtle");
    }
    public static Emoji koala(){
        return dictionary.get("koala");
    }
    public static Emoji point_up_2(){
        return dictionary.get("point_up_2");
    }
    public static Emoji two_women_holding_hands(){
        return dictionary.get("two_women_holding_hands");
    }
    public static Emoji facepunch(){
        return dictionary.get("facepunch");
    }
    public static Emoji bouquet(){
        return dictionary.get("bouquet");
    }
    public static Emoji honeybee(){
        return dictionary.get("honeybee");
    }
    public static Emoji heart(){
        return dictionary.get("heart");
    }
    public static Emoji heart_eyes(){
        return dictionary.get("heart_eyes");
    }
    public static Emoji collision(){
        return dictionary.get("collision");
    }
    public static Emoji baby_chick(){
        return dictionary.get("baby_chick");
    }
    public static Emoji thought_balloon(){
        return dictionary.get("thought_balloon");
    }
    public static Emoji racehorse(){
        return dictionary.get("racehorse");
    }
    public static Emoji earth_africa(){
        return dictionary.get("earth_africa");
    }
    public static Emoji no_good(){
        return dictionary.get("no_good");
    }
    public static Emoji dash(){
        return dictionary.get("dash");
    }
    public static Emoji thumbsdown(){
        return dictionary.get("thumbsdown");
    }
    public static Emoji chicken(){
        return dictionary.get("chicken");
    }
    public static Emoji scream_cat(){
        return dictionary.get("scream_cat");
    }
    public static Emoji pig_nose(){
        return dictionary.get("pig_nose");
    }
    public static Emoji snake(){
        return dictionary.get("snake");
    }
    public static Emoji bow(){
        return dictionary.get("bow");
    }
    public static Emoji imp(){
        return dictionary.get("imp");
    }
    public static Emoji boy(){
        return dictionary.get("boy");
    }
    public static Emoji relaxed(){
        return dictionary.get("relaxed");
    }
    public static Emoji running(){
        return dictionary.get("running");
    }
    public static Emoji beetle(){
        return dictionary.get("beetle");
    }
    public static Emoji stuck_out_tongue_closed_eyes(){
        return dictionary.get("stuck_out_tongue_closed_eyes");
    }
    public static Emoji joy(){
        return dictionary.get("joy");
    }
    public static Emoji walking(){
        return dictionary.get("walking");
    }
    public static Emoji muscle(){
        return dictionary.get("muscle");
    }
    public static Emoji cat(){
        return dictionary.get("cat");
    }
    public static Emoji skull(){
        return dictionary.get("skull");
    }
    public static Emoji hurtrealbad(){
        return dictionary.get("hurtrealbad");
    }
    public static Emoji thumbsup(){
        return dictionary.get("thumbsup");
    }
    public static Emoji paw_prints(){
        return dictionary.get("paw_prints");
    }
    public static Emoji herb(){
        return dictionary.get("herb");
    }
    public static Emoji sheep(){
        return dictionary.get("sheep");
    }
    public static Emoji godmode(){
        return dictionary.get("godmode");
    }
    public static Emoji kissing_smiling_eyes(){
        return dictionary.get("kissing_smiling_eyes");
    }
    public static Emoji nose(){
        return dictionary.get("nose");
    }
    public static Emoji blue_heart(){
        return dictionary.get("blue_heart");
    }
    public static Emoji foggy(){
        return dictionary.get("foggy");
    }
    public static Emoji rooster(){
        return dictionary.get("rooster");
    }
    public static Emoji milky_way(){
        return dictionary.get("milky_way");
    }
    public static Emoji poodle(){
        return dictionary.get("poodle");
    }
    public static Emoji blossom(){
        return dictionary.get("blossom");
    }
    public static Emoji disappointed_relieved(){
        return dictionary.get("disappointed_relieved");
    }
    public static Emoji ant(){
        return dictionary.get("ant");
    }
    public static Emoji ox(){
        return dictionary.get("ox");
    }
    public static Emoji cry(){
        return dictionary.get("cry");
    }
    public static Emoji fearful(){
        return dictionary.get("fearful");
    }
    public static Emoji grey_question(){
        return dictionary.get("grey_question");
    }
    public static Emoji new_moon_with_face(){
        return dictionary.get("new_moon_with_face");
    }
    public static Emoji waning_gibbous_moon(){
        return dictionary.get("waning_gibbous_moon");
    }
    public static Emoji earth_asia(){
        return dictionary.get("earth_asia");
    }

    public static Emoji bowtie() {
        return dictionary.get("bowtie");
    }

    private static EmojiBuilder builder() {
        return new EmojiBuilder();
    }

    private static class EmojiBuilder {
        private String code;
        private String imageUrl;

        public EmojiBuilder code(String code) {
            this.code = code;
            return this;
        }

        public EmojiBuilder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Emoji build() {
            return new Emoji(code, imageUrl);
        }
    }
}
