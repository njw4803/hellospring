package hello.hellospring.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY DB가 자동으로 생성해줌
    private Long id;

    //@Column(name = "username") // 컬럼이름 값을 넣어주면 된다.
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
