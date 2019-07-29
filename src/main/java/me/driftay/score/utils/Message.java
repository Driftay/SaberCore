package me.driftay.score.utils;

import org.bukkit.ChatColor;

public enum Message {

    NO_PERMISSION("no-permission", "&c&l[!] &7You do not have permission."),
    NOT_PLAYER("must-be-player", "&c&l[!] &7You must be a player to use this command!"),
    PLAYER_NOT_FOUND("player-not-found", "&c&l[!] &b%player% &7is not online!"),

    COMMAND_COMBAT_TAG_NONE("combat-tag.none", "&c&l[!] &7You currently have no combat tag :)"),
    COMMAND_COMBAT_TAG_TIME("combat-tag.time", "&c&l[!] &7You are currently combat tagged for &b%time%&7!"),
    SPAWN_TAG_NO_COMMAND("spawn-tag.no-command", "&c&l[!] &7You cannot use this command while combat tagged"),
    SPAWN_TAG_TAGGER("spawn-tag.tagger-message", "&c&l[!] &7You have combat tagged %player%"),
    SPAWN_TAG_OTHER("spawn-tag.other-message", "&c&l[!] &7You have been combat tagged by %player%"),

    ENDERPEARL_ON_COOLDOWN("enderpearl-on-cooldown", "&c&l[!] &7You cannot use another enderpearl for &b%time%&7!"),
    ANVIL_OPENED("anvil-open", "&c&l[!] &7Opening anvil..."),

    LFF_MESSAGE("lff.message", "&c&lLFF &7- &b%player% &7is looking for a faction! &f(Hover)"),
    LFF_COOLDOWN_MESSAGE("lff.cooldown-message", "&c&l[!] &7You cannot use &b/lff &7for another &b%seconds% &7seconds!"),

    RECYCLE_ON("recycle-on", "&c&l[!] &7You have togged recycling on!"),
    RECYCLE_OFF("recycle-off", "&c&l[!] &7You have togged recycling off!"),

    NIGHTVISION_ON("nightvision-on", "&c&l[!] &7You have togged night vision on!"),
    NIGHTVISION_OFF("nighvision-off", "&c&l[!] &7You have togged night vision off!"),

    JELLYLEGS_ON("jellylegs-on", "&c&l[!] &7You have togged jelly legs on!"),
    JELLYLEGS_OFF("jellylegs-off", "&c&l[!] &7You have togged jelly legs off!");

    String config, message;

    Message(String config, String message) {
        this.config = config;
        this.message = ChatColor.translateAlternateColorCodes('&', message);
    }

    public String getConfig() {
        return config;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
