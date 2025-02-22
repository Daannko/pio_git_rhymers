package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 *
 * Author: Daannko
 * DefaultRhymersFactory implementuje interfejs Rhymersfactory
 * Klasa posiada cztery gettery nie wymagające argumentych,
 * zwracające nowe obiekty klass DefaultCountingOutRhymer,FIFORhymer,HanoiRhymer
 *
 */
public class DefaultRhymersFactory implements Rhymersfactory {

	//TODO: getStandard and FalseRhymer zwaracją to samo, można jedna usunąć lub zrefaktorować metode.

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
