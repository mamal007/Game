package ir.ac.kntu.gamelogic;

import java.util.Scanner;

public class Gun {
    private int collisionProbability;
    private int damage;
    private Bullet bullet;
    private GunName gunName;

    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("choose the gun: \n1. ASSAULTRIFLE 2. SNIPERRIFLE\n");
        int gun = scanner.nextInt();
        if (gun == 1) {
            setGunName(GunName.ASSAULTRIFLE);
            damage = 10;
            collisionProbability = 50;
        }
        if (gun == 2) {
            setGunName(GunName.SNIPERRIFLE);
            damage = 20;
            collisionProbability = 60;
            System.out.println("zoom:\n 1. activate 2. deactivate");
            int zoom = scanner.nextInt();
            if (zoom == 1) {
                collisionProbability += (RandomHelper.nextInt(2)+1)*5;
            }
        }
        System.out.print("choose the caliber: \n1. 5mm 2. 7mm\n");
        int caliber = scanner.nextInt();
        if (caliber == 1) {
            setBullet(Bullet.CALIBER5);
            collisionProbability += 15;
        }
        if (caliber == 2) {
            setBullet(Bullet.CALIBER7);
            collisionProbability -= 10;
            damage += 10;
        }
    }

    public int getCollisionProbability() {
        return collisionProbability;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "collisionProbability=" + collisionProbability +
                ", damage=" + damage +
                ", bullet=" + bullet +
                ", gunName=" + gunName +
                '}';
    }

    public void setCollisionProbability(int collisionProbability) {
        this.collisionProbability = collisionProbability;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public GunName getGunName() {
        return gunName;
    }

    public void setGunName(GunName gunName) {
        this.gunName = gunName;
    }
}
