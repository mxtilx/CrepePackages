package emu.lunarcore.game.inventory;

import dev.morphia.annotations.Entity;
import emu.lunarcore.data.excel.RelicSubAffixExcel;
import emu.lunarcore.proto.RelicAffixOuterClass.RelicAffix;
import emu.lunarcore.util.Utils;
import lombok.Getter;

@Getter
@Entity(useDiscriminator = false)
public class GameItemSubAffix {
    private int id; // Affix id
    private int count;
    private int step;
	
    @Deprecated
    public GameItemSubAffix() {
        // Morphia only!
    }

    public GameItemSubAffix(RelicSubAffixExcel subAffix) {
        this(subAffix, 1);
    }
    
    public GameItemSubAffix(RelicSubAffixExcel subAffix, int count) {
        this.id = subAffix.getAffixID();
        this.count = count;
        this.step = Utils.randomRange(0, count * subAffix.getStepNum());
    }

    public void incrementCount(int stepNum) {
        this.count += 1;
        this.step += Utils.randomRange(0, stepNum); 
    }

    public RelicAffix toProto() {
        var proto = RelicAffix.newInstance()
                .setAffixId(this.id)
                .setCnt(this.count)
                .setStep(this.step);
        
        return proto;
    }
}