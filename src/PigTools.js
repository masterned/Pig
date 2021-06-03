const getPercentChanceOf1BeingRolledOf = numberOfDice =>
    ((1 - ((5 ** numberOfDice) / (6 ** numberOfDice))) * 100).toFixed(2) + '%'