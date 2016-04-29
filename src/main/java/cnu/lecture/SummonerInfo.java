package cnu.lecture;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by tchi on 2016. 4. 25..
 */
public class SummonerInfo {
    @Getter @Setter
    private String id;

    public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Getter @Setter
    private String name;
}
