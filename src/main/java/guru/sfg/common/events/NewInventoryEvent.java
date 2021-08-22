package guru.sfg.common.events;

import lombok.NoArgsConstructor;

/**
 * Created by @author stopp on 10/08/2021
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

     public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
