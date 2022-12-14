package com.mylog.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ToString
public class PostCreate {

    @NotBlank(message = "타이틀을 입력해주세요.")
    private final String title;

    @NotBlank(message = "컨텐츠를 입력해주세요.")
    private final String content;

    @Builder
    public PostCreate(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public PostCreate changeTitle(String title) {
        return PostCreate.builder()
                .title(title)
                .content(content)
                .build();
    }

    public PostCreate changeContent(String content) {
        return PostCreate.builder()
                .title(title)
                .content(content)
                .build();
    }

    // 빌더의 장점
    // - 가독성에 좋다.
    // - 값 생성에 대한 유연함
    // - 필요한 값만 받을 수 있다. -> 생성자 오버로딩 ?
    // - 객체 불변성

}
