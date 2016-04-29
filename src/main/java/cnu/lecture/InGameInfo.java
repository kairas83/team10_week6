package cnu.lecture;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameInfo {
    public static class Observer {
        private String encryptionKey;

		public String getEncryptionKey() {
			return encryptionKey;
		}
    }

    public static class Participant {
        private String summonerName;

		public String getSummonerName() {
			return summonerName;
		}
    }

    private String platformId;

    private Observer observers;

    private Participant[] participants;

    public String getPlatformId() {
		return platformId;
	}
	public Observer getObservers() {
		return observers;
	}
	public Participant[] getParticipants() {
		return participants;
	}
}
