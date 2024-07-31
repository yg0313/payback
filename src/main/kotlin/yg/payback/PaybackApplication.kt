package yg.payback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaybackApplication

fun main(args: Array<String>) {
	runApplication<PaybackApplication>(*args)
}
