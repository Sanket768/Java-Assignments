/* compute the volume of a cube ,cylinder and cone  using expresssion */
package chapter2;

public class VolumeCalculator {
    public static void main(String[] args ){
        int cubeside = 4;
        int cylinderradius=3;
        int cylinderheight=5;
        int  coneradius=3;
        int coneheight=6;
        int  cubevolume= cubeside* cubeside*cubeside;
        int  cylindervolume = 3* cylinderradius * cylinderradius* cylinderheight;
        int conevolume = (3 * coneradius * coneradius *coneheight)/3;
        System.out.println("Volume of cube:"+ cubevolume);
        System.out.println("volume of cylinder:" +cylindervolume);
        System.out.println("volume of cone:"+conevolume);

    }
}
