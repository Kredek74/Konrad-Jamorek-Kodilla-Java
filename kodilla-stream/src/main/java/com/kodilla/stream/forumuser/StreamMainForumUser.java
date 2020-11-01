package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainForumUser {
    public static void main(String[] args) {

        List<ForumUser> forumUserList = new Forum().getUserList();
        Map<Integer, ForumUser> resultMap;

        resultMap = forumUserList.stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getPublishedPosts() >= 1)
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));

        resultMap.entrySet().stream().map(entry -> entry.getKey() + " " + entry.getValue()).forEach(System.out::println);
    }
}
