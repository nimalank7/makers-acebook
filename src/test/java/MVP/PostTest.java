package MVP.Model;

import MVP.Model.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PostTest {

    @Test
    public void testID(){
        Post post = new Post(1, 2, "Hello");
        assertEquals(1, post.id,  "Id to be 1");

    }

    @Test
    public void testUserId(){
        Post post = new Post(1, 2, "Hello");
        assertEquals(2, post.user_id, "userId to be 1");
    }

    @Test
    public void testText(){
        Post post = new Post(1, 2, "Hello");
        assertEquals("Hello", post.text, "to be Hello" );
    }

}