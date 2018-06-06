package commision.core.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pliki_naglowki")
//@SequenceGenerator(sequenceName="PLIKI_NAGLOWKI_ID_SEQ", name="pliki_naglowki_seq", allocationSize = 1)
public class FileEntity {

    @Id
    @NotNull
    @Column(name = "pn_id")
//    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="pliki_naglowki_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "pn_nazwa_pliku")
    private String name;
    @Column(name = "pn_typ_pliku")
    private Long type;
    @Column(name = "pn_data")
    @Temporal(TemporalType.DATE)
    private Date date;
//    @Column(name = "pn_czas_bazy", columnDefinition = "date default sysdate")
    private Date timeDatabase;
    @OneToMany(mappedBy = "fileEntity")
    private List<BaseImportFileEntity> fileData;

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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTimeDatabase() {
        return timeDatabase;
    }

    public void setTimeDatabase(Date timeDatabase) {
        this.timeDatabase = timeDatabase;
    }

    public List<BaseImportFileEntity> getFileData() {
        return fileData;
    }

    public void setFileData(List<BaseImportFileEntity> fileData) {
        this.fileData = fileData;
    }
}
