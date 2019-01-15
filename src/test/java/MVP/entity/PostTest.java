package MVP.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    public void testText(){
        Post post = new Post("Hello");
        assertEquals("Hello", post.getText(), "to be Hello" );
    }

}