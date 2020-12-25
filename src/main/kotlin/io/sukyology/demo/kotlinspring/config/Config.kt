package io.sukyology.demo.kotlinspring.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {

    @Bean
    fun climber(): Climber{
        return Climber("야호")
    }
    

}

class Climber(private val sound: String){
    
    init {
        println("shouting \" $sound \" ")
    }
}