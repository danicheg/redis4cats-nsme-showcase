## How to reproduce a `java.lang.NoSuchMethodError`

```terminal
❯ sbt run showcase.Redis4CatsNsmeShowcase
[info] welcome to sbt 1.10.7 (Oracle Corporation Java 17.0.8)
[info] loading global plugins from /Users/foobar/.sbt/1.0/plugins
[info] loading settings for project redis4cats-nsme-showcase-build from plugins.sbt...
[info] loading project definition from /Users/foobar/projects/redis4cats-nsme-showcase/project
[info] loading settings for project root from build.sbt...
[info] set current project to redis4cats-nsme-showcase (in build file:/Users/foobar/projects/redis4cats-nsme-showcase/)
[info] running showcase.Redis4CatsNsmeShowcase
[WARNING] IOApp `main` is running on a thread other than the main thread.
This may prevent correct resource cleanup after `main` completes.
This condition could be caused by executing `run` in an interactive sbt session with `fork := false`.
Set `Compile / run / fork := true` in this project to resolve this.

To silence this warning set the system property:
`-Dcats.effect.warnOnNonMainThreadDetected=false`.

Exception in thread "io-compute-1" java.lang.NoSuchMethodError: 'java.lang.Object cats.syntax.ApplyOps$.$times$greater$extension(java.lang.Object, java.lang.Object, cats.Apply)'
	at dev.profunktor.redis4cats.connection.RedisClient$.$anonfun$acquireAndRelease$4(RedisClient.scala:45)
	at cats.effect.kernel.Resource$.$anonfun$make$1(Resource.scala:848)
	at cats.effect.IOFiber.runLoop(IOFiber.scala:343)
	at cats.effect.IOFiber.execR(IOFiber.scala:1362)
	at cats.effect.IOFiber.run(IOFiber.scala:112)
	at cats.effect.unsafe.WorkerThread.run(WorkerThread.scala:702)
java.lang.NoSuchMethodError: 'java.lang.Object cats.syntax.ApplyOps$.$times$greater$extension(java.lang.Object, java.lang.Object, cats.Apply)'
	at dev.profunktor.redis4cats.connection.RedisClient$.$anonfun$acquireAndRelease$4(RedisClient.scala:45)
	at cats.effect.kernel.Resource$.$anonfun$make$1(Resource.scala:848)
	at cats.effect.IOFiber.runLoop(IOFiber.scala:343)
	at cats.effect.IOFiber.execR(IOFiber.scala:1362)
	at cats.effect.IOFiber.run(IOFiber.scala:112)
	at cats.effect.unsafe.WorkerThread.run(WorkerThread.scala:702)
```
