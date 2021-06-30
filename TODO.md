# TODO
## General
* [x] consolidate players' `takeTurns` methods
* [x] test `Player.addDiceToTotal` method
* [x] remove unused methods and tests in `AbstractPlayer` class
* [x] extract Menus
* [ ] __test new methods__
    * [x] reset
        * [x] Die
        * [x] DicePair
    * [x] resetScores
    * [x] clearDiceValues
    * [ ] resetDice
    * [x] getGameOverIndicator
    * [x] rollDice

## Random First Player Selection
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

## Display list of rolled values
* [x] store rolls in ObservableArrayList
* [x] use ListView to display rolled values
* [x] reset list on new game
* [x] create AbstractPlayerPane for DRYness
* [x] resize ListView & Window for optimal display
* [x] always show most recent roll
* [x] replace `getDiceValues` method
* [ ] reset list on each turn?
* [ ] __generate write-up__
* [ ] __add web guide entry__

## instructions display?
* [ ] use PopupWindow for instructions & checkbox for opt-in

## simulate ComputerPlayer's turn?
* [ ] add spinner & message to indicate computer's turn
* [ ] remove button

## allow user to set Game goal?
* [ ] change GamePanel goal label to number TextField, pull goal from Field, & disable Field in play
* [ ] use DialogueBox from Game Menu to set goal before game start

# MAYBE?
* [ ] use `maximumRolls` instance variable?
* [ ] dynamically size window to content?
* [ ] bind panel disabling to Players' isMyTurn variable?
* [ ] bind chosen player radio buttons to players' isMyTurn variables?
