object run {
  def main(args: Array[String]): Unit = {
    println("running Client code ...")
    println(new imp().getName)
    println(new imp().getAge)
  }

  class imp extends commonTrait {
    override def getName: String = "monsieur le client"
    override def getAge: Int = 12
  }

}