package game;

import java.time.Year;
import java.util.Scanner;


public class game {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("请输入您的昵称：");
        name = in.nextLine();
        System.out.println("请输入您的攻击力：");
        int bit = in.nextInt();
        System.out.println("请输入您的生命值：");
        int ablood = in.nextInt();
        int blood =ablood;
        System.out.println("请输入您的防御力：");
        int wall = in.nextInt();
        System.out.println("请输入战斗回合数：");
        int a = in.nextInt();
        System.out.println("是否需要购买装备(1.需要 2.不需要)：");
        int b = in.nextInt();
        String B = in.nextLine();
        if (b == 1) {
            int buy = 1;
            while (buy == 1) {
                System.out.println("1.木剑 2.铁剑 3.布衣 4.锁子甲 5.退出商店");
                System.out.println("chose number:");
                String q = in.nextLine();
                String Q = in.nextLine();
                switch (q) {
                    case "1":
                        bit += 50;
                        System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                        break;
                    case "2":
                        bit += 100;
                        System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                        break;
                    case "3":
                        wall += 50;
                        System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                        break;
                    case "4":
                        wall += 100;
                        System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                        break;
                    case "5":
                        buy = 0;
                        break;
                    default:
                        System.out.println("输入错误,请重新输入！");
                        break;
                }
            }
            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
        } else if (b == 2) {
            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
        }
        System.out.println("请输入怪物的名称：");
        String animalname = in.nextLine();
        System.out.println("请输入怪物的攻击力：");
        int animalbit = in.nextInt();
        System.out.println("请输入怪物的生命值：");
        int animalblood = in.nextInt();
        System.out.println("请输入怪物的防御力：");
        int animalwall = in.nextInt();
        String v = in.nextLine();
        int i = 1;
        do {

            do
            {
                int buy1 = 1;
                do
                {
                    System.out.println("第" + i + "回合：");
                    System.out.println("请选择您的攻击方式：");
                    System.out.println("1.普通攻击 2.随机伤害 3.追风箭 4.万剑归宗 5.大补丸（随机生命恢复）6.结束该回合");
                    String c = in.nextLine();
                    int k = (int)(Math.random() * 1000);
                    switch (c)
                    {
                        case "1":
                            if ((int) k % 3 == 0 || (int) k % 5 == 0) {
                                System.out.println("怪物闪避");
                            } else {
                                animalblood -= bit;
                                System.out.println("玩家使用普通攻击对怪物造成" + bit + "点伤害");
                            }
                            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                            System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                            if (blood <= 0)
                            {
                                System.out.println("怪物 WIN");
                                break;
                            }
                            else if (animalblood <= 0)
                            {
                                System.out.println("YOU WIN");
                                break;
                            }
                            i++;
                            break;
                        case "2":
                            if ((int) k % 3 == 0 || (int) k % 5 == 0) {
                                System.out.println("怪物闪避");
                            } else {
                                animalblood -= (bit + ((int) (Math.random() * 100)));
                                System.out.println("玩家使用随机伤害对怪物造成" + (bit + (int) (Math.random() * 100)) + "点伤害");

                            }
                            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                            System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                            if (blood <= 0)
                            {
                                System.out.println("怪物 WIN");
                                break;
                            }
                            else if (animalblood <= 0)
                            {
                                System.out.println("YOU WIN");
                                break;
                            }
                            i++;
                            break;
                        case "3":
                            if ((int) k % 3 == 0 ||(int) k % 5 == 0) {
                                System.out.println("怪物闪避");
                            } else {
                                animalblood -= (bit + 20);
                                System.out.println("玩家追风箭对怪物造成" + (bit + (bit + 20) + "点伤害"));
                            }
                            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                            System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                            if (blood <= 0)
                            {
                                System.out.println("怪物 WIN");
                                break;
                            }
                            else if (animalblood <= 0)
                            {
                                System.out.println("YOU WIN");
                                break;
                            }
                            i++;
                            break;
                        case "4":
                            if ((int) k % 3 == 0 ||(int) k % 5 == 0) {
                                System.out.println("怪物闪避");
                            } else {
                                animalblood -= (bit + 50);
                                System.out.println("玩家使用万剑归宗对怪物造成" + (bit + (bit + 50) + "点伤害"));
                            }
                            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                            System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                            if (blood <= 0)
                            {
                                System.out.println("怪物 WIN");
                                break;
                            }
                            else if (animalblood <= 0)
                            {
                                System.out.println("YOU WIN");
                                break;
                            }
                            i ++;
                            break;
                        case "5":
                            blood += (int) k;
                            System.out.println("玩家使用大补丸恢复"+(int)k+"生命值");
                            System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit+ "您目前的防御力" + wall);
                            System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                            if (blood <= 0)
                            {
                                System.out.println("怪物 WIN");
                                break;
                            }
                            else if (animalblood <= 0)
                            {
                                System.out.println("YOU WIN");
                                break;
                            }
                            i++;
                            break;

                        case "6":
                            i ++;
                            break;
                        default:
                            System.out.println("输入数据错误，请重新输入!!!");
                            buy1 = 0;
                            break;
                        }
                    }while (buy1 == 1 && blood>= 0 && animalblood>=0);
                if(blood <= 0 ||animalblood<=0)
                {
                    break;
                }
                    System.out.println("轮到怪物回合，由怪物开始攻击：");
                   int e = (int) (Math.random()*1000)% 10;
                   if (0 <= e && e <= 6) {
                    blood -= animalbit;
                    System.out.println("怪物使用普通攻击对玩家造成" + animalbit + "点伤害");
                    System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                    System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                       if (blood <= 0)
                       {
                           System.out.println("怪物 WIN");
                           break;
                       }
                       else if (animalblood <= 0)
                       {
                           System.out.println("YOU WIN");
                           break;
                       }
                    break;
                } else if (7 <= e && e <= 8) {
                    blood -= (animalbit + 10);
                    System.out.println("怪物使用恶龙吐息对玩家造成" + (animalbit + 10) + "点伤害");
                    System.out.println("您目前的生命：" + blood +  "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                    System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);
                       if (blood <= 0)
                       {
                           System.out.println("怪物 WIN");
                           break;
                       }
                       else if (animalblood <= 0)
                       {
                           System.out.println("YOU WIN");
                           break;
                       }
                    break;
                } else {
                    animalblood += 200;
                    System.out.println("怪物恢复200生命值");
                    System.out.println("您目前的生命：" + blood + "您目前的攻击力：" + bit + "您目前的防御力" + wall);
                    System.out.println("怪物目前的生命：" + animalblood + "怪物目前的攻击力：" + animalbit + "怪物目前的防御力" + animalwall);

                }
            } while (blood >= 0 || animalblood >= 0);
            break;
        }while( i <= a);

    }
}

