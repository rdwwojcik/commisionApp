package commision.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseImportFileEntity {

    @Id
    @NotNull
//    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq_file_data")
//    @SequenceGenerator(name="seq_file_data", sequenceName="seq_file_data")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_naglowka")
    private FileEntity fileEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FileEntity getFileEntity() {
        return fileEntity;
    }

    public void setFileEntity(FileEntity fileEntity) {
        this.fileEntity = fileEntity;
    }
}
