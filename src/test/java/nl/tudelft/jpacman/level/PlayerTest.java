package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests unitaires pour la classe Player.
 */
public class PlayerTest {

    @Test
    void playerShouldBeAliveWhenCreated() {
        PacManSprites sprites = new PacManSprites();
        PlayerFactory factory = new PlayerFactory(sprites);
        Player player = factory.createPacMan();

        assertThat(player.isAlive()).isTrue();
    }
}
