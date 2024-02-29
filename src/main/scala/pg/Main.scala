package pg

import akka.actor.ActorSystem
import scala.concurrent.ExecutionContext.Implicits.global


object Main extends App {
  val as = ActorSystem("as")
  as.dispatcher.execute(() => () )
  as.whenTerminated.onComplete {
     case _ =>println("as terminated")
  }
  as.terminate()

}
