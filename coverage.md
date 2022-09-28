Statement coverage: Statement coverage refers to executing individual
program statements and observing the outcome.
We say that 100% statement coverage has been
achieved if all the statements have been
executed at least once.The basic problem is to select a few feasible
paths to cover all the nodes of a CFG in order to
achieve the complete statement coverage
criterion. We follow these rules while selecting
paths:

• Select short paths.

• Select paths of increasingly longer length. Unfold
a loop several times if
there is a need.

• Select arbitrarily long, “complex” paths.

Branch coverage: All the diamond nodes have two outgoing
branches. Covering a branch means
selecting a path that includes the branch.
Complete branch coverage means selecting
a number of paths such that every branch is
included in at least one path.

Predicate coverage: If all possible combinations of truth values
of the conditions affecting a selected path
have been explored under some tests,
then we say that predicate coverage has
been achieved.

   