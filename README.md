# Pig

## Notes to Dr Orsega

If anything pops-up, I'll add them here.

## My Rationale

### Why do you have two README files?
> In case you don't have an obvious way of opening the main README (this one), the text "README" has instructions on how to open this file.

### Why not just use a txt file for the README?
> I plan on uploading this repo to github for safe-keeping, and github has a built-in markdown interpreter on all of its project pages. Markdown is also much easier to read.

### Why did you rewrite the same navigation code for each page rather than using a template engine?
> I could not guarantee you have the template engine I select, and creating a build script is beyond the current scope of this class.
> The upload limit may also prohibit build scripts.

### I see commits from another account "masterned," and a pull request.
> That would be my personal account. I needed to work on the project while I was out of town, and I didn't have access to my school computer.

### Adding more methods to some of the models
> In order to properly test the models, I needed to add a few accessors to view the inner state of the objects. This was also necessary in order to implement the abstract method in the AbstractPlayer class without the use of protected instance variables.
