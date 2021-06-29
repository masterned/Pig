# TODO
## General
* [x] consolidate players' `takeTurns` methods
* [x] test `Player.addDiceToTotal` method
* [x] remove unused methods and tests in `AbstractPlayer` class
* [x] extract Menus
* [ ] use `maximumRolls` instance variable?
* [ ] __test new methods__
    * [ ] reset Die, DicePair, Dice
    * [ ] resetScores
    * [ ] getGameOverIndicator
* [ ] dynamically size window to content?
* [ ] bind panel disabling to Players' isMyTurn variable?
* [ ] bind chosen player radio buttons to players' isMyTurn variables?

## Random First Player Selection
* [ ] refine random first-player selection implementation
* [ ] __generate write-up__
* [ ] __add web guide entry__

## New Game
* [x] add new game button
* [x] store selected first player
* [x] reset scores & dice on new game
* [x] start game with original first player
* [x] hide start new game button until end of game
* [ ] randomize first player if random initially selected?
* [ ] __generate write-up__
* [ ] __add web guide entry__
* [x] add New Game MenuItem to Game Menu
    * [x] add mnemonic
    * [x] add accelerator
    * [x] implementation
    * [x] disable until game start

# MAYBE?
* [ ] use PopupWindow for instructions & checkbox for opt-in
* [ ] add spinner & message to indicate computer's turn & remove button
* [ ] use ListView to display rolled values
* [ ] change GamePanel goal label to number TextField, pull goal from Field, & disable Field in play
* [ ] use DialogueBox from Game Menu to set goal before game start
* [ ] add reset button to Game Menu
