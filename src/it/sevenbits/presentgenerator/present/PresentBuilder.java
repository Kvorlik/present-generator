package it.sevenbits.presentgenerator.present;

public class PresentBuilder {
    private String uri;

    public PresentBuilder() {
        this.uri = "";
    }

    public PresentBuilder addPresentPart(final String part) {
        this.uri = uri + part;
        return this;
    }

    public Present build() {
        return new Present(uri);
    }
}
