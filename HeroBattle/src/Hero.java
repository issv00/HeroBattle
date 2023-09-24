public class Hero {

    String name;

    HeroType role;
    int hp;

    public Hero(String name, HeroType role) {
        this.name = name;
        this.role = role;
        if (role.equals(HeroType.TANK)) {
            this.hp = 150;
        } else {
            this.hp = 100;
        }
    }

    public void takeDamage(int damage){
        if(this.role.equals(HeroType.TANK)){
            this.hp = (int) (this.hp - damage * 0.5);
        }
        else if(this.role.equals(HeroType.ASSASSIN)){
            this.hp = this.hp - damage * 2;

        } else {
            this.hp = this.hp - damage;
        }
        checkIfDeadAndPrintStatus();
    }

    private void checkIfDeadAndPrintStatus(){
        if(this.hp <= 0){
            System.out.println(this.name + " died");
        }
        else {
            System.out.println(this.name + " Survived with " + this.hp + " Hp");
        }
    }

    @Override
    public String toString() {
            return "Name: " + this.name + " Role: " + this.role + " Hp: " + this.hp;
    }
}
