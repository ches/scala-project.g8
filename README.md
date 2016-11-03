Scala Project Templates
-----------------------

Templates for generating project skeletons with `sbt new`, via [giter8]. There
are [many others to choose from][templates], I wanted something more minimal
than most of those as the default, with more specific or opinionated templates
available on branches.

For an open source project, I recommend having a look at
[joescii/scala-oss][oss] for extra features like publishing Scaladoc to GitHub
Pages, publishing artifacts for multiple Scala versions to Maven Central, etc.

### Usage ###

Since sbt 0.13.13, you can simply [use `sbt new`][sbt new]:

    $ sbt new ches/scala-project

You will be prompted for parameters such as your project name.

If for some reason you can't run sbt 0.13.13, you can use giter8 directly.
With Homebrew on Mac OS X, it's convenient to `brew install giter8`. Otherwise,
see the [installation].

Then, simply invoke `g8` to generate a project:

    $ g8 ches/scala-project

### Available Templates ###

giter8 supports installing alternative templates from branches of a repository.
Templates available here are described below.

#### Default

    $ g8 ches/scala-project

The default is a minimal template for a basic [SBT] project. Features:

  - Minimal "bare" build configuration, the only declared dependency is
    ScalaTest. I'll accept a pull request for a specs2 branch if you insist :-)
  - Shallow SBT-style `src` layout, no deep package hierarchy directories.
  - Prompts for Scala version, defaulting to latest release.
  - `spec` [scaffold] to generate stub ScalaTest files. Enable the
    `sbt-g8-scaffold` sbt plugin to use it with `g8Scaffold spec`.

    Edit defaults in `.g8/spec/default.properties` after the first use to spare
    yourself from entering project details like package name repetitively.

That's all so far :-)

### Contributing

This sort of thing is always tailored to personal tastes or organization
standards. If you mostly like the way I've done things but have a suggestion or
a tweak, feel free to send a pull request. If I don't like it, no hard feelings,
it's easy to maintain your own just the way you like.

See [Making your own templates].

### License

This software template is placed in the public domain according to Creative
Commons [CC0 1.0]. See `LICENSE.txt`.

[giter8]: https://github.com/foundweekends/giter8
[templates]: https://github.com/foundweekends/giter8/wiki/giter8-templates
[oss]: https://github.com/joescii/scala-oss.g8
[sbt new]: http://www.scala-sbt.org/0.13/docs/sbt-new-and-Templates.html
[installation]: http://www.foundweekends.org/giter8/setup.html
[SBT]: http://www.scala-sbt.org/
[scaffold]: http://www.foundweekends.org/giter8/scaffolding.html
[Making your own templates]: http://www.foundweekends.org/giter8/template.html
[CC0 1.0]: https://creativecommons.org/publicdomain/zero/1.0/
