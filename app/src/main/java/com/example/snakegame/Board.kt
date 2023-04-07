package com.example.snakegame

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.snakegame.ui.theme.DarkGreen
import com.example.snakegame.ui.theme.Shapes

@Composable
fun Board(state: State) {
    BoxWithConstraints(Modifier.padding(16.dp)) {
        val tileSize: Dp = maxWidth / Game.BOARD_SIZE

        Box(
            modifier = Modifier
                .size(maxWidth)
                .border(2.dp, DarkGreen)
        )
        Box(
            modifier = Modifier
                .offset(
                    x = tileSize * state.food.first,
                    y = tileSize * state.food.second
                )
                .size(tileSize)
                .background(DarkGreen, CircleShape)
        )
        state.snake.forEach {
            Box(
                modifier = Modifier
                    .offset(
                        x = tileSize * it.first,
                        y = tileSize * it.second
                    )
                    .size(tileSize)
                    .background(DarkGreen, Shapes.small)
            )
        }
    }
}