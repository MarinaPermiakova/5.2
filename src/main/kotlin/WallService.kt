object WallService {
    private var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        id += 1
        post.id = id
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var index = 0
        var res = true

        for (e in posts) {
            index = if (e.id == post.id) posts.indexOf(e)
            else -1
        }
        if (index == -1) res = false
        else {
            post.owner_id = posts[index].owner_id
            post.date = posts[index].date
            posts[index] = post
            res
        }
        return res
    }
}