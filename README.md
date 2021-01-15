# kotlin-testing-maths

## RECORD YOUR SCREEN WHILE DOING EACH NUMBER, EXAMPLE (Q#1 1 video, Q#2 1 video)


1. Create a new branch from master, name if `feat/multiplication` and edit the mathSample.kt file and add a multiplication function push to repo when finsihed. After pushing create a new branch named  `feat/division` using `feat/multiplication` as the parent branch then create a division function then push to repo.  (CREATE A PULL REQUEST)

** NOTE: No need for the functions to work **

2. Given the following branches `feat/square-root` and `feat/percentage`, fix the conflicts and merge the branches `feat/percentage` with `feat/square-root`. After merging clean up the commit message output should be when `git log` is invoked:

    `feat: Added percentage`
    `feat: Added squareroot`

3. Given the branch `feat/power` do a soft reset removing the committed change `feat: Added pie logger`, Stash the following change and create a new branch `feat/pie-logger` based form the `master` branch. (CREATE A PULL REQUEST)

	- `feat/power` should not have any git log ref of the removed commit changes
	
4. Last tasks is to merge all the PRs created to master and create a tag `v.1.0.0` using git flow
