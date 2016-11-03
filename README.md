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

  - Minimal build configuration, the only declared dependency is ScalaTest. I'll
    accept a pull request for a specs2 branch if you insist :-)
  - Shallow SBT-style `src` layout, no deep package hierarchy directories.
  - Prompts for Scala version, defaulting to latest release.

That's all so far :-)

### Contributing

This sort of thing is always tailored to personal tastes or organization
standards. If you mostly like the way I've done things but have a suggestion or
a tweak, feel free to send a pull request. If I don't like it, no hard feelings,
it's easy to maintain your own just the way you like.

See [Making your own templates].

### License

Copyright 2014-2016 Ches Martin

Licensed under the Apache License, Version 2.0 (the "License"); you may not use
this file except in compliance with the License. You may obtain a copy of the
License at:

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software distributed
under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied.  See the License for the
specific language governing permissions and limitations under the License.

[giter8]: https://github.com/foundweekends/giter8
[templates]: https://github.com/foundweekends/giter8/wiki/giter8-templates
[oss]: https://github.com/joescii/scala-oss.g8
[sbt new]: http://www.scala-sbt.org/0.13/docs/sbt-new-and-Templates.html
[installation]: http://www.foundweekends.org/giter8/setup.html
[SBT]: http://www.scala-sbt.org/
[Making your own templates]: http://www.foundweekends.org/giter8/template.html
