package innerclasses

data class Computer(val model: String) {
    inner class HardDisk(val sizeInGb: Int) {
        fun getInfo() = "Installed on ${this@Computer} with $sizeInGb GB"
    }

}


fun main() {
    val hardDisk = Computer("Desktop").HardDisk(1000)
    println(hardDisk.getInfo())
}