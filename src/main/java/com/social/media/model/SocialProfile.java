package com.social.media.model;

import jakarta.persistence.*;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @OneToOne
    @JoinColumn(name = "social_user_id")
    private SocialUser user;
}
