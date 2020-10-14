# Emojis
Simple Java library for use emojis :smile:

## Examples
1. Use an emoji
```java
Emoji bowtie = Emoji.bowtie();

System.out.println("Code: " + bowtie.getCode()); // :bowtie:
System.out.println("Icon: " + bowtie.getImageUrl()); // https://github.githubassets.com/images/icons/emoji/bowtie.png
```

2. Find an emoji
```java
List<Emoji> man = Emoji.find("man"); // Return a list of Emijis when name contains "man"
```

3. List all Emojis
```java
Emoji.all().stream().forEach(System.out::println); // Show all Emojis available
```