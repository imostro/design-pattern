package xyz.imostro.c07facade.theaer;

import xyz.imostro.c07facade.theaer.component.*;

/**
 *
 */
public class HomeTheaterFacade {

    /*
        这就是组合，我们会用到的子系统组件全部都在这
     */
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    PopcornPopper popper;

    // 外观将子系统中每一个组件的引用都传入它的构造器中。然后外观把它们赋值给相应的实例变量
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    //负责关闭一切
    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
