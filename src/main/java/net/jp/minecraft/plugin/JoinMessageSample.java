package net.jp.minecraft.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 魔女宅用TabListプラグイン
 * MajotakuManager
 * @author syokkendesuyo
 */

public class JoinMessageSample extends JavaPlugin implements Listener {

	/**
     * プラグインが有効になったときに呼び出されるメソッド
     * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
     */

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    //Join時に発生するイベント
    public void onPlyerJoinEvent(PlayerJoinEvent event){
    	//プレイヤー変数にイベント発起者を取得し代入
    	Player player = event.getPlayer();


    	//メッセージを流す
    	player.sendMessage(ChatColor.AQUA + "---------------  " + ChatColor.GOLD +"ようこそ！なんとかサーバ へ！" + ChatColor.AQUA +"  ---------------");
    	player.sendMessage("");
    	player.sendMessage(ChatColor.LIGHT_PURPLE + "- 問題が派生したら？  Twitter @syokkendesuyo");
    	player.sendMessage("");
    	player.sendMessage("");
    	player.sendMessage("- サーバアドレス:あどれすー");
    	player.sendMessage(ChatColor.AQUA + "-----------------------------------------------------------");

    }
}