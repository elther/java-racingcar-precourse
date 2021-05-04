package nextstep.di;


import nextstep.service.RacingGame;
import nextstep.service.RacingGameService;
import nextstep.service.RacingGameServiceImpl;

public class Injection {
    public static RacingGameService provideRacingGameService(){
        return new RacingGameServiceImpl();
    }

    public static RacingGame provideRacingGame(){
        return new RacingGame(provideRacingGameService());
    };
}
