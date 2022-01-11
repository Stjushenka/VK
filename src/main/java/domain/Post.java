package domain;

import java.awt.*;

public class Post {
    private int idUser; // id просматривающего страницу
    private int urlPost; // ссылка на определенную запись, пост
    private int idOwner; // владелец поста (название сообщества или пользователь)
    private int adminWriter; // если сообщество, то в публикации можно указывать авторство с ссылкой)

    private String nameCommunity; //название сообщества (или имя автора поста) с постом
    private int publicationDate; // дата публикации
    private String heading; // заголовок
    private String text; //сам пост и его содержание
    private String buttonRead; // кнопка читать (для того что бы текст развернуть)
    private Image img; // картинка в посте

    private int amountLikesInfo; //количество лайков
    private boolean statusLike; //нравится ли владельцу аккаунта, под которым смотрим пост
    private String personLikesInfo; // каким людям понравилось
    private String friendsLikesInfo; //каким друзьям понравился пост
    private String emoji; //(вместо лайка можно выбрать реакцию)

    private int amountView; // количество просмотров

    private int amountRepostsInfo;
    private boolean statusRepost;
    private String personRepostsInfo;
    private String friendsRepostsInfo;

    private boolean fixedPost; //закреплена ли запись

    private int threeDots;
    private int notInteresting;
    private int saveTab;
    private int complainPost;
    private int informPostsInfo;



    private CommentsInfo commentsInfo;




}
