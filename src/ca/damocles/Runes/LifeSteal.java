package ca.damocles.Runes;

import ca.damocles.Items.ItemType;

public class LifeSteal extends Rune{

	public LifeSteal(int id) {
		super(id);
	}
	
	@Override
	public int getMaxLevel() {
		return 2;
	}
	
	@Override
	public Runes getRune() {
		return Runes.LIFESTEAL;
	}

	@Override
	public String getName() {
		return "LifeSteal";
	}

	@Override
	public ItemType[] getApplicableItems() {
		return new ItemType[]{ ItemType.SWORD };
	}

}
