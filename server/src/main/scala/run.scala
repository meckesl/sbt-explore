object run {
  def main(args: Array[String]): Unit = {
    println("running Server code ...")
    println(new imp().getName)
    println(new imp().getAge)
  }

  class imp extends commonTrait {
    override def getName: String = "monsieur le server"
    override def getAge: Int = 54
  }
}