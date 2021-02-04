package it.sevenbits.presentgenerator.present;

public class Present {
    private final String url;

    public Present(final String url) {
        this.url = url;
    }

    public String open() {
        return url;
    }
}
