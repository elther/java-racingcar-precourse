package nextstep;

import nextstep.di.Injection;
import nextstep.service.RacingGame;

public class main {
    public static void main(String[] args){
        RacingGame racingGame = Injection.provideRacingGame();
        racingGame.run();
        racingGame.getWinner();
    }
}
