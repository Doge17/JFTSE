package com.ft.emulator.server.database.model.messenger;

import com.ft.emulator.common.model.AbstractBaseModel;
import com.ft.emulator.server.database.model.character.CharacterPlayer;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;

@Getter
@Setter
@Audited
@Entity
public class FriendList extends AbstractBaseModel {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, optional = false)
    private CharacterPlayer characterPlayer;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, optional = false)
    private CharacterPlayer characterPlayerFriend;

    @NotAudited
    @Transient
    private Character serverId;
}