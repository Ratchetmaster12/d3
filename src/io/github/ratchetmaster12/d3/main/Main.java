package io.github.ratchetmaster12.d3.main;

import org.bukkit.plugin.java.JavaPlugin;

public final Main extends JavaPlugin{

    public HashMap<UUID, ArrayList<Skill>> skillmap;

    @Override
    public void onEnable(){
        this.saveDefaultConfig();
    }
    
    public void reload(){
        this.reloadConfig();
    }
    
    public ArrayList<Skill> getSkill(Player){
        return skillmap.get(Player.getUUID());
    }
    
    public ArrayList<Skill>
    
    
}
