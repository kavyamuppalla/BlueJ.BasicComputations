 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        angle =  angle % 360;
        angle = (angle + 360) % 360;
        
    
        return angle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        integer =  Math.floorMod(integer, 360);
        integer = Math.floorMod((integer + 360),360);
         
        return integer;
    }

    public static void main(String[] args){

    }
}
