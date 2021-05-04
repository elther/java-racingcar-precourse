package nextstep.service;


import nextstep.domain.car.Winner;

public interface RacingGameService {
    void inputGameInformation();
    void start();
    void lap(int lap);
    Winner getWinner();
    void print(StringBuffer str);
}
