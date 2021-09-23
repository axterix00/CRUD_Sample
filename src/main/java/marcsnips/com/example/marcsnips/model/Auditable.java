package marcsnips.com.example.marcsnips.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U>{
    @CreatedBy
    @Column(name = "created_by")
    private U created_by;

    @CreatedDate
    @Column(name = "created_on")
    private LocalDateTime created_on;

    @LastModifiedBy
    @Column(name = "modified_by")
    private U modified_by;

    @LastModifiedDate
    @Column(name = "modified_on")
    private LocalDateTime modified_on;
}
