package cn.nukkit.entity;

import cn.nukkit.Player;

public interface EntityTameable {

    public static final String NAMED_TAG_OWNER = "Owner";

    public static final String NAMED_TAG_OWNER_UUID = "OwnerUUID";

    public static final String NAMED_TAG_SITTING = "Sitting";

    Player getOwner();

    void setOwner(Player player);

    String getOwnerUUID();

    void setOwnerUUID(String uuid);

    boolean isSitting();

    void setSitting(boolean sitting);
}
