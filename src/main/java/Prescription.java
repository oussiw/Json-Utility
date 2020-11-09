import java.io.Serializable;
import java.util.Date;


public class Prescription implements Serializable {

    private String title;

    private String originalText;

    private String translatedText;

    private Date dateOfCreation;

    private String resultUri;

    private StringBuilder builder;


    public StringBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(StringBuilder builder) {
        this.builder = builder;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getResultUri() {
        return resultUri;
    }

    public void setResultUri(String resultUri) {
        this.resultUri = resultUri;
    }

    public Prescription(String title, String originalText, String translatedText, Date dateOfCreation) {
        this.title = title;
        this.originalText = originalText;
        this.translatedText = translatedText;
        this.dateOfCreation = dateOfCreation;
    }

    public Prescription(String title, Date dateOfCreation) {
        this.title = title;
        this.dateOfCreation = dateOfCreation;
    }

    public Prescription(String title, String resultUri) {
        this.title = title;
        this.resultUri = resultUri;
    }

    public Prescription(){}
}
