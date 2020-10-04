package xyz.imostro.c01strategy.game.role;

import xyz.imostro.c01strategy.game.behavior.weapon.WeaponBehavior;

/**
 * 游戏角色抽象类
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void fight();   // 抽象方法,供具体的角色实现

    public void weapon(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
