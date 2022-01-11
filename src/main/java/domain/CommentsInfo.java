package domain;

public class CommentsInfo {
    private int amountCommentsInfo; // количество комментариев
    private boolean expandCommentsInfo; // развернуть комментрии
    private String friendsComment; //прокоментировавщие друзья (иногда в вк показывает посты, где высвечивается коммент друга)
    private String personNameComment; //пользователь написавший комментарий
    private String dateTimeComment; //время и дата комментария
    private int amountLikesComment; // количество лайков на каждом комментарии
    private boolean statusLikeComment; //поставлен ли лайк комментарию владельцем аккаунта, который просматривает
    private int repostsComment; //поделиться комментарием
    private boolean answerComment; //возможность ответить на комментарий
    private boolean canComment; //возможность комментировать

}
