package showcase

import cats.effect._
import dev.profunktor.redis4cats.Redis
import dev.profunktor.redis4cats.effect.Log.Stdout._

object Redis4CatsNsmeShowcase extends IOApp.Simple {
  def run: IO[Unit] =
    Redis[IO].utf8("redis://127.0.0.1:6379").use { redis =>
      for {
        _ <- redis.set("foo", "123")
        x <- redis.get("foo")
        _ <- redis.setNx("foo", "should not happen")
        y <- redis.get("foo")
        _ <- IO(println(x == y)) // true
      } yield ()
    }
}
