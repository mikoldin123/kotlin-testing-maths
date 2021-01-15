# kotlin-testing-maths

## RECORD YOUR TERMINAL SCREEN WHILE DOING EACH NUMBER, EXAMPLE (Q#1 1 video, Q#2 1 video), I RECOMMEND USING `asciinema` for recording

##PART 1

1. Create a new branch from master, name if `feat/multiplication` and edit the mathSample.kt file and add a multiplication function push to repo when finsihed. After pushing create a new branch named  `feat/division` using `feat/multiplication` as the parent branch then create a divistion function

** NOTE: No need for the functions to work **

2. Given the following branches `feat/square-root` and `feat/percentage`, fix the conflicts and merge the branches `feat/percentage` with `feat/square-root`. After merging clean up the commit message output should be when `git log` is invoked:

    `feat: Added percentage`
    `feat: Added squareroot`

3. Given the branch `feat/power` do a soft revert removing the committed change `feat: Added pie logger`, Stash the following change and create a new branch `feat/pie-logger` based form the `master` branch.

	- `feat/power` should not have any git log ref of the removed commit changes
