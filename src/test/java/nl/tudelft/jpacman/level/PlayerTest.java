package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    @Test
    void playerShouldBeAliveWhenCreated() {
        PacManSprites sprites = new PacManSprites();
        PlayerFactory factory = new PlayerFactory(sprites);
        Player player = factory.createPacMan();

        assertThat(player.isAlive()).isTrue();
    }

    @Test
    void playerShouldNotBeAliveAfterSetAliveFalse() {
        PacManSprites sprites = new PacManSprites();
        PlayerFactory factory = new PlayerFactory(sprites);
        Player player = factory.createPacMan();

        player.setAlive(false);

        assertThat(player.isAlive()).isFalse();
    }
}
