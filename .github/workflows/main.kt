fun main() {
    val original = Post(
        id = 1,
        owner_id = 111,
        from_id = 21,
        created_by = 22,
        date = 22,
        text = "Hello, world!",
        reply_owner_id = 33,
        reply_post_id = 33,
        friends_only = 1,
        comments = Comments(
            count = 9845,
            can_post = false,
            groups_can_post = true,
            can_close = true,
            can_open = true
        ),
        copyright = "Piotr",
        likes = Likes(
            count = 2,
            user_likes = true,
            can_like = true,
            can_publish = true
        ),
        reposts = Reposts(
            count = 3,
            user_reposted = false
        ),
        views = Views(
            count = 3458
        ),
        post_type = "message",
        post_source = null,
        geo = null,
        signer_id = 65,
        copy_history = arrayOf(2, 4),
        can_pin = true,
        can_delete = true,
        can_edit = true,
        is_pinned = true,
        marked_as_ads = true,
        is_favorite = true,
        postponed_id = 44
    )

    val service = WallService
    service.add(original)

}
