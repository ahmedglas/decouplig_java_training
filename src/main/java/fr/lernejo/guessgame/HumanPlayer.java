package fr.lernejo.guessgame;

import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    @Override
    public Long askNextGuess() {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Number:" );
        return scanner.nextLong();
    }

    // true means that input value was lower, thus expected value is greater
    @Override
    public void respond( boolean lowerOrGreater ) {
        LoggerFactory.getLogger( "player" ).log( lowerOrGreater ? "Greater" : "Lower" );
    }
}
