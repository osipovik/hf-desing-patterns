package oik.designpatterns.facade.hometheater;


public class HomeTheaterFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, CdPlayer cdPlayer, DvdPlayer dvdPlayer, PopcornPopper popcornPopper,
                             Projector projector, Screen screen, TheaterLights theaterLights) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        theaterLights.on();
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setCd(cdPlayer);
        amplifier.setStereoSound();
        cdPlayer.on();
        cdPlayer.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down cdPlayer...");
        amplifier.off();
        amplifier.setCd(cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amplifier.off();
    }
}
