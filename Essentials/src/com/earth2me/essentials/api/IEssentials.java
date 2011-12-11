package com.earth2me.essentials.api;

import com.earth2me.essentials.listener.TNTExplodeListener;
import com.earth2me.essentials.perm.IPermissionsHandler;
import com.earth2me.essentials.register.payment.Methods;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;


public interface IEssentials extends Plugin, IReload
{
	void addReloadListener(IReload listener);

	IUser getUser(Object base);

	int broadcastMessage(IUser sender, String message);

	II18n getI18n();

	ISettings getSettings();

	IGroups getGroups();

	IJails getJails();

	IWarps getWarps2();

	IWorth getWorth();

	IItemDb getItemDb();

	IUserMap getUserMap();

	IBackup getBackup();

	IEssentialsEconomy getEconomy();

	World getWorld(String name);

	Methods getPaymentMethod();

	int scheduleAsyncDelayedTask(Runnable run);

	int scheduleSyncDelayedTask(Runnable run);

	int scheduleSyncDelayedTask(Runnable run, long delay);

	int scheduleSyncRepeatingTask(Runnable run, long delay, long period);

	IPermissionsHandler getPermissionsHandler();

	IAlternativeCommandsHandler getAlternativeCommandsHandler();

	void showCommandError(CommandSender sender, String commandLabel, Throwable exception);

	public void reload();

	public IUser getOfflineUser(String string);

	public TNTExplodeListener getTNTListener();
}